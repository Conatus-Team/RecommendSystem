package conatus.domain.hobby.event;


import conatus.infra.AbstractEvent;
import lombok.Data;

@Data
public class MyHobbyRead extends AbstractEvent {

    private Long id;
    private Long userId;
    // keep

}
