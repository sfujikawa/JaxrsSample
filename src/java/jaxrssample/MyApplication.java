
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
//REST アーキテクチャにのっとって web アプリケーションを記述するための Java の API。
//Java EE の一部。
//ライブラリを追加。(追加しなくても動いた) JAX-RS 2.0 -javax.ws.rs-api2.0.jar
//Jerseyが含まれている、Jersey(ジャージー？)はJAX-RSの実装

//主にアプリケーションクラスとリソースクラスを作成する。
//アプリケーションクラス :各種設定を保持するクラス
//リソースクラス        :メソッドを実装する。
