package dao;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import java.beans.PropertyVetoException;

/**
 * Created by Dw.L on 2017/9/5.
 */
public class testmysql {

    public QueryRunner getconection() throws PropertyVetoException{


        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String name = "root";
        String password = "123";


        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setPassword(password);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(name);
        dataSource.setDriverClass(DriverClassName);


        QueryRunner queryRunner = new QueryRunner(dataSource);

        return queryRunner;
    }




}
