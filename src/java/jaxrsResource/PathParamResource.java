package jaxrsResource;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import service.JsonData;
import service.JsonService;

@Path("PathParam/{name}")
public class PathParamResource {

    @EJB
    JsonService JsonService;
    
    @PathParam("name")
    private String name;


    @GET
    public List<JsonData> getjson() {
        return JsonService.getJson(name);
    }
}
