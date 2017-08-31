package JDBCdemo;

import org.junit.Test;

import java.sql.*;

/**
 * Created by Dw.L on 2017/4/8.  防SQL攻击的登录验证
 */
public class JDBClogin1 {
    public boolean login1(String username,String password) throws Exception {
        String DriverClassname = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String myname = "root";
        String mypassword = "123";

/*
        String name = null;
        String password1 =null;
*/

        Class.forName(DriverClassname);
        Connection connection = DriverManager.getConnection(url, myname, mypassword);
        /**
         * 得到PreparedStatement ————>statement 的子函数
         * 1.给出SQL模板，所有的参数使用问号代替
         * 2.得到PreparedStatement
         * 3.给问号赋值
         *
         */
        String sql = "SELECT * FROM login WHERE name=? AND upassword=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,username);                                  //给第一个问号赋值
        preparedStatement.setString(2, password);                                  //给第二个问号赋值
        ResultSet resultSet = preparedStatement.executeQuery();                                  //调用executeQuery发送SQL语句
/**
 *
 * 遍历输出可以保存到一个ben中
 *
 * while (resultSet.next()){
            name  = resultSet.getString("name");
            password1 = resultSet.getString("upassword");
            System.out.println(name);
            System.out.println(password1);
        }*/

        return (resultSet.next());
    }


    @Test
    public void fun() throws Exception {
        boolean r = login1("大卫01","123");
        System.out.print(r);
    }

}
