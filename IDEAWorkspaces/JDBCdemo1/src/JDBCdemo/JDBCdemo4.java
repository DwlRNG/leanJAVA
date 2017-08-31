package JDBCdemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Dw.L on 2017/4/8.  正规格式  取出数据库中的数据
 */
public class JDBCdemo4 {
    @Test
    public void fun4()throws Exception{

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            String  Driverclassname = "com.mysql.jdbc.Driver";
            String  url = "jdbc:mysql://localhost:3306/mydb3";
            String  username = "root";
            String  password = "123";
            Class.forName(Driverclassname);
            connection = DriverManager.getConnection(url,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM  stu");
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String number = resultSet.getString("number");
                String gender = resultSet.getString("gender");
                int gae = resultSet.getInt("age");
                System.out.println(number+"  "+name+"  "+gae+"  "+gender);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);

        } finally {
            if (resultSet!=null)resultSet.close();
            if (statement!=null)statement.close();
            if (connection!=null)connection.close();

        }


    }
}
