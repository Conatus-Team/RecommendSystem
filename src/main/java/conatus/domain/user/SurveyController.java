package conatus.domain.user;


import conatus.domain.python.PythonService;
import conatus.domain.user.service.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@Transactional
@RequiredArgsConstructor
@RequestMapping(value="/recommend")
public class SurveyController {

    private final SurveyService surveyService;
    private final PythonService pythonService;


    // 설문조사 결과 받기
    @PostMapping("/survey")
    public SurveyDto createRoom(@RequestBody SurveyDto surveyDto){
        System.out.println("===============================");
        System.out.println("=====      Survey Dto     =====");
        System.out.println("===============================");
        System.out.println(surveyDto.toString());

        // 파이썬 서버로 부터 추천 취미, 추천 강의, 추천 그룹 저장
        pythonService.saveRecommendedItems(surveyDto.getUserId());

        return surveyService.saveSurvey(surveyDto);
    }
}
