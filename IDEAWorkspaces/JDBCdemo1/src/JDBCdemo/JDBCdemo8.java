package JDBCdemo;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Dw.L on 2017/4/12.   c3p0连接池
 */
public class JDBCdemo8 {
    @Test
    public void c3p0() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mydb3");
        dataSource.setUser("root");
        dataSource.setPassword("123");

        /*
                Test
        Connection connection = dataSource.getConnection();
        System.out.print(connection);*/

        dataSource.setAcquireRetryAttempts(5);//连接池增量
        dataSource.setInitialPoolSize(20);    //连接数
        dataSource.setMinPoolSize(2);         //最小连接数
        dataSource.setMaxPoolSize(50);


        /*
        连接池测试
        Connection connection = dataSource.getConnection();
        String sql = "SELECT  * FROM login WHERE name='大卫01'";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean r = resultSet.next();
        System.out.println(r);*/


    }
}
