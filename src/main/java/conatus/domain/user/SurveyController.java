package conatus.domain.user;


import conatus.domain.group.GroupService;
import conatus.domain.group.dto.RecommendedItemListDto;
import conatus.domain.lecture.LectureService;
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
    private final GroupService groupService;
    private final LectureService lectureService;


    // 설문조사 결과 받기
    @PostMapping("/survey")
    public SurveyDto createRoom(@RequestBody SurveyDto surveyDto){
        System.out.println("===============================");
        System.out.println("=====      Survey Dto     =====");
        System.out.println("===============================");
        System.out.println(surveyDto.toString());

        // 설문 결과 저장
        SurveyDto saved = surveyService.saveSurvey(surveyDto);
        
        // 파이썬 서버로 부터 추천 취미, 추천 강의, 추천 그룹 저장
        pythonService.saveRecommendedItems(surveyDto.getUserId());

        // 비동기
        // 강의, 그룹 추천 데이터 전달
        groupService.sendRecommendedGroup(surveyDto.getUserId());
        lectureService.sendRecommendedLecture(surveyDto.getUserId());

        return saved;
    }
}
