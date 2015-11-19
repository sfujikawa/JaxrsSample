
package jaxrssample;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

// JAX-RS で処理するURLのベースをアノテーションのvalueで指定。
//「@ApplicationPath("rest")」→http://<host-name>/<context-name(プロジェクト名)>/rest/
//「@ApplicationPath("/")」   →http://<host-name>/<context-name(プロジェクト名)>/
@ApplicationPath("rest")
public class MyApplication extends Application {
    //TODO:下記コードの目的確認
    /*
    private static final Set<Class<?>> CLASSES =
            new HashSet<Class<?>>(Arrays.asList(<リソースクラス>.class));
    @Override
    public Set<Class<?>> getClasses() {
        return CLASSES;
    }
    */
}
//JAX-RSとは
//Java API for RESTful Web Services
//REST アーキテクチャにのっとって web アプリケーションを記述するための Java の API。
//Java EE の一部。
//リソースクラス(POJO)をWebリソースにマッピングしてくれる

//RESTとは
//Representational State Transfer
//広いい意味では、
//  HTTP仕様に準拠し、URLを指定して、XML等のデータを得るようなインターフェス。
//  過去の通信手段(CORBA,DCOM、SORP)を使わない。
//
//厳密には、
//個々の Web サービスをリソースと見なし、Web サービスをその URL によって一意に識別できるアーキテクチャー原則のこと。
//
//RESTfullとは
//その原則に、従っていること。
//

//ライブラリを追加。(追加しなくても動いた) JAX-RS 2.0 -javax.ws.rs-api2.0.jar
//Jerseyが含まれている、Jersey(ジャージー？)はJAX-RSの実装

//主にアプリケーションクラスとリソースクラスを作成する。
//アプリケーションクラス :各種設定を保持するクラス
//リソースクラス        :メソッドを実装する。
