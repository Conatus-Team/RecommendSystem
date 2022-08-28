package conatus.domain.entity.hobby.repository;

import conatus.domain.entity.hobby.HobbyType;
import conatus.domain.entity.hobby.UserHobby;
import conatus.domain.entity.hobby.UserHobbyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "user_hobby_type", path = "user_hobby_type")
public interface UserHobbyTypeRepository
        extends JpaRepository<UserHobbyType, Long> {
	

	
}
