package conatus.domain.event.group;


import conatus.infra.AbstractEvent;
import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class GroupJoined extends AbstractEvent {

    private Long id;
    private Long groupId;
    private Long userId;
    private String category;
    // keep

}
