package cn.dw.web.servlet;

import cn.dw.service.UserService.UserService;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dw.L on 2017/4/9.
 */
@WebServlet(name = "NewServlet")
public class NewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");            //请求编码为utf-8
        response.setContentType("text/html,charset=utf-8");//响应编码为utf-8
        String getusername = request.getParameter("username");//得到用户名
        String getpassword = request.getParameter("password");//得到密码
        System.out.println(getusername);
        System.out.println(getpassword);
        System.out.println("Hello");
        UserService userService = new UserService();
        try {

            if(userService.cheaknamepassword(getusername,getpassword)){
                request.getSession().setAttribute("name", getusername);
                response.sendRedirect("success.jsp");

            }else {
                response.sendRedirect("Login.jsp");

            }

        } catch (Exception e) {
            throw  new RuntimeException(e);
        }


    }
}
