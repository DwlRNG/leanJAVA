import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dw.L on 2017/4/28.
 */
public class demo {


@Test
    public  void fun1(){

    JSONObject map = new JSONObject(); //新建一个JSON map

    /**
     * 利用map存东西
     * */
    map.put("name", "zhangsan");
    map.put("age", 13);
    map.put("sex", "male");

    String s = map.toString();     //调用toString方法 将map改变为 json字符串

    System.out.println(s);

}
/**
 * 利用一个javabean对象 （有一个） 转换为JSON对象
 * */
    @Test
    public void fun2(){

        person p = new person("张三", 15, "男");

        JSONObject map = JSONObject.fromObject(p);  //调用静态方法fromObject转换为 JSONmap

        String  s = map.toString();

        System.out.println(s);



    }

/**
 *JSONlist的使用  必须借助javabean
 * */

    @Test
    public void fun3(){

        person person1 = new person("刘德华", 18, "男");
        person person2 = new person("刘德华1", 18, "女");

        JSONArray list = new JSONArray();  //建立一个JSON list

        list.add(person1);
        list.add(person2);

        System.out.println(list.toString());  //调用toString()方法
    }


    /**
     * 有一个list集合  转换为JSON串
     * */


    @Test

    public  void fun4(){
        person person1 = new person("刘德华", 18, "男");
        person person2 = new person("刘德华1", 18, "女");

        List<person> list = new ArrayList<person>();  //有一个 list
        list.add(person1);
        list.add(person2);


        JSONArray list1 = JSONArray.fromObject(list);

        String  s  = list1.toString();

        System.out.println(s);

    }







































}
