package conatus.domain.group;

import conatus.domain.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecommendedGroup extends BaseTimeEntity {
    // 사용자에게 추천하는 그룹
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long groupId;


    @Builder
    public RecommendedGroup(Long userId, Long groupId){

        this.userId = userId;
        this.groupId = groupId;

    }

}
