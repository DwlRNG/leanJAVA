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
 * Created by Dw.L on 2017/6/12.
 */
@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("链接到Servlet");
        Service service = new Service();
        int pc = getPc(request); //得到当前页面
        int ps = 10;              //设定每页查询数


        System.out.println("PC:   "+pc);

        try {

            PageBean<pagingstudents> pageBean =  service.findall(pc, ps);

            request.getSession().setAttribute("pb",pageBean);

            RequestDispatcher re = request.getRequestDispatcher("findall.jsp");
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
        return Integer.parseInt(value);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

}
