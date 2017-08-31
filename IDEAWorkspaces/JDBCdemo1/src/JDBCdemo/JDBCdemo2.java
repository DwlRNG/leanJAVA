package JDBCdemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Dw.L on 2017/4/8.
 */
public class JDBCdemo2 {

    @Test
    public void fun2() throws ClassNotFoundException, SQLException {

        String  DrinverClassName = "com.mysql.jdbc.Driver";
        String  url = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "123";

        Class.forName(DrinverClassName);
        Connection con = DriverManager.getConnection(url,username,password);
        Statement statement = con.createStatement();                            //获取SQL语句发送器 通过executeUpdate方法修改表
       int m  = statement.executeUpdate("INSERT INTO stu VALUE ('dawei_002','大卫1',18,'man')");  //向数据库发送插入语句
        //int r  = statement.executeUpdate("INSERT INTO stu VALUE ('dawei_001','大卫',18,'man')");
        //int s = statement.executeUpdate("DELETE FROM stu");
       System.out.println(m);
        //System.out.println(s);


    }
}
