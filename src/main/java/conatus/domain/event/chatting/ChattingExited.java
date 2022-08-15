package conatus.domain.event.chatting;


import conatus.infra.AbstractEvent;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class ChattingExited extends AbstractEvent {

    private Long id;
    private Long groupId;
    private LocalDateTime enterdTime;
    private LocalDateTime exitTime;
    private Long userId;
    // keep

}
