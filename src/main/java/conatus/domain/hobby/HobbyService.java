package conatus.domain.hobby;


import conatus.domain.hobby.repository.RecommendedHobbyRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HobbyService {
    @Autowired
    RecommendedHobbyRepository recommendedHobbyRepository;

    // recommended_hobby 저장
    public void saveHobby(Long userId, String[] recommendedHobbies) {

        for(String hobby : recommendedHobbies) {
            RecommendedHobby recommendedHobby = new RecommendedHobby(userId, hobby);
            recommendedHobbyRepository.save(recommendedHobby);
        }



    }


}
