package dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import daomain.PageBean;
import daomain.pagingstudents;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dw.L on 2017/6/12.
 */
public class Dao {

    public PageBean<pagingstudents> findall(int pc, int ps) throws PropertyVetoException, SQLException {


        PageBean<pagingstudents> pageBean = new PageBean<pagingstudents>();
        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/readsql";
        String name = "root";
        String password = "123";

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);

        //得到tr  总记录数  pc当前页  ps每页查询数
        String sql = "select count(*) from pagingstudents";
        Number number =  (Number) queryRunner.query(sql,new ScalarHandler());
        int tr = number.intValue();

        System.out.println("进行了总数查询");

        pageBean.setTr(tr);
        pageBean.setPc(pc);
        pageBean.setPs(ps);
        String sql2 = "SELECT num,name,adderse FROM pagingstudents,paginghonme where pagingstudents.home_id=paginghonme.home_id LIMIT ?,?";
        List<pagingstudents> list = queryRunner.query(sql2, new BeanListHandler <pagingstudents>(pagingstudents.class), (pc-1) * ps, ps);
        pageBean.setBeanList(list);

        System.out.println("进行了分页查询");
        return pageBean;
    }


    /*
    @Test
    public void fun2() throws PropertyVetoException, SQLException {


        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/readsql";
        String name = "root";
        String password = "123";

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);

        int pc=1;
        int ps=8;

        String sql2 = "SELECT num,name,adderse FROM pagingstudents,paginghonme where pagingstudents.home_id=paginghonme.home_id LIMIT ?,?";

        List<pagingstudents> list = queryRunner.query(sql2, new BeanListHandler <pagingstudents>(pagingstudents.class), (pc-1) * ps, ps);

        for (pagingstudents s:list ) {

            System.out.println("编号:  "+s.getNum()+"     名字:  "+s.getName()+"    国家："+s.getAdderse());

        }

    }
*/



    public PageBean<pagingstudents> tiaojianfind(String pname,int home_id,int pc,int ps) throws PropertyVetoException, SQLException {

        PageBean<pagingstudents> pageBean = new PageBean<pagingstudents>();
        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/readsql";
        String name = "root";
        String password = "123";

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);

        List <Object> parms = new ArrayList<Object>();
        List <Object> parms2 = new ArrayList<Object>();


        pageBean.setPc(pc);
        pageBean.setPs(ps);
        pageBean.setHome_id(home_id);
        pageBean.setName(pname);

        String getpname = pname;
        int gethome_id = home_id;


        StringBuilder contsql = new StringBuilder("select count(*) from pagingstudents where 1=1");

        StringBuilder sql = new StringBuilder("select p.num,p.name,m.adderse from pagingstudents p,paginghonme m where p.home_id=m.home_id");

        String limitsql =" LIMIT ?,?";

        if (getpname != null && !getpname.trim().isEmpty()) {   //人名不为空就增加条件

            sql.append(" and p.name like ? ");
            contsql.append(" and name like ? ");
            parms.add(getpname+'%');                            //给问号赋值
            parms2.add(getpname+'%');
        }

        if (gethome_id != 0){                                   //国家不为空就增加条件

            sql.append(" and m.home_id=?");
            contsql.append(" and home_id=?");
            parms.add(gethome_id);                              //给问号赋值
            parms2.add(gethome_id);
        }

                                                                //给LIMIT问号赋值
        parms.add((pc-1)*ps );
        parms.add(ps);

        System.out.println(parms);

        Number number =  (Number) queryRunner.query(contsql.toString(),new ScalarHandler(),parms2.toArray());
        int Tr = number.intValue();
        pageBean.setTr(Tr);

        List<pagingstudents> list = queryRunner.query(sql.append(limitsql).toString(),   //多链表条件组合查询
                new BeanListHandler<pagingstudents>(pagingstudents.class),
                parms.toArray());

        pageBean.setBeanList(list);


        return pageBean;
    }




/*    @Test
    public void tiaojianfind() throws PropertyVetoException, SQLException {

        PageBean<pagingstudents> pageBean = new PageBean<pagingstudents>();
        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/readsql";
        String name = "root";
        String password = "123";

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);


        String getpname = "阿黛尔";
        int gethome_id = 6;
        int pc =1;
        int ps =10;

        List <Object> parms = new ArrayList<Object>();

        StringBuilder contsql = new StringBuilder("select count(*) from pagingstudents where 1=1");

        StringBuilder sql = new StringBuilder("select p.num,p.name,m.adderse from pagingstudents p,paginghonme m where p.home_id=m.home_id");

        String limitsql =" LIMIT ?,?";

        if (getpname != null && !getpname.trim().isEmpty()   ) {  //人名不为空就增加条件

            sql.append(" and p.name like ?");
            contsql.append(" and name like ?");
            parms.add(getpname+'%');                      //给问号赋值
        }

        if (gethome_id != 0){                                 //国家不为空就增加条件

            sql.append(" and m.home_id=?");
            contsql.append(" and home_id=?");
            parms.add(gethome_id);                            //给问号赋值
        }

        Number number =  (Number) queryRunner.query(contsql.toString(),new ScalarHandler(),parms.toArray());
        int Tr = number.intValue();
        System.out.println(Tr);


        parms.add((pc-1)*ps );
        parms.add(ps);

        List<pagingstudents> list = queryRunner.query(sql.append(limitsql).toString(),   //多链表条件组合查询
                new BeanListHandler<pagingstudents>(pagingstudents.class),
                parms.toArray());

        for (pagingstudents s:list ) {

            System.out.println("编号:  "+s.getNum()+"     名字:  "+s.getName()+"    国家："+s.getAdderse());

        }
    }*/






/*    @Test
    public void add() throws PropertyVetoException ,SQLException {

        String DriverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/readsql";
        String name = "root";
        String password = "123";

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(DriverClassName);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(name);
        comboPooledDataSource.setPassword(password);

        QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);

        String sql = "insert into pagingstudents values(?,?,?)";

        for (int i=154;i<=176;i++){
           queryRunner.update(sql, i, "钱妞" + i, 7);
           System.out.println("成功添加"+i);
        }

    }*/








}
