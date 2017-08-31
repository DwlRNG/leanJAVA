package login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dw.L on 2017/4/19
 */
@WebServlet(name = "ProvingServlet")
public class ProvingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String uname = request.getParameter("uname");
        String utext = request.getParameter("utext");//得到输入的验证码
        String righttext =(String) request.getSession().getAttribute("righttext");//得到正确的图片验证码

        if (righttext.equalsIgnoreCase(utext)){
            request.getSession().setAttribute("uname",uname);
            response.sendRedirect("success.jsp");
        }else {
            request.setAttribute("badtext","验证码错误");
            RequestDispatcher re = request.getRequestDispatcher("login.jsp");
            re.forward(request,response);
        }

    }
}
