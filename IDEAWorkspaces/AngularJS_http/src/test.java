import Daomian.User;
import Servlet.Sites;
import net.sf.json.JSONArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dw.L on 2017/7/13.
 */
public class test {
    
    
    @Test
    public void TestjsonUser(){

        User user1 = new User("DW.L1", "CN", "182****9791");
        User user2 = new User("DW.L2", "USA", "182****9792");
        User user3 = new User("DW.L3", "UK", "182****9793");
        User user4 = new User("DW.L4", "CK", "182****9794");

        List<User> list = new ArrayList<User>();

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);


        JSONArray jsonArray = JSONArray.fromObject(list);

        String s = jsonArray.toString();

        System.out.println(s);
        
        
    }
}
