package dawei.jdbc.demo1;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Dw.L on 2017/4/8.
 */
public class jdbcdemo {
    @Test
    public void fun1() throws ClassNotFoundException, SQLException {

        Class.forName("come.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","123");
        System.out.print(con);

    }


}
