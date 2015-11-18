package service;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

//XMLやJSONの変換を自動化するため、クラスをJAXB(Java Architecture for XML Binding)対応させる。
//JavaとXML(またはJSON)の変換、復元が自動化される。
//条件1:@XmlRootElementアノテーションをつける。条件2:デフォルトコンストラクタがある。
//例:@XmlRootElement(name="得意先")
@XmlRootElement
public class JsonData {

    //フィールド名日本語にする例もあり
    private Integer num;
    private String name;
    private Date start;

    public JsonData() {
    }

    public JsonData(Integer num, String name,Date start) {
        this.num = num;
        this.name = name;
        this.start = start;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

}
