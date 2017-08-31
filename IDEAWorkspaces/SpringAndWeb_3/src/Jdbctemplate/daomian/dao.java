package Jdbctemplate.daomian;

import Jdbctemplate.mian.user;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dw.L on 2017/5/22.
 */
public class dao {


    private  JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void addUser(String name,String money,String number){

        String sql = "INSERT INTO spring3 VALUE(?,?,?)";
        int a = jdbcTemplate.update(sql, name, money, number);
        System.out.println(a);

    }

    public void findall(){

        String sql = "SELECT * FROM spring3";

        List<user> list = jdbcTemplate.query(sql,new MyRowMapper());
        System.out.println(list);

        for (user s:list) {

            System.out.println(s.getName()+"+++"+s.getNumber()+"+++"+s.getMoney());
            
        }

    }


    public void deleteUser(String number){

        String sql = "DELETE FROM spring3 where number=?";

        int a = jdbcTemplate.update(sql,number);

        System.out.println(a);

        }


    public void findInOne(String  number){

        String sql = "SELECT * FROM spring3 WHERE number=?";

        user u = jdbcTemplate.queryForObject(sql,new MyRowMapper(), number);

        System.out.println(u.getName()+"++++"+u.getMoney()+"++++"+u.getNumber());

    }





}

class MyRowMapper implements RowMapper<user>{


    @Override
    public user mapRow(ResultSet resultSet, int i) throws SQLException {

        String name = resultSet.getString("name");
        String money = resultSet.getString("money");
        String number = resultSet.getString("number");

        user user = new user();

        user.setName(name);
        user.setMoney(money);
        user.setNumber(number);

        return user;


    }
}


