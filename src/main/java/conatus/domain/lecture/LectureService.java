package conatus.domain.lecture;


import conatus.domain.group.RecommendedGroup;
import conatus.domain.group.dto.RecommendedGroupDto;
import conatus.domain.group.dto.RecommendedItemListDto;
import conatus.domain.hobby.RecommendedHobby;
import conatus.domain.hobby.repository.RecommendedHobbyRepository;
import conatus.domain.lecture.dto.RecommendedLectureDto;
import conatus.domain.lecture.respotisory.RecommendedLectureRepository;
import conatus.domain.middle.PostMiddleService;
import conatus.domain.middle.Url;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class LectureService {

    @Autowired
    RecommendedLectureRepository recommendedLectureRepository;

    private final PostMiddleService postMiddleService;

    // recommended_lecture 저장
    public void saveLecture(Long userId, Long[] recommendedLectures) {

        for(Long lectureId : recommendedLectures) {
            RecommendedLecture recommendedLecture = new RecommendedLecture(userId, lectureId);
            recommendedLectureRepository.save(recommendedLecture);
        }

    }

    // Lecture 서버로 추천 강의 전송
    public RecommendedItemListDto sendRecommendedLecture(Long userId) {
        List<RecommendedLecture> recommendedLectureList = recommendedLectureRepository.findByUserId(userId);

        List<RecommendedLectureDto> recommendedLectureDtoList = new ArrayList<>();
        for(RecommendedLecture recommendedLecture : recommendedLectureList) {
            RecommendedLectureDto recommendedLectureDto = new RecommendedLectureDto(userId, recommendedLecture.getLectureId());
            recommendedLectureDtoList.add(recommendedLectureDto);
        }

        RecommendedItemListDto recommendedItemListDto = new RecommendedItemListDto(recommendedLectureDtoList);

        System.out.println("=========================================================");
        System.out.println("================Lecture 서버로 추천 강의 전송==================");
        System.out.println(recommendedItemListDto);
        System.out.println("=========================================================");
        System.out.println("=========================================================");

        postMiddleService.sendTo(Url.WITHOUT_MIDDLE_Lecture.getUrl(), recommendedItemListDto);

        return recommendedItemListDto;
    }


}
