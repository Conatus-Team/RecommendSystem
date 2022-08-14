package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class LetureRecommended extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long lectureId;

    public LetureRecommended(RecommendUserInfo aggregate) {
        super(aggregate);
    }

    public LetureRecommended() {
        super();
    }
    // keep

}
