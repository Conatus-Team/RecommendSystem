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
//    MIDDLE(BASE.getUrl() + "8082" + "/middle"),


    // Release: AWS EC2
    AUTH("http://43.200.156.51:8080" + "/auth/connect_middle"),
    LECTURE("http://13.209.29.237:8080" + "/lecture/connect_middle"),
    GROUP("http://43.200.197.190:8080" + "/group/connect_middle"),
    CHATTING("http://3.34.172.89:8080" + "/chatting/connect_middle"),
    RECOMMEND("http://3.38.49.196:8080" + "/recommend/connect_middle"),
    MIDDLE("http://3.34.135.84:8080" + "/middle"),
    WITHOUT_MIDDLE_GROUP("http://43.200.197.190:8080" + "/group/recommend"),
    WITHOUT_MIDDLE_Lecture("http://13.209.29.237:8080" + "/lecture/recommend"),

    // Python
    PYTHON("http://13.125.24.24:8080"),
    PYTHON_HOBBY(PYTHON.getUrl() + "/recommend/hobby/contents/"),
    PYTHON_LECTURE(PYTHON.getUrl() + "/recommend/lecture/coldstart/"),
    PYTHON_GROUP(PYTHON.getUrl() + "/recommend/group/coldstart/");

//    // Release: EKS
//    AUTH("http://auth-backend-svc.moine.svc.cluster.local" + "/auth/connect_middle"),
//    LECTURE("http://lecture-backend-svc.moine.svc.cluster.local" + "/lecture/connect_middle"),
//    GROUP("http://group-backend-svc.moine.svc.cluster.local" + "/group/connect_middle"),
//    CHATTING("http://chatting-backend-svc.moine.svc.cluster.local" + "/chatting/connect_middle"),
//    RECOMMEND("http://recommend-backend-svc.moine.svc.cluster.local" + "/recommend/connect_middle"),
//    MIDDLE("http://middle-backend-svc.moine.svc.cluster.local" + "/middle");




    private final String url;

    private Url(String url) {
        this.url = url;
    }

}
