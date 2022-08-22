package conatus.domain.user;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class SurveyDto {
    private Long userId;

    private LocalDate birth;

    private String location;

    private List<Long>  hobbyType;

    private List<Long> hobby;

//    private class HobbyDto{
//        private Long id;
//        private String name;
//    }

//    @Builder
//    public SurveyDto(ChattingRoom chattingRoom){
//        this.id = chattingRoom.getId();
//        this.groupId = chattingRoom.getGroupId();
//        this.groupName = chattingRoom.getGroupName();
//        this.category = chattingRoom.getCategory();
//
//
//    }
}


