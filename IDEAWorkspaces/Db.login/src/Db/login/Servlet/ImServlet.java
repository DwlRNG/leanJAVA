package Db.login.Servlet;

import Db.login.Service.Jude;
import Db.login.mian.Students;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Dw.L on 2017/4/22.
 */
@WebServlet(name = "ImServlet")
public class ImServlet extends HttpServlet {
    private Jude jude = new Jude();             //service 依赖
    /**
     * 登录验证方法
     * */
    public void login(HttpServletRequest request, HttpServletResponse response, String getname,String getpassword,String getcode) throws ServletException, IOException, PropertyVetoException, SQLException {

        request.setCharacterEncoding("utf-8");

        String truecode =(String) request.getSession().getAttribute("turecode");  //得到正确的验证码

        /*System.out.println(truecode+"  "+getname+"  "+getpassword+"  "+getcode);  测试值是否从Servlet传递过来了*/

        if (truecode.equalsIgnoreCase(getcode) && getname.contains("admin")&& jude.AdminJude(getname, getpassword)){   //如果验证码与管理员特殊字符与密码正确

            System.out.println("调用到这里了1");
            request.getSession().setAttribute("adminnanme", getname);
            response.sendRedirect("adminmenue.jsp");

        }else if (truecode.equalsIgnoreCase(getcode) && jude.StudetsJude(getname, getpassword)) {   //如果验证码与学生信息正确

            System.out.println("调用到这里了2");
            request.getSession().setAttribute("studentsname", getname);
            response.sendRedirect("studentsmenus.jsp");

        }else{

            /**
             *System.out.println("调用到验证码错误了");
             *
             * */
            request.setAttribute("falsmassage","验证码错误");
            RequestDispatcher re  = request.getRequestDispatcher("Login.jsp");
            re.forward(request,response);
        }


    }

    /**
     * 管理员添加学生方法
     * */


    public  void  adminaddstudents(HttpServletRequest request, HttpServletResponse response,
                                   String getsid,String getsname, String getsgender ,String getsmajor,String getsclass,String getshome,String getsphone,String getspassword) throws ServletException, IOException, PropertyVetoException, SQLException {

        /*System.out.println("好的调用好Im的方法了");*/

        if (jude.adminaddstudents(getsid, getsname,  getsgender , getsmajor , getsclass,  getshome, getsphone , getspassword)){
            request.setAttribute("massage","添加学生"+getsname+"成功");
            RequestDispatcher re = request.getRequestDispatcher("adminmenue.jsp");
            re.forward(request,response);

        }

        response.sendRedirect("Login,jsp");







    }


    /**
     * 查询学生信息方法
     */


    public void find(HttpServletRequest request, HttpServletResponse response, String sname, String smajor) throws ServletException, IOException, PropertyVetoException, SQLException {

        System.out.println(sname+"值已经到达 Imservlet  "+smajor);
        Students students = jude.adminfindstudents(sname, smajor);

        System.out.println("返回到IM的ID为："+students.getSid());

        if (!students.getSname().equals("null")){

            request.setAttribute("students", students);

            RequestDispatcher re = request.getRequestDispatcher("Show.jsp");

            re.forward(request,response);

        }






    }


    /**
     * 修改学生信息的方法之查询
     */

    public void modifystudents1(HttpServletRequest request, HttpServletResponse response, String sname, String smajor) throws ServletException, IOException, PropertyVetoException, SQLException {
        /*System.out.println("到达IMservlet"+"   "+sname+"   "+smajor);*/


        Students students = jude.find(sname, smajor);
       /* System.out.println("返回来了"+students.getShome());*/

        if (!students.getSphone().equals(null)) {
            request.setAttribute("modifly",students);
            RequestDispatcher re = request.getRequestDispatcher("SShow.jsp");
            re.forward(request,response);
        }


    }




    /**
     * 修改学生信息方法之修改
     * */
    public void modifystudents2(HttpServletRequest request, HttpServletResponse response,
                                String getsid,String getsname, String getsgender ,String getsmajor,
                                String getsclass, String getshome,String getsphone,String getspassword) throws ServletException, IOException {
        /*System.out.println("Imservlet:"+getsid + getsname + getsmajor + getsclass + getshome + getsphone + getspassword + getsgender);*/

        try {
            if (jude.modify(getsid, getsname,  getsgender , getsmajor , getsclass,  getshome, getsphone , getspassword)) {

                request.setAttribute("massage1","修改"+getsname+"学生信息成功");
                RequestDispatcher re = request.getRequestDispatcher("adminmenue.jsp");
                re.forward(request,response);
            }
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }


    /**
     *
     * 删除学生的方法之查找
     *
     * */

    public void finddelet(HttpServletRequest request, HttpServletResponse response,String sname, String smajor) throws ServletException, IOException, PropertyVetoException, SQLException {

       /* System.out.println("到达Imservlet得到的值是：   "+sname);*/
        Students students = jude.find(sname, smajor);

        /*System.out.println("从dao返回值是  "+students.getSid());*/

        if (!students.getSphone().equals(null)) {
            request.setAttribute("deletemassgae",students);
            RequestDispatcher re = request.getRequestDispatcher("DShow.jsp");
            re.forward(request,response);
        }



    }

    /**
     *
     * 删除学生的方法之删除
     *
     * */


    public void deletestudents(HttpServletRequest request, HttpServletResponse response,String sname,String smajor){

        try {

            if (jude.delete(sname,smajor)){

                request.setAttribute("delete_massage","成功删除学生： "+sname);

                RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminmenue.jsp");

                requestDispatcher.forward(request,response);

            }

        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }







}
