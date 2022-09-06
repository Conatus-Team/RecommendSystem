package conatus.domain.middle;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import conatus.domain.entity.user.RecommendUserInfo;
import conatus.domain.event.group.GroupJoined;
import conatus.domain.event.user.SignedUp;
import conatus.domain.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/recommend/connect_middle")
public class GetMiddleController {
    public final UserService userService;
//    public final MemberService memberService;
//    public final RecommendService recommendService;
//
//
    // 구독 : (Auth)회원가입
    @PostMapping("/SignedUp")
    public void postUser(@RequestBody SignedUp signedUp) {
        if (!signedUp.validate()) return;
        userService.postUser(signedUp);

    }

    @PostMapping("/GroupJoined")
    public void sendGroupJoined(@RequestBody GroupJoined groupJoined) {
        if (!groupJoined.validate()) return;
        GroupJoined event = groupJoined;
        System.out.println(
                "\n\n##### listener UpdateUserInfo : " +
                        groupJoined.toJson() +
                        "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.updateUserInfo(event);
    }


}
