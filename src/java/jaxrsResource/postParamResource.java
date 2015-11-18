package jaxrsResource;

import java.util.List;
import javax.ejb.EJB;
//import javax.inject.Inject;
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
    //でも実行時にエラー、SCIのスコープアノテーションが必要？
    @EJB
    JsonService JsonService;

    //POSTパラメーターを受け取る
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public List<JsonData> getjson(
            //POSTの場合は、QueryParamでなくFormParam
            @FormParam("name") String name) {

        return JsonService.getJson(name);
    }
}
