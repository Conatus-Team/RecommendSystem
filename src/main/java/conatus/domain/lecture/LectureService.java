package conatus.domain.lecture;


import conatus.domain.hobby.RecommendedHobby;
import conatus.domain.hobby.repository.RecommendedHobbyRepository;
import conatus.domain.lecture.respotisory.RecommendedLectureRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LectureService {

    @Autowired
    RecommendedLectureRepository recommendedLectureRepository;

    // recommended_lecture 저장
    public void saveLecture(Long userId, Long[] recommendedLectures) {

        for(Long lectureId : recommendedLectures) {
            RecommendedLecture recommendedLecture = new RecommendedLecture(userId, lectureId);
            recommendedLectureRepository.save(recommendedLecture);
        }

    }



}
