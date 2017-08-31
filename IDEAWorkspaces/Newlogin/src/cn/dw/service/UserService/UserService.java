package cn.dw.service.UserService;

import cn.dw.dao.Cheakpn;
import cn.dw.dao.Snameandpassword;
import cn.dw.domain.User;


/**
 * Created by Dw.L on 2017/3/28.
 * User 的业务逻辑层
 */
public class UserService {
    //储存密码名字
    public void ste(String name,String password){

        Snameandpassword snameandpassword = new Snameandpassword();

        snameandpassword.set(name,password);
    }

    //验证用户名和密码
    public boolean cheaknamepassword(String getname,String getpassword) throws Exception {

        Cheakpn cheakpn = new Cheakpn();

        return (cheakpn.cheaknp(getname,getpassword));
    }



}
