package Servlet;

import daomain.PageBean;
import daomain.pagingstudents;
import service.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Dw.L on 2017/6/13.
 */
@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        System.out.println("连接到Servlet2");

        Service sevice = new Service();

        int pc = getPc(request);

        int ps = 10;

        System.out.println("传递的当前页是" + pc);
        int home = Integer.parseInt(request.getParameter("home_id"));

        String name = request.getParameter("name");


        try {

            PageBean<pagingstudents> pageBean2 = sevice.tiaojianfind(name,home, pc, ps);

            request.getSession().setAttribute("pb2",pageBean2);

            RequestDispatcher re = request.getRequestDispatcher("findallcription.jsp");
            re.forward(request,response);

        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    private int getPc(HttpServletRequest request){ //判定当前页面为不为空

        String value = request.getParameter("pc");
        if (value == null || value.trim().isEmpty()) {
            return 1;
        }

        int a = Integer.parseInt(value);

        System.out.println(value);

        return a;
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request, response);


    }
}
