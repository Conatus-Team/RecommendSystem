package conatus.domain.entity.hobby.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import conatus.domain.entity.group.Group;
import conatus.domain.entity.hobby.Hobby;
import conatus.domain.entity.hobby.RecommendedHobby;

@RepositoryRestResource(collectionResourceRel = "recommended_hobby", path = "recommended_hobby")
public interface RecommendedHobbyRepository
        extends PagingAndSortingRepository<RecommendedHobby, Long> {
	
	List<RecommendedHobby> findByUserId(Long userId);
	
}
