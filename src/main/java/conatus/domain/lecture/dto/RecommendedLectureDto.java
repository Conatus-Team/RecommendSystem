package conatus.domain.lecture.dto;

import lombok.Data;

@Data
public class RecommendedLectureDto {
    Long userId;
    Long lectureId;

    public RecommendedLectureDto(Long userId, Long lectureId) {
        this.userId = userId;
        this.lectureId = lectureId;
    }
}
