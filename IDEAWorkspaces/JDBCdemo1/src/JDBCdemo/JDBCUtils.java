package JDBCdemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Dw.L on 2017/4/11.
 */
public class JDBCUtils {
    public static Connection getconnection() throws Exception {
            String DriverClassName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost3306/mydb3";
            String name = "root";
            String password = "123";
            Class.forName(DriverClassName);
            Connection connection = DriverManager.getConnection(url, name, password);
            return connection;

    }
}
