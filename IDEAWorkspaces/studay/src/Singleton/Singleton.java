package Singleton;

import Classloader.ClassloaderFactory.OneWaiter;

/**
 * Created by Dw.L on 2017/6/10.
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton (){

    }

    public static Singleton getInstance() {

        return instance;

    }

}


class LazySingleton{

    private static LazySingleton lazySingleton;

    private LazySingleton(){

    }

    public  static LazySingleton getLazySingleton(){

        if (lazySingleton == null) {

            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }


}










