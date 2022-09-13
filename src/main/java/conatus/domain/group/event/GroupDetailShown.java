package conatus.domain.group.event;


import conatus.infra.AbstractEvent;
import lombok.Data;

@Data
public class GroupDetailShown extends AbstractEvent {

    private Long id;
    private Long userId;
    private Long groupId;
    private String category;
    // keep

}
