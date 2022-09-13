package conatus.domain.user.event;


import conatus.infra.AbstractEvent;
import lombok.Data;

@Data
public class SignedUp extends AbstractEvent {

//    private Long id;
//    private Long userId;
//    private Boolean gender;
//    private Date birth;
//    private String location;
    // keep
    private Long userId;
    private String email;
//    private String password;
    private String userName;
    private String userNickname;
}
