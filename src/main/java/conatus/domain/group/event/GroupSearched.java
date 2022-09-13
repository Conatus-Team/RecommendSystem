package conatus.domain.group.event;


import conatus.infra.AbstractEvent;
import lombok.Data;

@Data
public class GroupSearched extends AbstractEvent {

    private Long id;
    private Long userId;
    private String keyword;
    // keep

}
