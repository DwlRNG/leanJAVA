package service;

import dao.CustomerDao;
import user.customer;

/**
 * Created by Dw.L on 2017/4/14.
 */
public class CastomerService {
    private CustomerDao customerDao = new CustomerDao();

    public void add(customer c){   //得到一个customer对象传递到CustomerDao方法中
        customerDao.add(c);
    }
}
