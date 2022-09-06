package conatus.domain.service;


import conatus.domain.entity.hobby.RecommendedHobby;
import conatus.domain.entity.hobby.repository.RecommendedHobbyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@RequiredArgsConstructor
@Service
public class HobbyService {
    @Autowired
    RecommendedHobbyRepository recommendedHobbyRepository;

    // recommended_hobby 저장
    public void saveHobby(RecommendedHobby recommendedHobby) {

        recommendedHobbyRepository.save(recommendedHobby);
    }


}
