package DemoKJ.dao;

import DemoKJ.domain.User;

/**
 * Created by Dw.L on 2017/3/27.
 *
 * dao的功能主要查询XML中的数据，将查询出来的数据封装到domian中
 */
public class UserDao {
    public User find(){

        return new User("张三","123");
    }
}
