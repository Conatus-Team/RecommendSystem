package conatus.domain.hobby.event;

import conatus.domain.user.RecommendUserInfo;
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
