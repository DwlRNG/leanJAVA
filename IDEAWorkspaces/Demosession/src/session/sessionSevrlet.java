package session;

import com.sun.javafx.runtime.SystemProperties;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Dw.L on 2017/3/21.  一个失败的登录
 */
public class sessionSevrlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String username =(String) request.getParameter("username");
        System.out.println(username);
        String password = (String) request.getParameter("password");


        if (!"dawei".equalsIgnoreCase(username)){

            HttpSession session = (HttpSession) request.getSession();
            session.setAttribute("username",username);
            response.sendRedirect("success1.jsp");

        }else {
            request.setAttribute("mag","用户名错误");
           RequestDispatcher re = request.getRequestDispatcher("login.jsp");
           re.forward(request,response);
        }


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
