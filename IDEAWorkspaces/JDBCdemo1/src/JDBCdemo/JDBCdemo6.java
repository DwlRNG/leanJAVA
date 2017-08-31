package JDBCdemo;


import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by Dw.L on 2017/4/11. 事务的处理方法
 */
public class JDBCdemo6 {

    public void fun6(Connection connection,String name,Double balance)throws  Exception { //得到传递过来的connection对象保持connection对象一致

        PreparedStatement preparedStatement = null;
        try {
            String sql1 = "UPDATE account SET balance=balance+? WHERE name=?";
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.setDouble(1,balance);
            preparedStatement.setString(2,name);
            preparedStatement.executeUpdate();//executeUpdate 更新数据库数据有返回的类型-->Request   executeQuery用于插入 发送 无返回的SQL语句
            connection.commit();
        }catch (Exception e){
            connection.rollback();
            throw  new  RuntimeException(e);
        }finally {
            if (preparedStatement!=null)preparedStatement.close();
        }
    }
}
