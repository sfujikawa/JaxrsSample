package jaxrsResource;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import service.JsonData;
import service.JsonService;

@Path("jsonFile")
public class jsonfileResource {

    @EJB
    JsonService JsonService;

    @POST
    //受けるデータの形式を指定
    //@Consumes({MediaType.APPLICATION_JSON})
    @Consumes("text/plain")
    //返すデータの形式を指定
    @Produces({MediaType.APPLICATION_JSON})
    public List<JsonData> getjson(
            @FormParam("nameList") JsonData jsonData) {
        System.err.println("nameList:"+jsonData);
        return null;
    }
}
