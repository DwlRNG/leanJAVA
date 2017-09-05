package dao;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

/**
 * Created by Dw.L on 2017/9/5.
 */
public class testMysql2 {

    testmysql testmysql = new testmysql();

    @Test
    public void Testyanzheng() throws PropertyVetoException, SQLException {

        String dorm = "5栋607";
        String mag = "没水";
        String sname = "刘德华";
        String snumber = "15656";

        QueryRunner queryRunner = testmysql.getconection();

        String sql = "insert into baoxiu VAlUE(?,?,?,?)";

        Object[] parm = {dorm, mag, sname, snumber};

        int a = queryRunner.update(sql, parm);
        System.out.println(a);
    }



}
