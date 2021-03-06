package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class JsonService {

    @Inject
    transient Logger log;

    private List<JsonData> jsonDataList;

    public void createJson(){

        //TODO:Java8 Date and Time API
        //年月日時分秒を指定
        //LocalDateTime d1 = LocalDateTime.of(2015, 1, 1, 1, 1, 1);
        Date d1 = new Date(System.currentTimeMillis());

        jsonDataList = new ArrayList<>(Arrays.asList(
                new JsonData(100, "北海道よ", d1),
                new JsonData(200, "雪を", d1),
                new JsonData(300, "降れ", d1)
        ));
    }
    
    public List<JsonData> getJson() {
        createJson();
        return jsonDataList;
    }

    public List<JsonData> getJson(String name) {
        log.info("JsonService.getJson name=" + name);
        if (name != null) {
            createJson();
            //パラメータを元に、1件追加
            jsonDataList.add(new JsonData(400, name, new Date(System.currentTimeMillis())));
        }

        return jsonDataList;
    }

}
