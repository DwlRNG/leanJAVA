package cn.bank.dao;


import org.springframework.jdbc.core.JdbcTemplate;



/**
 * Created by Dw.L on 2017/5/2.
 */


public class dao {

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    JdbcTemplate jdbcTemplate;

    public void lessmoney(String name,String money){   //少钱方法

        String sql = "UPDATE bank SET money=money-? WHERE name=?";

        jdbcTemplate.update(sql,money,name);

    }

    public void  moremoney(String name,String money){

        String sql = "UPDATE bank SET money=money+? WHERE name=?";

        jdbcTemplate.update(sql, money, name);
    }

}
