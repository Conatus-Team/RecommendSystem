package conatus.domain;

import conatus.RecommendSystemApplication;
import conatus.domain.GroupRecommended;
import conatus.domain.HobbyDiagnosised;
import conatus.domain.HobbyRecommended;
import conatus.domain.HobbyRediagnosised;
import conatus.domain.LetureRecommended;
import conatus.domain.MyHobbyGot;
import conatus.domain.UserInfoUpdated;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "RecommendUserInfo_table")
@Data
public class RecommendUserInfo {

    private Long userId;

    private Long gender;

    private Long location;

    private Long birth;

    private List<Long> lectureId;

    private List<Long> groupId;

    private Long chattingTime;

    private List<String> selectedHobby;

    private List<String> recommendedHobby;

    private List<String> diagnosisedHobby;

    private List<String> searchedLecture;

    private List<String> searchedGroup;

    @PostPersist
    public void onPostPersist() {
        LetureRecommended letureRecommended = new LetureRecommended(this);
        letureRecommended.publishAfterCommit();

        HobbyDiagnosised hobbyDiagnosised = new HobbyDiagnosised(this);
        hobbyDiagnosised.publishAfterCommit();

        GroupRecommended groupRecommended = new GroupRecommended(this);
        groupRecommended.publishAfterCommit();

        HobbyRecommended hobbyRecommended = new HobbyRecommended(this);
        hobbyRecommended.publishAfterCommit();

        UserInfoUpdated userInfoUpdated = new UserInfoUpdated(this);
        userInfoUpdated.publishAfterCommit();

        MyHobbyGot myHobbyGot = new MyHobbyGot(this);
        myHobbyGot.publishAfterCommit();

        HobbyRediagnosised hobbyRediagnosised = new HobbyRediagnosised(this);
        hobbyRediagnosised.publishAfterCommit();
    }

    public static RecommendUserInfoRepository repository() {
        RecommendUserInfoRepository recommendUserInfoRepository = RecommendSystemApplication.applicationContext.getBean(
            RecommendUserInfoRepository.class
        );
        return recommendUserInfoRepository;
    }

    public static void updateUserInfo(LectureLiked lectureLiked) {
        /** Example 1:  new item 
        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        repository().save(recommendUserInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(lectureLiked.get???()).ifPresent(recommendUserInfo->{
            
            recommendUserInfo // do something
            repository().save(recommendUserInfo);


         });
        */

    }

    public static void updateUserInfo(GroupJoined groupJoined) {
        /** Example 1:  new item 
        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        repository().save(recommendUserInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(groupJoined.get???()).ifPresent(recommendUserInfo->{
            
            recommendUserInfo // do something
            repository().save(recommendUserInfo);


         });
        */

    }

    public static void updateUserInfo(GroupQuitted groupQuitted) {
        /** Example 1:  new item 
        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        repository().save(recommendUserInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(groupQuitted.get???()).ifPresent(recommendUserInfo->{
            
            recommendUserInfo // do something
            repository().save(recommendUserInfo);


         });
        */

    }

    public static void updateUserInfo(PostAccessCounted postAccessCounted) {
        /** Example 1:  new item 
        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        repository().save(recommendUserInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(postAccessCounted.get???()).ifPresent(recommendUserInfo->{
            
            recommendUserInfo // do something
            repository().save(recommendUserInfo);


         });
        */

    }

    public static void updateUserInfo(GroupSearched groupSearched) {
        /** Example 1:  new item 
        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        repository().save(recommendUserInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(groupSearched.get???()).ifPresent(recommendUserInfo->{
            
            recommendUserInfo // do something
            repository().save(recommendUserInfo);


         });
        */

    }

    public static void updateUserInfo(GroupDetailShown groupDetailShown) {
        /** Example 1:  new item 
        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        repository().save(recommendUserInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(groupDetailShown.get???()).ifPresent(recommendUserInfo->{
            
            recommendUserInfo // do something
            repository().save(recommendUserInfo);


         });
        */

    }

    public static void updateUserInfo(LectureSearched lectureSearched) {
        /** Example 1:  new item 
        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        repository().save(recommendUserInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(lectureSearched.get???()).ifPresent(recommendUserInfo->{
            
            recommendUserInfo // do something
            repository().save(recommendUserInfo);


         });
        */

    }

    public static void updateUserInfo(LectureDetailShown lectureDetailShown) {
        /** Example 1:  new item 
        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        repository().save(recommendUserInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(lectureDetailShown.get???()).ifPresent(recommendUserInfo->{
            
            recommendUserInfo // do something
            repository().save(recommendUserInfo);


         });
        */

    }

    public static void updateUserInfo(ChattingExited chattingExited) {
        /** Example 1:  new item 
        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        repository().save(recommendUserInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(chattingExited.get???()).ifPresent(recommendUserInfo->{
            
            recommendUserInfo // do something
            repository().save(recommendUserInfo);


         });
        */

    }

    public static void rediagnosisHobby(
        HobbyRediagnosisRequested hobbyRediagnosisRequested
    ) {
        /** Example 1:  new item 
        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        repository().save(recommendUserInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(hobbyRediagnosisRequested.get???()).ifPresent(recommendUserInfo->{
            
            recommendUserInfo // do something
            repository().save(recommendUserInfo);


         });
        */

    }

    public static void diagnosisHobby(SignedUp signedUp) {
        /** Example 1:  new item 
        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        repository().save(recommendUserInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(signedUp.get???()).ifPresent(recommendUserInfo->{
            
            recommendUserInfo // do something
            repository().save(recommendUserInfo);


         });
        */

    }

    public static void getMyHobby(MyHobbyRead myHobbyRead) {
        /** Example 1:  new item 
        RecommendUserInfo recommendUserInfo = new RecommendUserInfo();
        repository().save(recommendUserInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(myHobbyRead.get???()).ifPresent(recommendUserInfo->{
            
            recommendUserInfo // do something
            repository().save(recommendUserInfo);


         });
        */

    }
}
