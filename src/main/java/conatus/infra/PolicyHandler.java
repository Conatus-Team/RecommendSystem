package conatus.infra;

import conatus.config.kafka.KafkaProcessor;

import javax.transaction.Transactional;

import conatus.domain.event.chatting.ChattingExited;
import conatus.domain.event.group.*;
import conatus.domain.group.*;
import conatus.domain.event.hobby.HobbyRediagnosisRequested;
import conatus.domain.event.hobby.MyHobbyRead;
import conatus.domain.event.lecture.LectureDetailShown;
import conatus.domain.event.lecture.LectureLiked;
import conatus.domain.event.lecture.LectureSearched;
import conatus.domain.entity.RecommendUserInfo;
import conatus.domain.user.RecommendUserInfoRepository;
import conatus.domain.event.user.SignedUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    RecommendUserInfoRepository recommendUserInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverLectureLiked_UpdateUserInfo(
        @Payload LectureLiked lectureLiked
    ) {
        if (!lectureLiked.validate()) return;
        LectureLiked event = lectureLiked;
        System.out.println(
            "\n\n##### listener UpdateUserInfo : " +
            lectureLiked.toJson() +
            "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.updateUserInfo(event);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverGroupJoined_UpdateUserInfo(
        @Payload GroupJoined groupJoined
    ) {
        if (!groupJoined.validate()) return;
        GroupJoined event = groupJoined;
        System.out.println(
            "\n\n##### listener UpdateUserInfo : " +
            groupJoined.toJson() +
            "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.updateUserInfo(event);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverGroupQuitted_UpdateUserInfo(
        @Payload GroupQuitted groupQuitted
    ) {
        if (!groupQuitted.validate()) return;
        GroupQuitted event = groupQuitted;
        System.out.println(
            "\n\n##### listener UpdateUserInfo : " +
            groupQuitted.toJson() +
            "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.updateUserInfo(event);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPostAccessCounted_UpdateUserInfo(
        @Payload PostAccessCounted postAccessCounted
    ) {
        if (!postAccessCounted.validate()) return;
        PostAccessCounted event = postAccessCounted;
        System.out.println(
            "\n\n##### listener UpdateUserInfo : " +
            postAccessCounted.toJson() +
            "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.updateUserInfo(event);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverGroupSearched_UpdateUserInfo(
        @Payload GroupSearched groupSearched
    ) {
        if (!groupSearched.validate()) return;
        GroupSearched event = groupSearched;
        System.out.println(
            "\n\n##### listener UpdateUserInfo : " +
            groupSearched.toJson() +
            "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.updateUserInfo(event);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverGroupDetailShown_UpdateUserInfo(
        @Payload GroupDetailShown groupDetailShown
    ) {
        if (!groupDetailShown.validate()) return;
        GroupDetailShown event = groupDetailShown;
        System.out.println(
            "\n\n##### listener UpdateUserInfo : " +
            groupDetailShown.toJson() +
            "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.updateUserInfo(event);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverLectureSearched_UpdateUserInfo(
        @Payload LectureSearched lectureSearched
    ) {
        if (!lectureSearched.validate()) return;
        LectureSearched event = lectureSearched;
        System.out.println(
            "\n\n##### listener UpdateUserInfo : " +
            lectureSearched.toJson() +
            "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.updateUserInfo(event);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverLectureDetailShown_UpdateUserInfo(
        @Payload LectureDetailShown lectureDetailShown
    ) {
        if (!lectureDetailShown.validate()) return;
        LectureDetailShown event = lectureDetailShown;
        System.out.println(
            "\n\n##### listener UpdateUserInfo : " +
            lectureDetailShown.toJson() +
            "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.updateUserInfo(event);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverChattingExited_UpdateUserInfo(
        @Payload ChattingExited chattingExited
    ) {
        if (!chattingExited.validate()) return;
        ChattingExited event = chattingExited;
        System.out.println(
            "\n\n##### listener UpdateUserInfo : " +
            chattingExited.toJson() +
            "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.updateUserInfo(event);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverHobbyRediagnosisRequested_RediagnosisHobby(
        @Payload HobbyRediagnosisRequested hobbyRediagnosisRequested
    ) {
        if (!hobbyRediagnosisRequested.validate()) return;
        HobbyRediagnosisRequested event = hobbyRediagnosisRequested;
        System.out.println(
            "\n\n##### listener RediagnosisHobby : " +
            hobbyRediagnosisRequested.toJson() +
            "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.rediagnosisHobby(event);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverSignedUp_DiagnosisHobby(@Payload SignedUp signedUp) {
        if (!signedUp.validate()) return;
        SignedUp event = signedUp;
        System.out.println(
            "\n\n##### listener DiagnosisHobby : " + signedUp.toJson() + "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.diagnosisHobby(event);
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverMyHobbyRead_GetMyHobby(
        @Payload MyHobbyRead myHobbyRead
    ) {
        if (!myHobbyRead.validate()) return;
        MyHobbyRead event = myHobbyRead;
        System.out.println(
            "\n\n##### listener GetMyHobby : " + myHobbyRead.toJson() + "\n\n"
        );

        // Sample Logic //
        RecommendUserInfo.getMyHobby(event);
    }
    // keep

}
