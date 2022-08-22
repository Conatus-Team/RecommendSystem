package conatus.domain.entity.hobby.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import conatus.domain.entity.hobby.HobbyType;
import conatus.domain.entity.hobby.UserHobby;

@RepositoryRestResource(collectionResourceRel = "user_hobby", path = "user_hobby")
public interface UserHobbyRepository
        extends JpaRepository<UserHobby, Long> {
	

	
}
