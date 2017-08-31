package JDBCdemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * Created by Dw.L on 2017/4/8. 可以进行SQL攻击的登录
 */
public class JDBClogin {



    public boolean login(String username, String password) throws Exception {

        String DriverClassname = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String myname = "root";
        String mypassword = "123";

        Class.forName(DriverClassname);
        Connection connection = DriverManager.getConnection(url,myname,mypassword);
        Statement statement = connection.createStatement();
        /**
         * 使用statement.executeQuery进行SQL查询 如果需要使用变量必须使用双引号括起来
         *
         */
        ResultSet resultSet = statement.executeQuery
                ("SELECT * FROM login WHERE name=' " + username +" ' AND upassword=' "+password+" ' ");

        return(resultSet.next());                                                                                        //返回值为boolean

    }
    @Test
    public  void  Testlogin() throws Exception{

        boolean r = login("大卫01","123");
        System.out.print(r);
    }



}
