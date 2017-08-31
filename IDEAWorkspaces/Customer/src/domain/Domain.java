package domain;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import main.CustomerUser;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

/**
 * Created by Dw.L on 2017/4/15.
 */
public class Domain {


    public int add(String s1,String s2,String s3,String s4) throws PropertyVetoException, SQLException {

        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String name = "root";
        String password = "123";

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();   //得到连接池对象
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "insert into customer values(?,?,?,?)";
        Object[] parm = {s1,s2,s3,s4};
        int backqueryRunner = queryRunner.update(sql, parm);
        return backqueryRunner;
    }






    public CustomerUser find(String getname, String getphone) throws PropertyVetoException, SQLException {

        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String name = "root";
        String password = "123";

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();   //得到连接池对象
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "select * from customer where cname=? and cphone=?";
        Object[] parm = {getname,getphone};

        CustomerUser customerUser = queryRunner.query(sql,new BeanHandler<CustomerUser>(CustomerUser.class),parm);
        System.out.println(customerUser.getCanme());
        return customerUser;
    }


    public int delete(String cid) throws PropertyVetoException, SQLException {

        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String name = "root";
        String password = "123";

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();   //得到连接池对象
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner qr= new QueryRunner(comboPooledDataSource);

        String sql = "Delete from customer where cid=?";
        Object[] parm = {cid};
        int back = qr.update(sql,parm);
        return (back);
    }



}
