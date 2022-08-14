package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;
import java.util.Date;
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
