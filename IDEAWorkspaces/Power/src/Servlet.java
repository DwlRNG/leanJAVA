import javax.servlet.RequestDispatcher;
import java.io.IOException;

/**
 * Created by Dw.L on 2017/4/26.
 */
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


       request.setCharacterEncoding("utf-8");
       String name =  request.getParameter("name");
       request.setAttribute("name",name);
       RequestDispatcher requestDispatcher =  request.getRequestDispatcher("menue.jsp");
       requestDispatcher.forward(request,response);

    }

}
