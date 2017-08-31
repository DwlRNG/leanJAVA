package web.servlet;

import domain.Domain;
import main.CustomerUser;
import service.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Dw.L on 2017/4/15.
 */
@WebServlet(name = "addServlet")
public class addServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        Service service = new Service();
        try {

            String getnumber = request.getParameter("addnumber");
            String getaddname = request.getParameter("addname");
            String getSex  = request.getParameter("addsex");
            String getphone  = request.getParameter("addphone");
            String outname = getaddname;

            int getbackRunny = service.Serviceadd(getnumber,getaddname,getSex,getphone);
            if (getbackRunny==1){
                request.getSession().setAttribute("uname",outname);
                response.sendRedirect("success.jsp");
            }else{
                response.sendRedirect("add.jsp");
            }

        } catch (PropertyVetoException e) {
            throw  new RuntimeException(e);
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }

    }

}

