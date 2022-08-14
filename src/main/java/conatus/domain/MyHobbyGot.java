package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;
import java.util.Date;
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
