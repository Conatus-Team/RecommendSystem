package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class UserInfoUpdated extends AbstractEvent {

    private Long id;
    private Long userId;

    public UserInfoUpdated(RecommendUserInfo aggregate) {
        super(aggregate);
    }

    public UserInfoUpdated() {
        super();
    }
    // keep

}
