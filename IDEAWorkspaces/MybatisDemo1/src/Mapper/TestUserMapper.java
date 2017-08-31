package Mapper;


import Daomain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Dw.L on 2017/6/19.
 */
public class TestUserMapper {


    @Test
    public void TsetUserMapper() throws Exception {

        String resource = "SqlMapConfig.xml";

        InputStream inputStream =  Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);




/*        int a = userMapper.deleteUser(9);   //删除测试
        System.out.println(a);
        sqlSession.close();*/



/*        User user = new User();            //更新数据库测试
        user.setId(2);
        user.setName("Mapper代理升级");
        int a = userMapper.updateUser(user);

        System.out.println(a);
        sqlSession.commit();
        sqlSession.close();*/



        User user = userMapper.findUserById(9);     //查找一个数据可测试
        System.out.println(user.getId()+"    "+user.getName());
        sqlSession.close();


/*        List<User> list = userMapper.findUserByMore("号");     //模糊查找数据测试

        for (User u:list) {

            System.out.println(u.getId()+"    "+u.getName());

        }
        sqlSession.close();
        */


/*        User user = new User();                 //添加测试
        user.setId(9);
        user.setName("刘德华");
        userMapper.insertUser(user);
        sqlSession.commit();
        sqlSession.close();*/

    }



}
