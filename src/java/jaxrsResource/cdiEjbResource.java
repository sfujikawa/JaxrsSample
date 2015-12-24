package jaxrsResource;

import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import service.JsonCdiService;
import service.JsonData;

//CDI
@RequestScoped
//EJBでもよい
//@Stateless
@Path("cdiEjb")
public class cdiEjbResource {

    //CDI
    @Inject
    JsonCdiService JsonCdiService;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<JsonData> getjson(
            @QueryParam("name") String name) {

        return JsonCdiService.getJson(name);
    }
}
