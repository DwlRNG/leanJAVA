import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dw.L on 2017/4/26.
 */
@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");  //请求编码
        response.setContentType("text/html;charset=utf-8");//响应编码

        String ajax = "{\"name\":\"大卫\",\"sex\":\"超人\"}";
        System.out.println("hello AJAX");

        response.getWriter().print(ajax);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");//响应编码

        System.out.println("(Post:)hello AJAX");

        String name = request.getParameter("name");

        System.out.println(name);

        if (name.equalsIgnoreCase("dawei")){   //判断名字是不是dawei

            response.getWriter().print("1");  //向页面发送请求的结果

        }else {

            response.getWriter().print("0");  //向页面发送请求的结果
        }

    }


}
