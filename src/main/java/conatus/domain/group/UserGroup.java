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
public class UserGroup extends BaseTimeEntity {
    // 유저가 활동한 기록 저장
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long groupId;

    // 그룹의 카테고리
    private String hobby;

    // 유저 활동기록
    private Boolean registered;
    private Integer uploadPictures; // 업로드한 사진 수
    private Integer uploadContent;
    private Integer clicked;

}
