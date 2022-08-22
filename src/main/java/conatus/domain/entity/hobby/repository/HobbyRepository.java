package conatus.domain.entity.hobby.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import conatus.domain.entity.group.Group;
import conatus.domain.entity.hobby.Hobby;

@RepositoryRestResource(collectionResourceRel = "hobby", path = "hobby")
public interface HobbyRepository
        extends PagingAndSortingRepository<Hobby, Long> {
	

	
}
