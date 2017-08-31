package ArrayListTest;

import org.junit.Test;

import java.util.*;

/**
 * Created by Dw.L on 2017/7/25.
 */
public class Fun {

    @Test
    public void ArrayListDemo(){

        List <String> demoArrayList = new ArrayList <String>();

        demoArrayList.add("第一个");
        demoArrayList.add("第二个");

        System.out.println("第一中遍历");
        for (String str: demoArrayList) {
            System.out.println(str);
        }

        System.out.println("第2中遍历");

        try {
            String[] strArrayList = new String[demoArrayList.size()];

            demoArrayList.toArray(strArrayList);

            for (int a = 0; a <= strArrayList.length; a++) {

                System.out.println(strArrayList[a]);

            }

        } catch (Exception e) {

            System.out.println("出错了");
        }


        System.out.println("第三种遍历");

        Iterator <String> lit = demoArrayList.iterator();

        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
    }


    @Test
    public void HashMapDemo(){

        Map <String , String > testHashMap = new HashMap();

        testHashMap.put("第一个Key", "第一个值");

        testHashMap.put("第er个Key", "第er个值");   //hashMap  如果键一样则会覆盖 值 其值的值为覆盖的那个键所带的值

        System.out.println("通过Map.keySet遍历key和value：");

        int a = testHashMap.size();

        testHashMap.remove("第一个Key");

        System.out.println("MAP的大小是：   " + a) ;
        for (String key:testHashMap.keySet()
             ) {

            System.out.println("键是   "+key+"值是   "+testHashMap.get(key));
        }


        int[] bbb = new int[5];

        bbb[1] = 55;

        System.out.println(bbb[1]);

    }


}
