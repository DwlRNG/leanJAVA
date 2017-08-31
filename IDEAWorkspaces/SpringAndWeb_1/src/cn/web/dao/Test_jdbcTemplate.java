package cn.web.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dw.L on 2017/5/1.
 */
public class Test_jdbcTemplate {

    @Test  //数据库添加操作
    public void  add(){

        //1.设置数据库信息

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //设置驱动信息
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb3");
        dataSource.setUsername("root");
        dataSource.setPassword("123");

        //2.设置jdbcTemplaate模板对象

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        //3.使用jdbcTemplaate对象实现对数据库的操作

        //3.1添加sql语句

        String sql = "INSERT INTO spring value(?,?,?)";

        //3.2调用update方法 返回值为int
        int a = jdbcTemplate.update(sql, "03", "大卫03", "22");
        System.out.println(a);
    }


    @Test  //数据库修改操作
    public void  aupdate(){

        //1.设置数据库信息

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //设置驱动信息
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb3");
        dataSource.setUsername("root");
        dataSource.setPassword("123");

        //2.设置jdbcTemplaate模板对象

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        //3.使用jdbcTemplaate对象实现对数据库的操作

        //3.1添加sql语句 返回值为int
        String sql = "UPDATE spring set name=?,age=? where id=?";


        //3.2调用update方法
        int a  = jdbcTemplate.update(sql,"大卫01","18","01");

        System.out.println(a);


    }

    @Test //删除数据库中的数据

    public void delete(){

        //1.设置数据库信息

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //设置驱动信息
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb3");
        dataSource.setUsername("root");
        dataSource.setPassword("123");

        //2.设置jdbcTemplaate模板对象

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        //3.使用jdbcTemplaate对象实现对数据库的操作

        //3.1添加sql语句

        String  sql = "delete FROM spring where id=?";

        //3.2调用update方法  返回值为int

        int a = jdbcTemplate.update(sql, "03");

        System.out.println(a);

    }


    @Test  //查询返回某一个值

    public void find1(){

        //1.设置数据库信息

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //设置驱动信息
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb3");
        dataSource.setUsername("root");
        dataSource.setPassword("123");

        //2.设置jdbcTemplaate模板对象

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        //3.使用jdbcTemplaate对象实现对数据库的操作

        //3.1添加sql语句

        String  sql = "SELECT COUNT(*) FROM spring ";

        //3.2调用queryForObject(String sql, Object obj)方法  返回值为Object

        int a = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(a);



    }



    @Test  //查询返回一个对象

    public void find2(){

        //1.设置数据库信息

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //设置驱动信息
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb3");
        dataSource.setUsername("root");
        dataSource.setPassword("123");

        //2.设置jdbcTemplaate模板对象

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        //3.使用jdbcTemplaate对象实现对数据库的操作

        //3.1添加sql语句

        String  sql = "SELECT * FROM spring where name=?";

        //3.2 调用queryForObject(String sql,RowMapper<T>,"?")   RowMapper<T>为一个接口需要自己实现  实现的目的封装数据  把查询到的数据封装到一个BEN中

        spring spring = jdbcTemplate.queryForObject(sql,new MyRowMapper(),"大卫01");

        spring.out();

    }




    @Test  //返回list集合

    public void find3(){

        //1.设置数据库信息

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //设置驱动信息
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb3");
        dataSource.setUsername("root");
        dataSource.setPassword("123");

        //2.设置jdbcTemplaate模板对象

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        //3.使用jdbcTemplaate对象实现对数据库的操作

        //3.1添加sql语句

        String  sql = "SELECT * FROM spring";

        //3.2调用query方法  返回list

        List<spring>  list = jdbcTemplate.query(sql,new MyRowMapper());

        System.out.println(list);
    }



}

class MyRowMapper implements RowMapper<spring>{


    @Override
    public spring mapRow(ResultSet resultSet, int i) throws SQLException {

        String id  =  resultSet.getString("id");
        String   name   = resultSet.getString("name");
        String age  = resultSet.getString("age");

        spring spring = new spring();

        spring.setId(id);
        spring.setName(name);
        spring.setAge(age);

        return spring;
    }
}
