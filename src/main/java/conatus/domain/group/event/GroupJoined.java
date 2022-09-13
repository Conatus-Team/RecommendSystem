package conatus.domain.group.event;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import conatus.infra.AbstractEvent;
import lombok.*;

import java.time.LocalDateTime;

@Data
public class GroupJoined extends AbstractEvent {

//    private Long id;
//    private Long groupId;
//    private Long userId;
//    private String category;
    // keep
    Member member;

    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public class Member {
        LocalDateTime createdTime;
        LocalDateTime updatedTime;
        Long id;
        Boolean isDeleted = Boolean.FALSE;
        Long userId;
        String nickname;
        Boolean isLeader = Boolean.FALSE;
        Long groupId;
    }
}
