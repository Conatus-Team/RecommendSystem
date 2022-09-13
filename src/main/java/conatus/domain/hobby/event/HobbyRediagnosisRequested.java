package conatus.domain.hobby.event;


import conatus.infra.AbstractEvent;
import lombok.Data;

@Data
public class HobbyRediagnosisRequested extends AbstractEvent {

    private Long id;
    private Long userId;
    // keep

}
