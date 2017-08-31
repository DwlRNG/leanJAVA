package Servlet;

import Daomian.User;
import net.sf.json.JSONArray;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

/**
 * Created by Dw.L on 2017/7/13.
 */


public class Sites extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        System.out.println("请求了Servlet");

        request.setCharacterEncoding("utf-8");

        User user1 = new User("DW.L1", "CN", "182****9791");
        User user2 = new User("DW.L2", "USA", "182****9792");
        User user3 = new User("DW.L3", "UK", "182****9793");
        User user4 = new User("DW.L4", "CK", "182****9794");

        List <User> list = new ArrayList <User>();

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);


        JSONArray sites = JSONArray.fromObject(list);
        response.getWriter().print(sites);


    }
}
