package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

@Data
public class HobbyDiagnosised extends AbstractEvent {

    private Long id;
    private Long userId;
    private String hobby;

    public HobbyDiagnosised(RecommendUserInfo aggregate) {
        super(aggregate);
    }

    public HobbyDiagnosised() {
        super();
    }
    // keep

}
