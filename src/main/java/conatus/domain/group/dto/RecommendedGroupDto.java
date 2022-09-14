package conatus.domain.group.dto;

import lombok.Data;

@Data
public class RecommendedGroupDto {
    Long userId;
    Long groupId;

    public RecommendedGroupDto(Long userId, Long groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }
}
