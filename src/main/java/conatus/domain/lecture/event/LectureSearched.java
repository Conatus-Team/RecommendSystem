package conatus.domain.lecture.event;


import conatus.infra.AbstractEvent;
import lombok.Data;

@Data
public class LectureSearched extends AbstractEvent {

    private Long id;
    private Long userId;
    private String keyword;
    // keep

}
