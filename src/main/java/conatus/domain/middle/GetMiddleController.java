package conatus.domain.middle;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import conatus.domain.group.GroupService;
import conatus.domain.group.event.GroupDetailShown;
import conatus.domain.group.event.GroupJoined;
import conatus.domain.group.event.GroupSearched;
import conatus.domain.hobby.HobbyService;
import conatus.domain.hobby.dto.RecommendedItemLongDto;
import conatus.domain.hobby.dto.RecommendedItemStringDto;
import conatus.domain.lecture.LectureService;
import conatus.domain.python.PythonService;
import conatus.domain.user.RecommendUserInfo;
import conatus.domain.user.event.SignedUp;
import conatus.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/recommend/connect_middle")
public class GetMiddleController {
    public final UserService userService;
    public final GroupService groupService;
//    public final MemberService memberService;
//    public final RecommendService recommendService;

    //  ******************************
    //  Middle 서버로 부터 구독하는 이벤트
    //  ******************************

    // (Auth)회원가입
    @PostMapping("/SignedUp")
    public void postUser(@RequestBody SignedUp signedUp) {
        if (!signedUp.validate()) return;
        userService.postUser(signedUp);

    }

    // (Group)그룹가입
    @PostMapping("/GroupJoined")
    public void postGroupJoined(@RequestBody GroupJoined groupJoined) {
        if (!groupJoined.validate()) return;
        GroupJoined event = groupJoined;
        System.out.println(
                "\n\n##### listener UpdateUserInfo : " +
                        groupJoined.toJson() +
                        "\n\n"
        );

        // UserGroup에 registered를 true로 바꾸기
        groupService.updateUserGroup(event);

    }


    // (Lecture) 강의 자세히보기
    // (Lecture) 강의 검색
    // (Lecture) 강의 찜하기

    // (Group)그룹 검색
    // (Group)그룹 클릭한 게시물

    // (Group)그룹 디테일 클릭
//    @PostMapping("/GroupDetailShown")
//    public void postGroupDetailShown(@RequestBody GroupDetailShown groupDetailShown) {
//        if (!groupDetailShown.validate()) return;
//        GroupDetailShown event = groupDetailShown;
//        System.out.println(
//                "\n\n##### listener postGroupDetailShown : " +
//                        groupDetailShown.toJson() +
//                        "\n\n"
//        );
//
//        // UserGroup에 클릭 횟수 증가
//        groupService.updateGroupDetail(event);
//
//    }



}
