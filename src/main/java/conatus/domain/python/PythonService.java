package conatus.domain.python;


import conatus.domain.group.GroupService;
import conatus.domain.hobby.HobbyService;
import conatus.domain.hobby.dto.RecommendedItemLongDto;
import conatus.domain.hobby.dto.RecommendedItemStringDto;
import conatus.domain.lecture.LectureService;
import conatus.domain.middle.Url;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.Collections;

@RestController
@Transactional
@RequiredArgsConstructor
public class PythonService {
    private final HobbyService hobbyService;
    private final LectureService lectureService;
    private final GroupService groupService;

    // url에 GET 요청하고 returnType 타입의 데이터 받아오기
    public <T> ResponseEntity<T> receive(String url, Class<T> returnType) {

        // header
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<Object> entity = new HttpEntity<>(headers);

        // send
        RestTemplate rt = new RestTemplate();
        ResponseEntity<T> response = rt.exchange(
                url, //{요청할 서버 주소}
                HttpMethod.GET, //{요청할 방식}
                entity, // {요청할 때 보낼 데이터}
                returnType // {반환 타입}
        );

        return response;
    }

    // 사용자별 추천 취미, 추천 강의, 추천 그룹 저장
    public void saveRecommendedItems(Long userId){

        System.out.println("============================================");
        System.out.println("===사용자별 추천 취미, 추천 강의, 추천 그룹 저장===");
        System.out.println("userId = " + userId);
        System.out.println("============================================");
        System.out.println("============================================");

        // 취미
        ResponseEntity<RecommendedItemStringDto[]> responseHobby = receive(Url.PYTHON_HOBBY.getUrl() + userId, RecommendedItemStringDto[].class);
        RecommendedItemStringDto[] recommendedHobbies = responseHobby.getBody();
        // recommendedUserHobbies[0].getId()
        hobbyService.saveHobby(userId, recommendedHobbies[0].getRecommend());


        // 강의
        ResponseEntity<RecommendedItemLongDto[]> responseLecture = receive(Url.PYTHON_LECTURE.getUrl() + userId, RecommendedItemLongDto[].class);
        RecommendedItemLongDto[] recommendedLectures = responseLecture.getBody();
        // recommendedUserHobbies[0].getId()
        lectureService.saveLecture(userId, recommendedLectures[0].getRecommend());


        // 그룹
        ResponseEntity<RecommendedItemLongDto[]> responseGroup = receive(Url.PYTHON_GROUP.getUrl() + userId, RecommendedItemLongDto[].class);
        RecommendedItemLongDto[] recommendedGroups = responseGroup.getBody();
        // recommendedUserHobbies[0].getId()
        groupService.saveGroup(userId, recommendedGroups[0].getRecommend());



    }
}
