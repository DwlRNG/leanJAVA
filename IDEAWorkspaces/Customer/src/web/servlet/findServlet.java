package web.servlet;


import domain.Domain;
import main.CustomerUser;
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
 * Created by Dw.L on 2017/4/15.
 */
@WebServlet(name = "findServlet")
public class findServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("findname");
        String phone = request.getParameter("findphone");
        Domain domain = new Domain();
        Service service = new Service();
        try {
            CustomerUser user = service.Servicefind(name, phone);
            /*CustomerUser user = domain.find(name, phone);*/
            request.setAttribute("user",user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("success2.jsp");
            dispatcher.forward(request,response);

        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
