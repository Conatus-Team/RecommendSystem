package conatus.domain;

import conatus.domain.*;
import conatus.infra.AbstractEvent;
import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class ChattingExited extends AbstractEvent {

    private Long id;
    private Long groupId;
    private Date enterdTime;
    private Date exitTime;
    private Long userId;
    // keep

}
