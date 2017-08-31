package JDBCdemo;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Dw.L on 2017/4/11.
 *
 * 连接池的配置
 *
 */
public class JDBCdemo7 {
    @Test
    public void fun() throws SQLException {
        BasicDataSource dataSource = new BasicDataSource();   //得到连接池对象
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");//设置驱动名字
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb3");//设置路径
        dataSource.setUsername("root");
        dataSource.setPassword("123");
        Connection connection = dataSource.getConnection();//得到connection对象
        System.out.print(connection.getClass().getName());//测试
    }


}
