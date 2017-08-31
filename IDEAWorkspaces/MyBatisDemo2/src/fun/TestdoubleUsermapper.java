package fun;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import Userdao.doubleUserMapper;
import Daomain.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dw.L on 2017/6/20.
 */
public class TestdoubleUsermapper {

    @Test
    public void testdoubleUserMapper() throws Exception {  //动态SQL片段多条件多链表组合查询  3表联合查询

        String resource = "SqlMapConfig.xml";

        InputStream inputStream =  Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        doubleUserMapper doubleUserMapper = sqlSession.getMapper(doubleUserMapper.class);

        doublepojo doublepojo = new doublepojo();
        doublepojoCustomer doublepojoCustomer = new doublepojoCustomer();
        doublepojoCustomer.setCity("北京");
/*        doublepojoCustomer.setSex(2);*/
        doublepojo.setDoublepojoCustomer(doublepojoCustomer);
        List<doublepojoCustomer> list = doubleUserMapper.findRightCityForUser(doublepojo);


        for (doublepojoCustomer u1:list) {
            System.out.println("姓名:  "+u1.getName()+"  城市:  "+u1.getCity()+"   性别:"+u1.getSex_sex());
        }

        sqlSession.close();    //关闭连接


    }

}
