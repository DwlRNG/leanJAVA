package dao;

import bean.spring;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dw.L on 2017/9/5.
 */

@Transactional
public class find {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void findone(){

        System.out.println("OK");
        int id =1 ;

        String sql = "SELECT * FROM spring where id =?";

        List <spring> springList = jdbcTemplate.query(sql, new MyRowMapper(),id);
        System.out.println("OK1");
        for (spring s:springList) {

            System.out.print(s.getId()+"   "+s.getName()+"     "+s.getAge());
        }
        System.out.println("OK2");
    }


}


class MyRowMapper implements RowMapper<spring>{  /*设置映射类*/


    public spring mapRow(ResultSet resultSet, int i) throws SQLException {


        String id = resultSet.getString("id");
        String name = resultSet.getString("name");
        String age = resultSet.getString("age");

        spring spring = new spring();

        spring.setId(id);
        spring.setName(name);
        spring.setAge(age);

        return spring;
    }
}