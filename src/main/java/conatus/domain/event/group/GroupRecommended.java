package conatus.domain.event.group;

import conatus.domain.entity.RecommendUserInfo;
import conatus.infra.AbstractEvent;
import lombok.Data;

@Data
public class GroupRecommended extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long groupId;

    public GroupRecommended(RecommendUserInfo aggregate) {
        super(aggregate);
    }

    public GroupRecommended() {
        super();
    }
    // keep

}
