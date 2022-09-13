package conatus.domain.hobby;

import conatus.domain.BaseTimeEntity;
import conatus.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "reommended_hobby")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecommendedHobby extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

//    @ManyToOne
//    @JoinColumn(name="hobby_id")
//    private Hobby hobby;

    private Long hobbyId;
//    private String category;
    private String hobby_name;


    @Builder
    public RecommendedHobby(Long userId, String hobby_name){

        this.userId = userId;
        this.hobbyId = (long)0;
        this.hobby_name = hobby_name;

    }


}
