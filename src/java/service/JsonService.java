package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class JsonService {
        private List<JsonData> jsonDataList;
    {
        jsonDataList = new ArrayList<>(Arrays.asList(
                new JsonData(100, "ゲンテン", new Date(System.currentTimeMillis())),
                new JsonData(200, "OGASAKA", new Date(System.currentTimeMillis())),
                new JsonData(300, "MOSS", new Date(System.currentTimeMillis()))));
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
