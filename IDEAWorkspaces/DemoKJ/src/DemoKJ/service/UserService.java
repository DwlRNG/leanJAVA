package DemoKJ.service;

import DemoKJ.dao.UserDao;
import DemoKJ.domain.User;

/**
 * Created by Dw.L on 2017/3/27.
 */
public class UserService {


    //相当于每个方法的菜单将所有的方法都收集到这里方便调用  依赖dao
    private UserDao userDao = new UserDao();
    public User find(){
        return userDao.find();
    }

}
