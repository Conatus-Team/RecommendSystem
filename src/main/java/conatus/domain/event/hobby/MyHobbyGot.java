package conatus.domain.event.hobby;

import conatus.domain.entity.RecommendUserInfo;
import conatus.infra.AbstractEvent;
import lombok.Data;

@Data
public class MyHobbyGot extends AbstractEvent {

    private Long id;
    private Long userId;
    private String hobby;

    public MyHobbyGot(RecommendUserInfo aggregate) {
        super(aggregate);
    }

    public MyHobbyGot() {
        super();
    }
    // keep

}
