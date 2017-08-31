package Benutios;

/**
 * Created by Dw.L on 2017/3/24.
 */
public class demo {
    public void fun() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        String ClassName = "Benutios.person";
        Class clazz = Class.forName(ClassName);
        Object bean = clazz.newInstance();






    }
}
