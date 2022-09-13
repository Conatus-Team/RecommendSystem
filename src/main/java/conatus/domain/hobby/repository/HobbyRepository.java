package conatus.domain.hobby.repository;

import conatus.domain.hobby.Hobby;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "hobby", path = "hobby")
public interface HobbyRepository
        extends PagingAndSortingRepository<Hobby, Long> {
	

	
}
