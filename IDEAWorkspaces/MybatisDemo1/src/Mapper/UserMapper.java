package Mapper;

import Daomain.User;

import java.util.List;

/**
 * Created by Dw.L on 2017/6/19.
 *
 * 2.第二步  UserMapper应该遵循的规则
 *
 *   2.1接口中的方法名应该和UserMapper.xml中相对应的sal（官方说法statement）语句的ID相同
 *
 *   2.2接口中方法输入参数应该和UserMapper.xml中相对应的sal（官方说法statement）语句的parameterType指定的类型一致
 *
 *   2.3接口中方法的返回参数应该和UserMapper.xml中相对应的sal（官方说法statement）语句的resultType指定的类型一致
 *
 *
 *
 *
 */
public interface UserMapper {

    //查找一个的方法
    public User findUserById(int id) throws Exception;

    //模糊查找
    public List <User> findUserByMore(String name) throws Exception;

    //添加
    public int insertUser(User user) throws Exception;     //可以设置返回值为 int 判断是否添加成功

    //修改
    public int updateUser(User user) throws Exception;     //可以设置返回值为 int 判断是否添加成功

    //删除
    public int deleteUser(int id) throws Exception;       //可以设置返回值为 int 判断是否添加成功



}
