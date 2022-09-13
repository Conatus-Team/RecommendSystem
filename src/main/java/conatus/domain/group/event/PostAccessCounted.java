package conatus.domain.group.event;


import conatus.infra.AbstractEvent;
import lombok.Data;

@Data
public class PostAccessCounted extends AbstractEvent {

    private Long id;
    private Long groupId;
    private Long userId;
    private Integer postAccessCount;
    // keep

}
