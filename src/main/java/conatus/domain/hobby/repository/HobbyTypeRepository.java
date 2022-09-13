package conatus.domain.hobby.repository;

import conatus.domain.hobby.HobbyType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "hobby_type", path = "hobby_type")
public interface HobbyTypeRepository
        extends PagingAndSortingRepository<HobbyType, Long> {
	

	
}
