package conatus.domain.user.service;

import conatus.domain.hobby.UserHobby;
import conatus.domain.hobby.UserHobbyType;
import conatus.domain.hobby.repository.HobbyRepository;
import conatus.domain.hobby.repository.UserHobbyRepository;
import conatus.domain.hobby.repository.UserHobbyTypeRepository;
import conatus.domain.user.RecommendUserInfo;
import conatus.domain.user.SurveyDto;
import conatus.domain.user.respository.RecommendUserInfoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SurveyService {
    private final UserHobbyRepository userHobbyRepository;
    private final UserHobbyTypeRepository userHobbyTypeRepository;
    private final RecommendUserInfoRepository recommendUserInfoRepository;
    private final HobbyRepository hobbyRepository;

    // 설문 결과 저장
    public SurveyDto saveSurvey(SurveyDto surveyDto){
        // 유저 개인 정보

        RecommendUserInfo userInfo = new RecommendUserInfo();
        userInfo.setUserId(surveyDto.getUserId());
        userInfo.setBirth(surveyDto.getBirth());
        userInfo.setLocation(surveyDto.getLocation());
        recommendUserInfoRepository.save(userInfo);


        // 좋아하는 주제
        for (Long hobbyTypeId: surveyDto.getHobbyType()
             ) {
            UserHobbyType userHobbyType = new UserHobbyType();
            userHobbyType.setHobbyTypeId(hobbyTypeId);
            userHobbyType.setUserId(surveyDto.getUserId());
            userHobbyTypeRepository.save(userHobbyType);
        }


        // 현재 가지고 있는 취미
        for (Long hobbyId: surveyDto.getHobby()
        ) {
            UserHobby userHobby = new UserHobby();
            userHobby.setHobbyId(hobbyId);
            userHobby.setUserId(surveyDto.getUserId());
            userHobby.setHobbyName(hobbyRepository.findById(hobbyId).get().getName());
            userHobbyRepository.save(userHobby);
        }
        return surveyDto;
    }
}
