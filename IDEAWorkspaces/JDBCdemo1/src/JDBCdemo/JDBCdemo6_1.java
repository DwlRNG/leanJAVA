package JDBCdemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Dw.L on 2017/4/11.  事务的connection对象必须为一致  6——1调用6
 */
public class JDBCdemo6_1 {

/*
* 事务处理注意事项
* 1.必须使用同一个connection
* 2.connection健在业务逻辑层
* 3.事务开始建在调用的方法中
*
* */
    public void zhuanzhang (String toname,String getname,Double money) throws Exception{
        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3?rewriteBatchedStatements=true";             //打开批处理
        String myname = "root";
        String mypassword = "123";
        Connection connection = null;
        try {
            Class.forName(DriverClassName);
            connection = DriverManager.getConnection(url, myname, mypassword);
            JDBCdemo6 jdbCdemo6 = new JDBCdemo6();
            jdbCdemo6.fun6(connection,toname,-money);
            jdbCdemo6.fun6(connection,getname,money);
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            if (connection!=null) connection.close();
        }

    }


    @Test
    public void  fun6_1() throws Exception {
        zhuanzhang("zhangsan","lishi",200.00);
    }
}
