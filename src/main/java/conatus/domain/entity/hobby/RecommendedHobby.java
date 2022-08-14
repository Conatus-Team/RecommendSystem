package conatus.domain.entity.hobby;

import conatus.domain.entity.BaseTimeEntity;
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
    private String hobbyName;

}
