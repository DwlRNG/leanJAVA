package cn.dw.web.servlet;

import cn.dw.service.UserService.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dw.L on 2017/3/28.
 */
@WebServlet(name = "RegistServlet")
public class RegistServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setCharacterEncoding("utf-8"); //请求编码为utf-8
        response.setContentType("text/html,charset=utf-8");//响应编码为utf-8

        UserService userService = new UserService();


    }
}
