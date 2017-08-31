package dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import java.beans.PropertyVetoException;

/**
 * Created by Dw.L on 2017/6/2.
 */
public class Utils {


    public void getconnection1(){



    }


    public QueryRunner getconnection() throws PropertyVetoException {
        /*
        * 设置连接池
        * */
        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String name = "root";
        String password = "123";


        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();   //得到连接池对象
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        /*
        * 返回一个c3p0连接池对象
        * */

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);

        return  queryRunner;

    }




}
