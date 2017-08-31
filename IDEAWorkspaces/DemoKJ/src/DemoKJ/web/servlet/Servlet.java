package DemoKJ.web.servlet;

import DemoKJ.domain.User;
import DemoKJ.service.UserService;

import java.io.IOException;

/**
 * Created by Dw.L on 2017/3/27.
 */
public class Servlet extends javax.servlet.http.HttpServlet {


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        UserService userService = new UserService();
        User user = userService.find();
        request.setAttribute("user",user);
        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}
