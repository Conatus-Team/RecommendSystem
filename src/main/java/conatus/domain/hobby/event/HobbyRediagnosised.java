package conatus.domain.hobby.event;

import conatus.domain.user.RecommendUserInfo;
import conatus.infra.AbstractEvent;
import lombok.Data;

@Data
public class HobbyRediagnosised extends AbstractEvent {

    private Long id;
    private Long userId;
    private String hobby;

    public HobbyRediagnosised(RecommendUserInfo aggregate) {
        super(aggregate);
    }

    public HobbyRediagnosised() {
        super();
    }
    // keep

}
