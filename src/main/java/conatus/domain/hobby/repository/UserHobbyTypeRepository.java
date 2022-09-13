package conatus.domain.hobby.repository;

import conatus.domain.hobby.UserHobbyType;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(collectionResourceRel = "user_hobby_type", path = "user_hobby_type")
public interface UserHobbyTypeRepository
        extends JpaRepository<UserHobbyType, Long> {
	

	
}
