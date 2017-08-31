package Daomain;

import java.util.List;

/**
 * Created by Dw.L on 2017/6/19.
 *
 * 查询条件类
 *
 */
public class UserQueryVo {

    private User1Customer user1Customer;

    List<Integer> ids;   //一个条件多个答案  解决方法 采用数组储存答案

    public List <Integer> getIds() {
        return ids;
    }

    public void setIds(List <Integer> ids) {
        this.ids = ids;
    }

    public User1Customer getUser1Customer() {
        return user1Customer;
    }

    public void setUser1Customer(User1Customer user1Customer) {
        this.user1Customer = user1Customer;
    }
}
