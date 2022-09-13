package conatus.domain.lecture.respotisory;

import conatus.domain.hobby.RecommendedHobby;
import conatus.domain.lecture.RecommendedLecture;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "recommended_lecture", path = "recommended_lecture")
public interface RecommendedLectureRepository extends PagingAndSortingRepository<RecommendedLecture, Long>{

    List<RecommendedLecture> findByUserId(Long userId);
}

