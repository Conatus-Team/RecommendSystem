package conatus.domain.group.event;

import conatus.domain.user.RecommendUserInfo;
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
