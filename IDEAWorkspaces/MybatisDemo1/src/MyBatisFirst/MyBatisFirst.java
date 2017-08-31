package MyBatisFirst;

import Daomain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * Created by Dw.L on 2017/6/18.
 * myBatis最原始的dao开发
 * 这个是Dao接口的实现类
 * Dao应该传递工厂过来
 * 然后在每一个方法中使用工厂创建sqlSession  因为sqlsession是线程不安全的
 */
public class MyBatisFirst {

    @Test
    public void FindUserById() throws IOException {  //查找一个

   /**
    *
    * myBatis流程  1.创建sqlMapConFig.xml  2.创建mapsal 用于配置映射的SQL
    *
    * 3.创建会话工厂  3.1将配置文件写入流  3.2将流传入工厂
    *
    * 4.通过会话工厂得到sqlsession
    *
    * 5.通过sqlsession操作数据库 （调用底层封装到statement的sql）
    *
    *
    * */

    String resource = "SqlMapConfig.xml";
    InputStream inputStream =  Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        /*第一个参数<mapper namespace="test"> user.xml  test 点上要查询的SQL的ID  第二个传递的参数*/
        User user = sqlSession.selectOne("test.findUserById", 1);

        sqlSession.close();                                                     //关闭

        System.out.println(user.getName());
    }



    @Test
    public  void FindUserMore() throws IOException {   //查找多个

        String resource = "SqlMapConfig.xml";
        InputStream inputStream =  Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

       List<User> list =  sqlSession.selectList("test.findUserByMore", "号");

        for (User s:list) {

            System.out.println(s.getId());
        }

       sqlSession.close();

    }

    @Test
    public void addUser() throws IOException {  //添加

        String resource = "SqlMapConfig.xml";

        InputStream inputStream =  Resources.getResourceAsStream(resource);//将SqlMapConfig.xml写入流

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);  //将流写入工厂

        SqlSession sqlSession = sqlSessionFactory.openSession();  //得到sqlsession 用于操作数据库

        User user = new User();

        user.setId(8);
        user.setName("8号");

        int a = sqlSession.insert("test.insertUser",user);

        System.out.println(a);

        sqlSession.commit();

        sqlSession.close();


    }



    @Test
    public void deleteUser() throws IOException {   //删除


        String resource = "SqlMapConfig.xml";

        //将SqlMapConfig.xml写入流

        InputStream inputStream =  Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();


        int a = sqlSession.delete("test.deleteUser", 8);

        System.out.println(a);

        sqlSession.commit();

        sqlSession.close();

    }

    @Test
    public void updateUser() throws IOException {


        String resource = "SqlMapConfig.xml";

        //将SqlMapConfig.xml写入流

        InputStream inputStream =  Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setName("1号已经升级");
        user.setId(1);

        int a = sqlSession.update("test.updateUser", user);

        sqlSession.commit();

        System.out.println("更新成功"+a);

        sqlSession.close();

    }




}
