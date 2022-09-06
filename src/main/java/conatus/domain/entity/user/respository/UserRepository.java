package conatus.domain.entity.user.respository;

import conatus.domain.entity.user.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository
        extends PagingAndSortingRepository<User, Long> {

    User findByUserId(Long id);

}
