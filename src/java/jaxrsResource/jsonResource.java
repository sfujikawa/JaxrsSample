package jaxrsResource;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import service.JsonData;
import service.JsonService;

//@Path("json")→http://<host-name>/<context-name(プロジェクト名)>/Appのパス/json
@Path("json")
public class jsonResource {
    
    @EJB
    JsonService JsonService;
    
    //@Pathで指定したパスに対してGETリクエストを付けつける
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<JsonData> getjson() {
        return JsonService.getJson();
    }

    //TODO:POSTパラメーターをJSONで受け取る
}
