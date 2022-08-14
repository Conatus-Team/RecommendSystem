package conatus.domain.user;

import conatus.domain.entity.RecommendUserInfo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "recommendUserInfos",
    path = "recommendUserInfos"
)
public interface RecommendUserInfoRepository
    extends PagingAndSortingRepository<RecommendUserInfo, Long> {}
