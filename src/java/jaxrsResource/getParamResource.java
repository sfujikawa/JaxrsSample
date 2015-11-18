package jaxrsResource;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import service.JsonData;
import service.JsonService;

@Path("getParam")
public class getParamResource {

    @EJB
    JsonService JsonService;

    //GETパラメーターを受け取る
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<JsonData> getjson(
            @QueryParam("name") String name) {

        return JsonService.getJson(name);
    }
}
