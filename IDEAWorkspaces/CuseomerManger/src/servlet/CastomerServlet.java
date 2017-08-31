package servlet;

import cn.itcast.commons.CommonUtils;
import cn.itcast.servlet.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import service.CastomerService;
import user.customer;

/**
 * Created by Dw.L on 2017/4/14.
 */
@WebServlet(name = "CastomerServlet")
public class CastomerServlet extends BaseServlet {
    private CastomerService castomerService = new CastomerService();


    public String add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        customer c = CommonUtils.toBean(request.getParameterMap(),customer.class);
        castomerService.add(c);
        request.setAttribute("msg","恭喜添加" +c.getCanme()+"客户成功");
        return "F:/success.jsp";
    }
}
