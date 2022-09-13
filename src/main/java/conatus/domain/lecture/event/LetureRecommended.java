package conatus.domain.lecture.event;

import conatus.domain.user.RecommendUserInfo;
import conatus.infra.AbstractEvent;
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
