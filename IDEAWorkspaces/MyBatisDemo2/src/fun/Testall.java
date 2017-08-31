package fun;

import Daomain.*;
import Userdao.UserMapper;
import Userdao.doubleUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dw.L on 2017/6/19.
 */
public class Testall {

    @Test
    public void fun1UserMapperfindUserList() throws Exception {   //多条件组合查询直接映射类


        String resource = "SqlMapConfig.xml";

        InputStream inputStream =  Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);  //得到UserMapper

        UserQueryVo userQueryVo = new UserQueryVo();
        User1Customer user1Customer = new User1Customer();
        user1Customer.setSex(1);
        user1Customer.setName("赵本山");
        userQueryVo.setUser1Customer(user1Customer);




        List<User1Customer> list = userMapper.findUserList(userQueryVo);  //多条件查询

        for (User1Customer u1c:list) {
            System.out.println(u1c.getHome());
        }
        sqlSession.close();    //关闭连接


/*        int Count = userMapper.findCount(userQueryVo);                    //多条件查询总记录数

        System.out.println(Count);
        sqlSession.close();    //关闭连接
        */


    }




    @Test
    public void fun1UserMapperfindUserMap() throws Exception {   //多条件组合查询MAP映射类


        String resource = "SqlMapConfig.xml";

        InputStream inputStream =  Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);  //得到UserMapper

        UserQueryVo userQueryVo = new UserQueryVo();
        User1Customer user1Customer = new User1Customer();
        user1Customer.setSex(1);
        user1Customer.setName("赵本山");
        userQueryVo.setUser1Customer(user1Customer);


        List<User1> list = userMapper.findMap(userQueryVo);

        for (User1 u1:list) {
            System.out.println(u1.getName());
        }
        sqlSession.close();    //关闭连接
    }




    @Test
    public void testfindUserlifisql() throws Exception {   //动态多条件组合查询直接映射类


        String resource = "SqlMapConfig.xml";

        InputStream inputStream =  Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);  //得到UserMapper

        UserQueryVo userQueryVo = new UserQueryVo();
        User1Customer user1Customer = new User1Customer();
        user1Customer.setName("赵本山");
        userQueryVo.setUser1Customer(user1Customer);


        List<User1> list = userMapper.findUserlifisql(userQueryVo);

        for (User1 u1:list) {
            System.out.println(u1.getName());
        }
        sqlSession.close();    //关闭连接
    }


    @Test
    public void testUserLifeMapSql() throws Exception {   //动态多条件组合查询MAP映射类  想查哪列查哪列

        String resource = "SqlMapConfig.xml";

        InputStream inputStream =  Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);  //得到UserMapper

        UserQueryVo userQueryVo = new UserQueryVo();
        User1Customer user1Customer = new User1Customer();
        user1Customer.setName("赵本山");
        userQueryVo.setUser1Customer(user1Customer);

        List<User1> list = userMapper.UserMapSql(userQueryVo);

        //查询的只有  ID 与name 其他列为值0
        for (User1 u1:list) {
            System.out.println(u1.getSex());
        }
        sqlSession.close();    //关闭连接
    }



    @Test
    public void testfindUserlifisqlpd() throws Exception {   //采用SQL片段动态多条件组合查询直接映射类


        String resource = "SqlMapConfig.xml";

        InputStream inputStream =  Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);  //得到UserMapper

        UserQueryVo userQueryVo = new UserQueryVo();
        User1Customer user1Customer = new User1Customer();
        user1Customer.setName("赵本山");
        userQueryVo.setUser1Customer(user1Customer);


        List<User1> list = userMapper.findUserlifisqlpd(userQueryVo);

        for (User1 u1:list) {
            System.out.println(u1.getName());
        }
        sqlSession.close();    //关闭连接
    }


    @Test
    public void testUserMapSqlpd() throws Exception {   //采用SQL片段动态多条件组合查询MAP映射类  想查哪列查哪列

        String resource = "SqlMapConfig.xml";

        InputStream inputStream =  Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);  //得到UserMapper

        UserQueryVo userQueryVo = new UserQueryVo();
        User1Customer user1Customer = new User1Customer();
        user1Customer.setName("赵本山");
        userQueryVo.setUser1Customer(user1Customer);

        List<User1> list = userMapper.UserMapSqlpd(userQueryVo);

        //查询的只有  ID 与name 其他列为值0
        for (User1 u1:list) {
            System.out.println(u1.getSex());
        }

        sqlSession.close();    //关闭连接
    }


    @Test
    public void testUserMapSqlpdids() throws Exception {   //采用SQL片段动态多条件组合查询MAP映射类 同时查询多个id 想查哪列查哪列

        String resource = "SqlMapConfig.xml";

        InputStream inputStream =  Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);  //得到UserMapper

        List <Integer> ids = new ArrayList <Integer>();
        ids.add(1);
        ids.add(5);
        UserQueryVo userQueryVo = new UserQueryVo();
        userQueryVo.setIds(ids);

        List<User1> list = userMapper.UserMapSqlpd(userQueryVo);

        for (User1 u1:list) {
            System.out.println(u1.getName());
        }

        sqlSession.close();    //关闭连接
    }



























































@Test
    public void fun1() throws Exception {


        String resource = "SqlMapConfig.xml";

        InputStream inputStream =  Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);  //得到UserMapper

        Tset2 tset2 = new Tset2();
        Tset tset = new Tset();
        tset.setSex(1);
        tset.setName("赵本山");
        tset2.setTset(tset);
        List <Tset2> list = userMapper.findTest(tset2);

        System.out.println(list.size());

    }
}
