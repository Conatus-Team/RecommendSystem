package conatus.domain.entity.group.repository;

import conatus.domain.entity.group.Group;
import conatus.domain.entity.group.UserGroup;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "group", path = "group")
public interface GroupRepository
        extends PagingAndSortingRepository<Group, Long> {

}
