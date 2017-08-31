package cn.dw.dao;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Dw.L on 2017/4/9.
 */
public class Cheakpn {
    public boolean cheaknp(String getusername,String getpassword) throws Exception{

        String DriverClassname = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/mydb3";
        String name = "root";
        String password = "123";
        Connection connection =null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet =null;
        try {
            Class.forName(DriverClassname);
            connection = DriverManager.getConnection(url, name, password);
            String sql = "SELECT * FROM login WHERE name=? AND upassword=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,getusername);
            preparedStatement.setString(2,getpassword);
            resultSet = preparedStatement.executeQuery();
            return(resultSet.next());
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }finally {
            if (resultSet!=null)resultSet.close();
            if (preparedStatement!=null)preparedStatement.close();
            if (connection!=null)connection.close();

        }

    }

    /**
    @Test
    public void  testcakpn() throws Exception {
        String s="大卫01";
        String k = "123";
        boolean a = cheaknp(s,k);
        System.out.print(a);
    }

    */
}
