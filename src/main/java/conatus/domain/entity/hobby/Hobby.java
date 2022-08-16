package conatus.domain.entity.hobby;


import conatus.domain.entity.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "hobby")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hobby extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer place;
    private Integer compete;
    private Integer strategic;
    @Column(name = "\"group\"")
    private Integer group;
    private Integer type;
}
