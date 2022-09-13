package conatus.domain.user.service;

import conatus.domain.user.User;
import conatus.domain.user.event.SignedUp;
import conatus.domain.user.respository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    // kafka
    // 유저 이벤트 받기: 유저 추가
    public User postUser(SignedUp signedUp){
        User user = new User(signedUp.getUserId(), signedUp.getUserNickname(), signedUp.getUserName());
        User savedUser = userRepository.save(user);
        return savedUser;
    }

}
