package jaxrssample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


//MyApplication.java で指定したベースのURLの次にURLに記載するメソッド名のパスをvalue指定。
//http://<host-name>/<context-name(プロジェクト名)>/<ベースurl(MyApplicationで指定)>/hello-world
@Path("helloWorld")
public class HelloWorldResource {

    //HTTPのGETでアクセスしてきたらこのメソッドがよびだされる。
    //メソッドの戻り値が String 型の場合は、 return した値がそのまま HTTP のレスポンスとなる。
    @GET
    public String helloWorld() {
        
        return "Hello World";
    }
}