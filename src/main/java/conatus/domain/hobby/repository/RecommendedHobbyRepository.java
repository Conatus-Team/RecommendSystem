package conatus.domain.hobby.repository;

import conatus.domain.hobby.RecommendedHobby;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "recommended_hobby", path = "recommended_hobby")
public interface RecommendedHobbyRepository
        extends PagingAndSortingRepository<RecommendedHobby, Long> {
	
	List<RecommendedHobby> findByUserId(Long userId);
	
}
