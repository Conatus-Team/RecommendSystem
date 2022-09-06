package conatus.domain.service.user;

import conatus.domain.entity.user.User;
import conatus.domain.entity.user.respository.UserRepository;
import conatus.domain.event.user.SignedUp;
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
