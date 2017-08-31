package JDBCdemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Dw.L on 2017/4/8.
 *
 * jar commons-dbcp 与 pool是连接池使用的
 * logging 是批处理与事务处理的
 *
 */
public class JDBCdemo1 {
    @Test

    public void fun1() throws ClassNotFoundException, SQLException {


        String DriverclassName = "com.mysql.jdbc.Driver";//驱动名字
        String url = "jdbc:mysql://localhost:3306/mydb3";//连接数据库的路径mydb3为需要连接的数据库的名字
        String username = "root";
        String password = "123";


        Class.forName(DriverclassName);                 //加载类驱动

        Connection con = DriverManager.getConnection(url,username,password);                //得到连接对象
        System.out.print(con);
    }
}
