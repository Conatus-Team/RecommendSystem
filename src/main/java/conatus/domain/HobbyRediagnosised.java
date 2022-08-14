package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;
import java.util.Date;
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
