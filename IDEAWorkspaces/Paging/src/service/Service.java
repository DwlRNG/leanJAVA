package service;

import dao.Dao;
import daomain.PageBean;
import daomain.pagingstudents;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

/**
 * Created by Dw.L on 2017/6/12.
 */
public class Service {


    public PageBean<pagingstudents> findall(int pc, int ps) throws PropertyVetoException, SQLException {
        Dao dao = new Dao();
        return dao.findall(pc, ps);
    }

    public PageBean<pagingstudents> tiaojianfind(String panme,int home_id,int pc,int ps) throws PropertyVetoException, SQLException {

        Dao dao = new Dao();
        return dao.tiaojianfind(panme, home_id, pc, ps);
    }


}
