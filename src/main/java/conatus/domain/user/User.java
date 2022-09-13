package conatus.domain.user;

import conatus.domain.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String userName;
    private Boolean isDeleted = Boolean.FALSE;
    private String nickname;


    @Builder
    public User(Long userId, String nickname, String userName){
        this.userId = userId;
        this.nickname = nickname;
        this.userName = userName;
    }
}

