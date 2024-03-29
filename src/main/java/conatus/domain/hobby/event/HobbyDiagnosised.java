package conatus.domain.hobby.event;

import conatus.domain.user.RecommendUserInfo;
import conatus.infra.AbstractEvent;
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
