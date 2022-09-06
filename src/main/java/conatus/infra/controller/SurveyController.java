package conatus.infra.controller;


import conatus.domain.entity.user.SurveyDto;
import conatus.domain.service.user.SurveyService;
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
    // 설문조사 결과 받기
    @PostMapping("/survey")
    public SurveyDto createRoom(@RequestBody SurveyDto surveyDto){
        System.out.println("===============================");
        System.out.println("=====      Survey Dto     =====");
        System.out.println("===============================");
        System.out.println(surveyDto.toString());
        return surveyService.saveSurvey(surveyDto);
    }
}
