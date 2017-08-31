package dao;

import cn.itcast.jdbc.TxQueryRunner;
import org.apache.commons.dbutils.QueryRunner;
import user.customer;

import java.sql.SQLException;

/**
 * Created by Dw.L on 2017/4/14.
 */
public class CustomerDao {
    QueryRunner queryRunner = new  TxQueryRunner();

    public void add(customer c){

        try {
            String sql = "insert into customer values=(?,?,?,?)";
            Object[] params = {c.getCid(),c.getCanme(),c.getCphone(),c.getSex()};
            queryRunner.update(sql, params);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
