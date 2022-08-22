package conatus.infra.controller;


import conatus.domain.user.SurveyDto;
import conatus.domain.service.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@Transactional
@RequiredArgsConstructor
public class SurveyController {

    private final SurveyService surveyService;
    // 설문조사 결과 받기
    @PostMapping("recommend/survey")
    public SurveyDto createRoom(@RequestBody SurveyDto surveyDto){
        System.out.println("===============================");
        System.out.println("=====      Survey Dto     =====");
        System.out.println("===============================");
        System.out.println(surveyDto.toString());
        return surveyService.saveSurvey(surveyDto);
    }
}
