package conatus.domain.entity.group.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import conatus.domain.entity.group.Group;

@RepositoryRestResource(collectionResourceRel = "group", path = "group")
public interface GroupRepository
        extends PagingAndSortingRepository<Group, Long> {
	

	
}
