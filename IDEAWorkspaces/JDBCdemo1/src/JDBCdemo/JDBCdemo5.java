package JDBCdemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by Dw.L on 2017/4/11. -------批处理  插入数据
 */
public class JDBCdemo5 {


    @Test
    public void fun5()throws Exception{
        String DriverclassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3?rewriteBatchedStatements=true";
        String myname = "root";
        String mypassword = "123";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(DriverclassName);                                     //注册驱动
            connection =  DriverManager.getConnection(url,myname,mypassword);   //根据URL连接到服务器
            String sql = "INSERT  INTO students VALUE (?,?,?,?,?,?,?,?)";                      //创建模板
            preparedStatement = connection.prepareStatement(sql);               //由connection得到SQL语句发送器
            for (int i=0;i<=3;i++) {
                preparedStatement.setString(1, "100"+i);
                preparedStatement.setString(2, "刘德华"+i);
                preparedStatement.setString(3, "男");
                preparedStatement.setString(4, "000"+i);
                preparedStatement.setString(5, "0"+i);
                preparedStatement.setString(6, "香港"+i);
                preparedStatement.setString(7, "100"+i);
                preparedStatement.setString(8, "1000"+i);
                preparedStatement.addBatch();                                   //将赋值添加到集合中用于批量处理
            }
            preparedStatement.executeBatch();                                   //批量发送

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            if(preparedStatement!=null)preparedStatement.close();
            if(connection!=null)connection.close();

        }

    }
}
