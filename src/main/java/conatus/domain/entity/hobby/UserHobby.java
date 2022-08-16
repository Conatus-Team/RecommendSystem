package conatus.domain.entity.hobby;

import conatus.domain.entity.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_hobby")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserHobby extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    Long userId;

    Long hobbyId;
    String hobbyName;
}