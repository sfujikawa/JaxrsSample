package jaxrssample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

//@Path("json")→http://<host-name>/<context-name(プロジェクト名)>/Appのパス/json
@Path("json")
public class jsonResource {

    private List<JsonData> jsonDataList;

    {
        //初期化ブロック DBから取得するなど
        jsonDataList = new ArrayList<>(Arrays.asList(
                new JsonData(100, "Gentem"),
                new JsonData(200, "OGASAKA"),
                new JsonData(300, "MOSS")));
    }

    //@Pathで指定したパスに対してGETリクエストを付けつける
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<JsonData> getjson() {
        return jsonDataList;
    }
    
    //GETパラメーターを受け取る
    
    //@Pathで指定したパスに対してPOSTリクエストを付けつける
    //POSTパラメーターを受け取る
    

    //POSTパラメーターをJSONで受け取る
    

}
