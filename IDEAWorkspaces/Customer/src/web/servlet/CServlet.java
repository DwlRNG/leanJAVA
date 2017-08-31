package web.servlet;

import service.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dw.L on 2017/4/18.
 */
@WebServlet(name = "CServlet")
public class CServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Service service = new Service();
        try {
            String msg = request.getParameter("sendcid");
            String mag = msg;
            System.out.println(mag);
            int getback = service.Servicedelete(msg);

            if (getback == 1) {
                request.getSession().setAttribute("message",mag);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("delesuccess.jsp");
                requestDispatcher.forward(request,response);
            }else {
                request.getRequestDispatcher("deletesuccess2.jsp");
            }


        } catch (Exception e) {
            throw  new  RuntimeException(e);
        }
    }

}
