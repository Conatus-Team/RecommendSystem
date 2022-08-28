package conatus.domain.event.user;

import conatus.domain.user.RecommendUserInfo;
import conatus.infra.AbstractEvent;
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
