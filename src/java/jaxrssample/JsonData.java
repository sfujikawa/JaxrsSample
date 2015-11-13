package jaxrssample;

import javax.xml.bind.annotation.XmlRootElement;

//XMLやJSONの変換を自動化するため、クラスをJAXB(Java Architecture for XML Binding)対応させる。
//JavaとXML(またはJSON)の変換、復元が自動化される。
//条件1:@XmlRootElementアノテーションをつける。条件2:デフォルトコンストラクタがある。
@XmlRootElement
public class JsonData {

    private Integer num;
    private String name;

    public JsonData() {
    }

    public JsonData(Integer num, String name) {
        this.num = num;
        this.name = name;
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

}
