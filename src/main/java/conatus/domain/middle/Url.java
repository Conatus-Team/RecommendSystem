package conatus.domain.middle;

import lombok.Getter;

@Getter
public enum Url {
//    LOCAL("http://localhost:"),
//    RELEASE(""),
//    BASE(LOCAL.getUrl()),
//
//    AUTH(BASE.getUrl() + "8080" + "/auth/connect_middle"),
//    LECTURE(BASE.getUrl() + "8084" + "/lecture/connect_middle"),
//    GROUP(BASE.getUrl() + "8083" + "/group/connect_middle"),
//    CHATTING(BASE.getUrl() + "8085" + "/chatting/connect_middle"),
//    RECOMMEND(BASE.getUrl() + "8086" + "/recommend/connect_middle"),
//    MIDDLE(BASE.getUrl() + "8082" + "/middle");

    // Release
    AUTH("auth-backend-svc.moine.svc.cluster.local" + "/auth/connect_middle"),
    LECTURE("lecture-backend-svc.moine.svc.cluster.local" + "/lecture/connect_middle"),
    GROUP("group-backend-svc.moine.svc.cluster.local" + "/group/connect_middle"),
    CHATTING("chatting-backend-svc.moine.svc.cluster.local" + "/chatting/connect_middle"),
    RECOMMEND("recommend-backend-svc.moine.svc.cluster.local" + "/recommend/connect_middle"),
    MIDDLE("middle-backend-svc.moine.svc.cluster.local" + "/middle");


    private final String url;

    private Url(String url) {
        this.url = url;
    }

}
