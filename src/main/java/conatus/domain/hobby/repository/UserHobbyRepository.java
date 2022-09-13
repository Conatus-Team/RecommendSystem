package conatus.domain.hobby.repository;

import conatus.domain.hobby.UserHobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "user_hobby", path = "user_hobby")
public interface UserHobbyRepository
        extends JpaRepository<UserHobby, Long> {

    List<UserHobby> findByUserId(Long userId);
	
}
