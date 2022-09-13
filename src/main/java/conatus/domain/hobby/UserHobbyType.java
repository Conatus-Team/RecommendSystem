package conatus.domain.hobby;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_hobby_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserHobbyType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long hobbyTypeId;
}
