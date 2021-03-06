package jaxrsResource;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import service.JsonData;
import service.JsonService;

@Path("PathParam/{name}")
public class PathParamResource {

    @EJB
    JsonService JsonService;

    @PathParam("name")
    private String name;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<JsonData> getjson() {
        return JsonService.getJson(name);
    }
}
