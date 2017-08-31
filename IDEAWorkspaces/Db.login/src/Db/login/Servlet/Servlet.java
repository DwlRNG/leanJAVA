package Db.login.Servlet;




import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;


/**
 * Created by Dw.L on 2017/4/19.    这个servlet继承了Imservlet只需调用里面的方法即可
 */
@WebServlet(name = "Servlet")
public class Servlet extends ImServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String Login = request.getParameter("Login");                         //来自login.jsp的参数  调用相应的方法
        String AddAdmin = request.getParameter("AddAdmin");                   //来自AddAdmin.JSP的参数
        String Addstudents = request.getParameter("Students");                //来自Addstudents.JSP的参数
        String Deletestudents = request.getParameter("DeleteStudents");       //来自Deletestudents.JSP的参数
        String FindStudents = request.getParameter("FindStudents");           //来自FindStudents.JSP的参数
        String modifystudents = request.getParameter("modifystudents");       //来自ReStudents.JSP的参数
        String sshow = request.getParameter("sshow");                         //来自SShow.jsp的参数
        String delete = request.getParameter("delete");                       //来自DShow.jsp的参数


        /*String truecode =(String) request.getSession().getAttribute("turecode");  //得到正确的验证码*/
       /* System.out.println(truecode);   测试是否得到验证码*/
        /*System.out.println("Addstudents:"+Addstudents);
        System.out.println("login:"+Login);
        System.out.println("Students".equals(Addstudents));测试传递过来的参数是否正确*/

        System.out.println("已经到了Servlet");

        if("Login".equals(Login)){                                              //验证LOgin.JSP传递过来的参数是否正确  登录判断方法

            String getname = request.getParameter("name");
            String getpassword = request.getParameter("password");
            String getcode = request.getParameter("code");
            System.out.println(getname + getpassword + getcode);  //测试是否得到正确的值

                ImServlet imServlet = new ImServlet();
                try {
                    imServlet.login(request,response,getname,getpassword,getcode);
                } catch (PropertyVetoException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }




        } else if ("Students".equals(Addstudents)) {                              //验证Addstudent.JSP传递过来的参数是否正确 管理员添加学生方法
            /*Addstudents
            * 得到JSP传递过来的参数
            * */
            /*System.out.println("调用到这里了2222");*/


            String getsid = request.getParameter("sid");
            String getsname = request.getParameter("sname");
            String getsmajor = request.getParameter("smajor");
            String getsclass = request.getParameter("sclass");
            String getshome = request.getParameter("shome");
            String getsphone = request.getParameter("sphone");
            String getspassword = request.getParameter("spassword");
            String getsgender = request.getParameter("sgender");


            ImServlet imServlet = new ImServlet();

            /*System.out.println(getsid + getsname + getsmajor + getsclass + getshome + getsphone + getspassword + getsgender);*/


            try {
                imServlet.adminaddstudents(request, response, getsid, getsname,  getsgender , getsmajor , getsclass,  getshome, getsphone , getspassword);
            } catch (PropertyVetoException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        } else if ("FindStudents".equals(FindStudents)) {                   //验证FindStudents.jsp传递过来的值   调用管理员查询学生信息方法


            String getsname = request.getParameter("sname");
            String getsmajor = request.getParameter("smajor");

            ImServlet imServlet = new ImServlet();
            System.out.println("到达ALLservlet"+getsname+"   "+getsmajor);
            try {
                imServlet.find(request,response,getsname,getsmajor);
            } catch (PropertyVetoException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else if ("modifystudents".equals(modifystudents)) {              // 验证modifystudents.jsp传递过来的值    修改学生方法之查询


            String sname = request.getParameter("sname");
            String smajor = request.getParameter("smajor");

            ImServlet imServlet = new ImServlet();

            /*System.out.println("到达ALLservlet"+sname+"   "+smajor);*/

            try{

                imServlet.modifystudents1(request,response,sname,smajor);

            } catch (Exception e) {
                throw new RuntimeException(e);
        }

        } else if ("sshow".equals(sshow)) {                                   // 验证SShow.jsp传递过来的值    修改学生方法之查询

            String getsid = request.getParameter("ssid");
            String getsname = request.getParameter("ssname");
            String getsmajor = request.getParameter("ssmajor");
            String getsclass = request.getParameter("ssclass");
            String getshome = request.getParameter("sshome");
            String getsphone = request.getParameter("ssphone");
            String getspassword = request.getParameter("sspassword");
            String getsgender = request.getParameter("ssgender");

            /*System.out.println("Allservlet:"+getsid + getsname + getsmajor + getsclass + getshome + getsphone + getspassword + getsgender);*/

            ImServlet imServlet = new ImServlet();

            try{
            imServlet.modifystudents2(request, response, getsid, getsname,  getsgender , getsmajor ,
                                                         getsclass,  getshome, getsphone , getspassword);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        } else if ("DeleteStudents".equals(Deletestudents)) {

            String getsanme = request.getParameter("sname");
            String getsmajor = request.getParameter("smajor");

           /* System.out.println("到达ALLservlet：   "+getsanme+"   "+getsmajor);*/

            ImServlet imServlet = new ImServlet();

            try {

                imServlet.finddelet(request,response,getsanme,getsmajor);


            } catch (PropertyVetoException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        } else if ("delete".equals(delete)) {

            String delete_sname = request.getParameter("delete_name");
            String delete_smajor = request.getParameter("delete_major");

            ImServlet imServlet = new ImServlet();

            imServlet.deletestudents(request,response,delete_sname,delete_smajor);

        }


    }










}
