package cn.web.dao;


import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Dw.L on 2017/5/1.
 */
public class Testc3p0 {



    /*
    * 属性为对象的注入  使用set方法
    * */
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //使用Spring配置模板 进行添加数据库操作
    public void add(){

        String sql = "INSERT INTO spring value(?,?,?)";

        jdbcTemplate.update(sql,"03","胡锅巴","18");

    }






}
