package conatus.domain.group;

import conatus.RecommendSystemApplication;
import conatus.domain.group.event.GroupJoined;
import conatus.domain.group.repository.RecommendedGroupRepository;
import conatus.domain.group.repository.UserGroupRepository;
import conatus.domain.lecture.RecommendedLecture;
import conatus.domain.lecture.respotisory.RecommendedLectureRepository;
import conatus.domain.user.User;
import conatus.domain.user.event.SignedUp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class GroupService {
    @Autowired
    RecommendedGroupRepository recommendedGroupRepository;


    private final UserGroupRepository userGroupRepository;



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



    // recommended_group 저장
    public void saveGroup(Long userId, Long[] recommendedGroups) {

        for(Long groupId : recommendedGroups) {
            RecommendedGroup recommendedGroup = new RecommendedGroup(userId, groupId);
            recommendedGroupRepository.save(recommendedGroup);
        }

    }

}
