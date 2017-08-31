package Userdao;

import Daomain.*;

import java.util.List;

/**
 * Created by Dw.L on 2017/6/19.
 *
 * UserMapper.xml的接口
 *
 */
public interface UserMapper {

    //多条件查询
    public List<User1Customer> findUserList(UserQueryVo userQueryVo) throws Exception;

    //多条件总数查询
    public int findCount(UserQueryVo userQueryVo) throws Exception;

    //多条件MAP返回映射查询  当查询的结果为多个数据时采用LIST集合类型为MAP映射的类
    public List<User1> findMap(UserQueryVo userQueryVo)throws Exception;

    //拼接式多条件组合查询直接映射类
    public List <User1> findUserlifisql(UserQueryVo userQueryVo) throws Exception;

    //拼接式多条件组合查询MAP映射类
    public List <User1> UserMapSql(UserQueryVo userQueryVo) throws Exception;

    //采用sql片段拼接多条件直接映射类
    public List <User1> findUserlifisqlpd(UserQueryVo userQueryVo) throws Exception;

    //采用sql片段拼接多条件MAP映射类
    public List <User1> UserMapSqlpd(UserQueryVo userQueryVo) throws Exception;








    public List<Tset2> findTest(Tset2 tset2) throws Exception;

}
