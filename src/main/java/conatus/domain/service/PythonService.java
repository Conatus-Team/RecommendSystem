package conatus.domain.service;


import conatus.domain.entity.hobby.RecommendedHobby;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.Collections;

@RestController
@Transactional
@RequiredArgsConstructor
public class PythonService {

    // url에 GET 요청하고 type 타입의 데이터 받아오기
    public <T> ResponseEntity<T> receive(String url, Class<T> type) {

        // header
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<Object> entity = new HttpEntity<>(headers);

        // send
        RestTemplate rt = new RestTemplate();
        ResponseEntity<T> response = rt.exchange(
                url, //{요청할 서버 주소}
                HttpMethod.GET, //{요청할 방식}
                entity, // {요청할 때 보낼 데이터}
                type // {반환 타입}
        );

        return response;
    }
}
