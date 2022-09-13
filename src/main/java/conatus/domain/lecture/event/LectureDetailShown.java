package conatus.domain.lecture.event;


import conatus.infra.AbstractEvent;
import lombok.Data;

@Data
public class LectureDetailShown extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long lectureId;
    private String category;
    // keep

}
