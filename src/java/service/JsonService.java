package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
//import java.time.LocalDateTime;

@Stateless
public class JsonService {
        private List<JsonData> jsonDataList;
    {
        
        //TODO:Java8 Date and Time API
        //年月日時分秒を指定
        //LocalDateTime d1 = LocalDateTime.of(2015, 1, 1, 1, 1, 1);
        Date d1 =  new Date(System.currentTimeMillis());
        
        jsonDataList = new ArrayList<>(Arrays.asList(
                new JsonData(100, "北海道よ", d1),
                new JsonData(200, "雪を", d1),
                new JsonData(300, "降れ", d1)
                ));
    }
    
    public List<JsonData> getJson(){
        return jsonDataList;
    }
    public List<JsonData> getJson(String name){
        
        if (name != null) {
        //パラメータを元に、1件追加
        jsonDataList.add(new JsonData(400, name, new Date(System.currentTimeMillis())));
        }
        
        return jsonDataList;
    }

}
