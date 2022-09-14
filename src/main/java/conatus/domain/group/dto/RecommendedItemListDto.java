package conatus.domain.group.dto;

import lombok.Data;

import java.util.List;

@Data
public class RecommendedItemListDto {
    Object data;

    public RecommendedItemListDto(Object data) {
        this.data = data;
    }
}
