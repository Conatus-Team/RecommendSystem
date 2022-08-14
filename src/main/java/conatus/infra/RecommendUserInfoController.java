package conatus.infra;

import javax.transaction.Transactional;

import conatus.domain.user.RecommendUserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/recommendUserInfos")
@Transactional
public class RecommendUserInfoController {

    @Autowired
    RecommendUserInfoRepository recommendUserInfoRepository;
    // keep
}
