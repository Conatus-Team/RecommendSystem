package conatus.domain.entity.hobby.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import conatus.domain.entity.group.Group;
import conatus.domain.entity.hobby.Hobby;
import conatus.domain.entity.hobby.HobbyType;

@RepositoryRestResource(collectionResourceRel = "hobby_type", path = "hobby_type")
public interface HobbyTypeRepository
        extends PagingAndSortingRepository<HobbyType, Long> {
	

	
}
