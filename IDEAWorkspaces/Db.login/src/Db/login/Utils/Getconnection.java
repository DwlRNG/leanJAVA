package Db.login.Utils;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import java.beans.PropertyVetoException;

/**
 * Created by Dw.L on 2017/4/19.  工具类
 */
public class Getconnection {

    private String DriverClassName = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/mydb3";
    private String name = "root";
    private String password = "123";



    public QueryRunner getconnection() throws PropertyVetoException {
        /*
        * 设置连接池
        * */
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);


        comboPooledDataSource.close();
        /*
        * 返回一个c3p0连接池对象
        * */

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);

        return  queryRunner;

    }








}
