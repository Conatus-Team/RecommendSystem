package conatus.domain.chatting.event;


import conatus.infra.AbstractEvent;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ChattingExited extends AbstractEvent {

    private Long id;
    private Long groupId;
    private LocalDateTime enterdTime;
    private LocalDateTime exitTime;
    private Long userId;
    // keep


}
