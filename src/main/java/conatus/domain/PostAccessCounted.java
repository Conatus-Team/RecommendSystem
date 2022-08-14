package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;
import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class PostAccessCounted extends AbstractEvent {

    private Long id;
    private Long groupId;
    private Long userId;
    private Integer postAccessCount;
    // keep

}
