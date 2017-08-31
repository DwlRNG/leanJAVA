package service;

import domain.Domain;
import main.CustomerUser;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

/**
 * Created by Dw.L on 2017/4/15.
 */
public class Service {
    private  Domain domain = new Domain();

    public int Serviceadd(String s1,String s2,String s3,String s4) throws PropertyVetoException, SQLException {
        int Backrunny = domain.add(s1,s2,s3,s4);
        return Backrunny;
    }


    public CustomerUser Servicefind(String name,String phone) throws PropertyVetoException, SQLException {

        Domain domain = new Domain();
        return domain.find(name,phone);
    }





    public int  Servicedelete(String cid) throws PropertyVetoException, SQLException {


        Domain domain = new Domain();
        int serviceback = domain.delete(cid);
        return  serviceback;



    }



}
