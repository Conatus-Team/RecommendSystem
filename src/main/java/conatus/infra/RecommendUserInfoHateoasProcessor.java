package conatus.infra;

import conatus.domain.user.RecommendUserInfo;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RecommendUserInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RecommendUserInfo>> {

    @Override
    public EntityModel<RecommendUserInfo> process(
        EntityModel<RecommendUserInfo> model
    ) {
        return model;
    }
}
