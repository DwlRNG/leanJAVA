package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import daomian.baoxiu;
import daomian.wstudents;
import service.Allservice;

/**
 * Created by Dw.L on 2017/6/2.
 */
public class WWervlet extends HttpServlet {

    private Allservice allservice = new Allservice();  //Allservice注入


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("连接到ALLServlet");

        request.setCharacterEncoding("utf-8");

        String Login = request.getParameter("Login");//登录请求的方法
        String addstudents = request.getParameter("addstudents");//添加学生请求的方法
        String deletestudents = request.getParameter("deletestudents");//删除学生请求的方法
        String finstudents = request.getParameter("finstudents");//查找学生的方法
        String restudents = request.getParameter("restudents");//修改学生的方法
        String addbaoxiu = request.getParameter("addbaoxiu");//添加宿舍报修的方法
        String findbaoxiu = request.getParameter("findbaoxiu");//查看宿舍报修的方法
        String deletebaoxiu = request.getParameter("deletebaoxiu");//删除报修
        String findall = request.getParameter("findall");//查找全部学生信息
        String findallbaoxiu = request.getParameter("findallbaoxiu");//查找全部报修寝室


        //判断管理员登录
        if ("Login".equals(Login)) {


            String aname = request.getParameter("aname");
            String apassword = request.getParameter("apassword");


            try {
                boolean adminjude;
                adminjude = allservice.adminjude(aname, apassword);
                if (adminjude){
                    request.getSession().setAttribute("aname",aname);
                    response.sendRedirect("Menu.jsp");//转发到Menu.jsp
                }else if (adminjude==false){
                    request.setAttribute("badmassage","用户名或密码错误请重新输入");
                    RequestDispatcher re = request.getRequestDispatcher("index.jsp");//重定向到登录界面
                    re.forward(request,response);
                }


            } catch (PropertyVetoException e) {
                RequestDispatcher re = request.getRequestDispatcher("index.jsp");
            } catch (SQLException e) {
                RequestDispatcher re = request.getRequestDispatcher("index.jsp");
            }


        }

        //判断是否调用添加学生的方法
       else if ("addstudents".equals(addstudents)) {

            String sname = request.getParameter("sname");
            String sclass = request.getParameter("sclass");
            String snumber = request.getParameter("snumber");
            String sphone = request.getParameter("sphone");
            String dorm = request.getParameter("dorm");
            String sgender = request.getParameter("sgender");


            try {

                boolean addstudentsjude;
                addstudentsjude = allservice.addstudents(sname, sclass, snumber, sphone, dorm, sgender);

                if (addstudentsjude){
                    response.sendRedirect("show_success.jsp");
                } else {
                    request.getRequestDispatcher("show_bad.jsp");
                }


            } catch (PropertyVetoException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }

        //判断是否调用删除学生的方法

       else if ("deletestudents".equals(deletestudents)) {


            String sname = request.getParameter("sname");
            String snumber = request.getParameter("snumber");


            try {
                boolean deletestudentsjude;
                deletestudentsjude =  allservice.delestudents(snumber, sname);

                if (deletestudentsjude) {
                    response.sendRedirect("show_success.jsp");
                } else {
                    request.getRequestDispatcher("show_bad.jsp");
                }


            } catch (PropertyVetoException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }

        //判断是否调用查找学生的方法

       else if("finstudents".equals(finstudents)){

            String snumber = request.getParameter("snumber");
            String sname = request.getParameter("sname");

            try {

                wstudents ws;
                ws = allservice.find(snumber, sname);

                if (ws.getSclass() != null) {
                    request.getSession().setAttribute("ws",ws);
                    response.sendRedirect("show_find.jsp");
                }else{
                    request.getRequestDispatcher("show_bad.jsp");
                }


            } catch (PropertyVetoException e) {
                request.getRequestDispatcher("show_bad.jsp");
            } catch (SQLException e) {

                request.getRequestDispatcher("show_bad.jsp");

            }


        }


        //判断是否调用修改学生的方法

        else if("restudents".equals(restudents)){



            String sname = request.getParameter("sname");
            String sclass = request.getParameter("sclass");
            String snumber = request.getParameter("snumber");
            String sphone = request.getParameter("sphone");
            String dorm = request.getParameter("dorm");
            String sgender = request.getParameter("sgender");

            try {
                boolean restdentsjude;
                restdentsjude = allservice.restudents(sname,sclass,snumber,sphone,dorm,sgender);

                if (restdentsjude){
                    response.sendRedirect("show_success.jsp");
                }else {
                    request.getRequestDispatcher("show_bad.jsp");
                }

            } catch (PropertyVetoException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }

        //判断是否调用宿舍报修
        else if ("addbaoxiu".equals(addbaoxiu)){



            String dorm = request.getParameter("dorm");
            String mag = request.getParameter("mag");
            String sname = request.getParameter("sname");
            String snumber = request.getParameter("snumber");

            try {

                if (allservice.addbaoxiu(dorm, mag, sname, snumber)){
                    response.sendRedirect("show_success.jsp");

                }else {

                    request.getRequestDispatcher("show_bad.jsp");
                }

            } catch (PropertyVetoException e) {
                request.getRequestDispatcher("show_bad.jsp");

            } catch (SQLException e) {
                e.printStackTrace();
            }

            //判断是否调用查找报修
        } else if ("findbaoxiu".equals(findbaoxiu)) {

            String dorm = request.getParameter("dorm");
            try {

               baoxiu bx = allservice.findbaoxiu(dorm);
               String ss = bx.getSnumber();

                if (ss!=null) {
                    request.getSession().setAttribute("bx",bx);
                    response.sendRedirect("show_baoxiu.jsp");

                }else {
                    System.out.println("进入了错误的判断");
                    response.sendRedirect("show_bad.jsp");
                }


            } catch (PropertyVetoException e) {
                request.getRequestDispatcher("show_bad.jsp");
            } catch (SQLException e) {

                e.printStackTrace();
            }

        }

        //删除报修
        else if ("deletebaoxiu".equalsIgnoreCase(deletebaoxiu)) {

           String dorm =  request.getParameter("dorm");

            try {

                if (allservice.deletebaoxiu(dorm)) {

                    response.sendRedirect("show_success.jsp");
                }else{
                    response.sendRedirect("show_bad.jsp");
                }
            } catch (PropertyVetoException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        //查找全部学生
        else if ("findall".equalsIgnoreCase(findall)) {

            try {

                List list = allservice.findall();
                request.getSession().setAttribute("list",list);
                response.sendRedirect("show_alls.jsp");

            } catch (PropertyVetoException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        //查找全部宿舍
        else if ("findallbaoxiu".equalsIgnoreCase(findallbaoxiu)) {

            try {

                List listb = allservice.findallbaoxiu();
                request.getSession().setAttribute("listb",listb);
                response.sendRedirect("show_allb.jsp");

            } catch (PropertyVetoException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
