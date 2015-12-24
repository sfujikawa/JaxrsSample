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

@Path("multiPath")
public class MultiPathResource {

    @EJB
    JsonService JsonService;

    @FormParam("name")
    private String name;
    
    @Path("pathA")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public List<JsonData> getjsonA() {
        return JsonService.getJson(name);
    }
    
    @Path("pathB")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public List<JsonData> getjsonB() {
        return JsonService.getJson(name);
    }
}
