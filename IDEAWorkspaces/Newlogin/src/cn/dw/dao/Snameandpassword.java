package cn.dw.dao;

import cn.dw.domain.User;

/**
 * Created by Dw.L on 2017/4/9.
 */
public class Snameandpassword {
    public  void set(String getusername,String getpassword){
        User user = new User();
        user.setPassward(getusername);
        user.setPassward(getpassword);
    }
}
