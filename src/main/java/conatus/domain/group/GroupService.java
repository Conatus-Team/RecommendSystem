package conatus.domain.group;

import conatus.RecommendSystemApplication;
import conatus.domain.group.dto.RecommendedGroupDto;
import conatus.domain.group.dto.RecommendedItemListDto;
import conatus.domain.group.event.GroupDetailShown;
import conatus.domain.group.event.GroupJoined;
import conatus.domain.group.repository.RecommendedGroupRepository;
import conatus.domain.group.repository.UserGroupRepository;
import conatus.domain.lecture.RecommendedLecture;
import conatus.domain.lecture.respotisory.RecommendedLectureRepository;
import conatus.domain.middle.PostMiddleService;
import conatus.domain.middle.Url;
import conatus.domain.user.User;
import conatus.domain.user.event.SignedUp;
import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
@Service
public class GroupService {
    @Autowired
    RecommendedGroupRepository recommendedGroupRepository;


    private final UserGroupRepository userGroupRepository;
    private final PostMiddleService postMiddleService;


    // 그룹 가입
    public void updateUserGroup(GroupJoined groupJoined) {
        Optional<UserGroup> existMember = userGroupRepository.findByGroupIdAndUserId(groupJoined.getMember().getGroupId(),
                groupJoined.getMember().getUserId());


        // 없거나, 있는데 registered가 false인 경우
        if (!existMember.isPresent()){
            // 새로운 UserGroup 생성
            // TODO : builder에 hobby 추가하기
            UserGroup newUserGroup = new UserGroup();
            newUserGroup = newUserGroup.builder()
                    .userId(groupJoined.getMember().getUserId())
                    .groupId(groupJoined.getMember().getGroupId())
                    .registered(true)
                    .clicked(1)
                    .uploadContent(0)
                    .uploadPictures(0)
                    .build();

            userGroupRepository.save(newUserGroup);
        }
        else if (existMember.get().getRegistered() == false){
            // registered True
            existMember.get().setRegistered(true);
            existMember.get().setClicked(existMember.get().getClicked() + 1);

            userGroupRepository.save(existMember.get());
        }
        else {
            // 가입된 상태에서 가입 버튼 누른 경우
        }


    }

    // 그룹 디테일 클릭 저장
    public void updateGroupDetail(GroupDetailShown groupDetailShown) {
        Optional<UserGroup> isClicked = userGroupRepository.findByGroupIdAndUserId(
                groupDetailShown.getGroupId(),
                groupDetailShown.getUserId()
        );

        // 처음 클릭했다면
        if(!isClicked.isPresent()) {
            UserGroup newUserGroup = new UserGroup();
            newUserGroup = newUserGroup.builder()
                    .userId(groupDetailShown.getUserId())
                    .groupId(groupDetailShown.getGroupId())
                    .registered(false)
                    .clicked(1)
                    .uploadContent(0)
                    .uploadPictures(0)
                    .build();

            userGroupRepository.save(newUserGroup);
        }
        else {
            // 이미 클릭한 적 있다면 클릭+1
            isClicked.get().setClicked(isClicked.get().getClicked()+1);
            userGroupRepository.save(isClicked.get());

        }

    }


    // recommended_group 저장
    public void saveGroup(Long userId, Long[] recommendedGroups) {

        for(Long groupId : recommendedGroups) {
            RecommendedGroup recommendedGroup = new RecommendedGroup(userId, groupId);
            recommendedGroupRepository.save(recommendedGroup);
        }

    }

    // Group 서버로 추천 그룹 전송
    public RecommendedItemListDto sendRecommendedGroup(Long userId) {
        List<RecommendedGroup> recommendedGroupList = recommendedGroupRepository.findByUserId(userId);

        List<RecommendedGroupDto> recommendedGroupDtoList = new ArrayList<>();
        for(RecommendedGroup recommendedGroup : recommendedGroupList) {
            RecommendedGroupDto recommendedGroupDto = new RecommendedGroupDto(userId, recommendedGroup.getGroupId());
            recommendedGroupDtoList.add(recommendedGroupDto);
        }
        RecommendedItemListDto recommendedItemListDto = new RecommendedItemListDto(recommendedGroupDtoList);

        System.out.println("=========================================================");
        System.out.println("================Group 서버로 추천 강의 전송==================");
        System.out.println(recommendedItemListDto.toString());
        System.out.println("=========================================================");
        System.out.println("=========================================================");

        postMiddleService.sendTo(Url.WITHOUT_MIDDLE_GROUP.getUrl(), recommendedItemListDto);

        return recommendedItemListDto;
    }


}
