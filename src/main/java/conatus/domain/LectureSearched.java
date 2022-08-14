package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;
import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class LectureSearched extends AbstractEvent {

    private Long id;
    private Long userId;
    private String keyword;
    // keep

}
