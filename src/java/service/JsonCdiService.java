package service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

@SessionScoped
public class JsonCdiService implements Serializable {

    @Inject
    transient Logger log;

    private List<JsonData> jsonDataList;
    {

        Date d1 = new Date(System.currentTimeMillis());

        jsonDataList = new ArrayList<>(Arrays.asList(
                new JsonData(100, "北海道よ", d1),
                new JsonData(200, "雪を", d1),
                new JsonData(300, "降れ", d1)
        ));
    }

    public List<JsonData> getJson() {
        return jsonDataList;
    }

    public List<JsonData> getJson(String name) {
        log.info("JsonCdiService.getJson name=" + name);
        if (name != null) {
            //パラメータを元に、1件追加
            jsonDataList.add(new JsonData(400, name, new Date(System.currentTimeMillis())));
        }

        return jsonDataList;
    }

}
