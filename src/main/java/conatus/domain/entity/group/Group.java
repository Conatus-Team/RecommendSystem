package conatus.domain.entity.group;


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
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String groupName;
    Integer clicked;
    Integer registered;
    String category;
    Integer recommended;
    Integer posters;
    Integer pictures;
    Integer time;
    Integer region;
}
