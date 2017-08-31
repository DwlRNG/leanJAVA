package JDBCdemo;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Dw.L on 2017/4/13.  dbutils的使用  快速 增 删 改
 */
public class JDBCdemo9 {

    @Test
    public void  fun() throws PropertyVetoException, SQLException {

        /**
        * 得到一个连接池接口
        *
        *可以执行增删改
        *
        *
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



        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);            //给QueryRunner传递一个连接池对象

        String sql = "insert into stu values(?,?,?,?)";                    //创建sql语句
        Object[] params = {"dawei_004", "大卫4", 18, "man"};               //创建一个数组
        int a = queryRunner.update(sql, params);                           //传递一个数组给?号赋值  传递SQL语句
        System.out.println(a);

    }

    @Test
    public void fun9()throws PropertyVetoException, SQLException{

        /**
        * 得到一个连接池接口  只能查询一个
        *
        *
        * 可以执行查询  注意方法中所提到的类Stu结构必须和数据库的结构一抹一样
        *
        * */

        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String name = "root";
        String password = "123";


        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "select * from stu where number=?";   //SQL语句
        Object[] parmas = {"dawei_001"};                   //给问号赋值
        Stu stu = queryRunner.query(sql, new BeanHandler<Stu>(Stu.class), parmas);  //执行查询语句

        /**
         *
         * 可以处理的结果集
         *
         * */

        System.out.println(stu.getName()+"     "+stu.getNumber()+"     "+stu.getAge()+"     "+stu.getGender());


    }



    @Test
    public void fun9_1() throws PropertyVetoException, SQLException {

        /**
         *
         * 处理多结果集 使用BeanListHandler方法  多行查询
         *
         * */
        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String name = "root";
        String password = "123";


        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "select * from stu";
        List<Stu> list = queryRunner.query(sql,new BeanListHandler<Stu>(Stu.class));

        for(int i = 0 ; i < list.size() ; i++) {
            Stu stu = list.get(i);
            System.out.println(stu.getName()+"    "+stu.getGender()+"    "+stu.getAge()+"    "+stu.getNumber());
        }

    }


    @Test
    public void fun9_2() throws PropertyVetoException, SQLException {

        /*
         *
         * 处理多结果集 使用MapHandler方法
         * 单行数查询
         *
         * */
        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String name = "root";
        String password = "123";


        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "select * from stu where number=?";
        Object[] prea ={"dawei_003"};
        Map map = queryRunner.query(sql,new MapHandler(),prea);
        System.out.println(map);



    }

    @Test
    public void  fun9_3() throws PropertyVetoException, SQLException {
        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String name = "root";
        String password = "123";


        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "select * from stu";
        List<Map<String,Object>> mapList = queryRunner.query(sql,new MapListHandler());
        System.out.println(mapList);

    }


    @Test
    public void  fun9_4() throws PropertyVetoException, SQLException {


        /**
         *
         * 使用ScalarHandler  单行单列统计查询
         * */
        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb3";
        String name = "root";
        String password = "123";

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);
        String sql = "select count(*) from stu";
        Object o = queryRunner.query(sql,new ScalarHandler<>());
        System.out.println(o);

    }




}
