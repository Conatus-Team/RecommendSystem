package conatus.infra.controller;


import conatus.domain.entity.hobby.RecommendedHobby;
import conatus.domain.service.HobbyService;
import conatus.domain.service.PythonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.Collections;

@RestController
@Transactional
@RequiredArgsConstructor
@RequestMapping(value="/recommend")
public class PythonController {
    String pythonUrl = "url:";
    String hobbyUrl = pythonUrl + "/recommend/hobby";
    String groupUrl = pythonUrl + "/recommend/group";
    String lectureUrl = pythonUrl + "/recommend/lecture";

    private final PythonService pythonService;
    private final HobbyService hobbyService;

    @GetMapping("/python")
    public void getRecommendHobby() {
        // Python 서버에 요청보내기
        ResponseEntity<RecommendedHobby> recommendedHobby = pythonService.receive(hobbyUrl, RecommendedHobby.class);
        System.out.println("==========================================");
        System.out.println("==========================================");
        System.out.println("recommendedHobby = " + recommendedHobby.getBody());
        System.out.println("==========================================");
        System.out.println("==========================================");
        //        hobbyService.saveHobby(recommendedHobby.getBody());


    }

}
