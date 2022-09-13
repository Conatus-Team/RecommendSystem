package conatus.domain.group;


import conatus.domain.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "\"group\"")
public class Group extends BaseTimeEntity {
    // 각 그룹별 속성
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer clicked;
    private Integer registered;
    private String hobby;
    private Integer recommended;
    private Integer posters;
    private Integer pictures;
    private Integer time;
    private Integer region;
}
