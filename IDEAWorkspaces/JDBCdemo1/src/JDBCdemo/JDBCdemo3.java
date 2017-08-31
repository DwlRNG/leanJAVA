package JDBCdemo;

import org.junit.Test;

import java.sql.*;

/**
 * Created by Dw.L on 2017/4/8.  查询数据库  statement.executeQuery用于查询
 */
public class JDBCdemo3 {

    @Test
    public void fun3() throws ClassNotFoundException, SQLException {

        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String username  = "root";
        String password  = "123";
        Class.forName(DriverClassName);                                         //注册驱动
        Connection con = DriverManager.getConnection(url,username,password);    //通过驱动注册得到连接对象
        Statement statement = con.createStatement();                            //得到发送语句对象
        ResultSet resultSet = statement.executeQuery("SELECT * FROM stu");  //调用statement的executeQuery方法查询表格
        while (resultSet.next()){                                               //利用含光标获取表格中的数据
            String number = resultSet.getString("number");
            String name = resultSet.getString("name");
            int gae = resultSet.getInt("age");
            String gender = resultSet.getString("gender");
            System.out.println(number+"  "+name+"  "+gae+"  "+gender);


        }
        resultSet.close();
        statement.close();
        con.close();

    }
}
