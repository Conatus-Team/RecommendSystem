package conatus.domain.python;


import conatus.domain.group.GroupService;
import conatus.domain.hobby.HobbyService;
import conatus.domain.hobby.dto.RecommendedItemLongDto;
import conatus.domain.hobby.dto.RecommendedItemStringDto;
import conatus.domain.lecture.LectureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@Transactional
@RequiredArgsConstructor
@RequestMapping(value="/recommend")
public class PythonController {
    String pythonUrl = "http://13.125.24.24:8080";
    String hobbyUrl = pythonUrl + "/recommend/hobby/contents/";
    String lectureUrl = pythonUrl + "/recommend/lecture/coldstart/";
    String groupUrl = pythonUrl + "/recommend/group/contents/";

    private final PythonService pythonService;
    private final HobbyService hobbyService;
    private final LectureService lectureService;
    private final GroupService groupService;

    @GetMapping("/pythonHello")
    public String helloPython() {
        return pythonService.receive(pythonUrl, String.class).getBody();
    }


    @GetMapping("/python/{userId}")
    public void getRecommendHobby(@PathVariable Long userId) {
        // 취미
        ResponseEntity<RecommendedItemStringDto[]> responseHobby = pythonService.receive(hobbyUrl + userId, RecommendedItemStringDto[].class);
        RecommendedItemStringDto[] recommendedHobbies = responseHobby.getBody();
        // recommendedUserHobbies[0].getId()
        hobbyService.saveHobby(userId, recommendedHobbies[0].getRecommend());

        // 강의
        ResponseEntity<RecommendedItemLongDto[]> responseLecture = pythonService.receive(lectureUrl + userId, RecommendedItemLongDto[].class);
        RecommendedItemLongDto[] recommendedLectures = responseLecture.getBody();
        // recommendedUserHobbies[0].getId()
        lectureService.saveLecture(userId, recommendedLectures[0].getRecommend());
        
        
        // 그룹
        ResponseEntity<RecommendedItemLongDto[]> responseGroup = pythonService.receive(groupUrl + userId, RecommendedItemLongDto[].class);
        RecommendedItemLongDto[] recommendedGroups = responseGroup.getBody();
        // recommendedUserHobbies[0].getId()
        groupService.saveGroup(userId, recommendedGroups[0].getRecommend());


    }

}
