package conatus.domain.event.hobby;

import conatus.domain.entity.user.RecommendUserInfo;
import conatus.infra.AbstractEvent;
import lombok.Data;

@Data
public class HobbyRecommended extends AbstractEvent {

    private Long id;
    private Long userId;
    private String hobby;

    public HobbyRecommended(RecommendUserInfo aggregate) {
        super(aggregate);
    }

    public HobbyRecommended() {
        super();
    }
    // keep

}
