package conatus.domain.event.hobby;


import conatus.infra.AbstractEvent;
import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class HobbyRediagnosisRequested extends AbstractEvent {

    private Long id;
    private Long userId;
    // keep

}
