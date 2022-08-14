package conatus.domain.event.user;


import conatus.infra.AbstractEvent;
import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class SignedUp extends AbstractEvent {

    private Long id;
    private Long userId;
    private Boolean gender;
    private Date birth;
    private String location;
    // keep

}
