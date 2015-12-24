package jaxrsResource;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import service.JsonData;
import service.JsonService;

@Path("postParam")
public class postParamResource {

    //CDIビーンじゃないけど@Injectで呼び出せるはず
    //わかりやすいJavaEE P350
    //でも実行時にエラー、SCIのスコープアノテーションが必要？ beans.xmlは必要？
    @EJB
    //@Inject
    JsonService JsonService;

    //パラメータは変数へのアノテーションでも取得可能
    @FormParam("name")
    private String name;
    
    //POSTパラメーターを受け取る
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public List<JsonData> getjson() {
        
        return JsonService.getJson(name);
    }
}
