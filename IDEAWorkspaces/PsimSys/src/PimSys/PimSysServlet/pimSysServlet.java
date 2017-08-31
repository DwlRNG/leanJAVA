package PimSys.PimSysServlet;

import PimSys.PimSysService.JdbcService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Dw.L on 2017/6/4.
 */

@WebServlet(name = "pimSysServlet")

public class pimSysServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /**
         *
         * jdbcService.judeadminanmae();调用这个方法传递 用户名和密码 dao层判断  用户名  和 密码是否正确
         *
         * */

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcService jdbcService = (JdbcService) applicationContext.getBean("jdbcService");

        request.setCharacterEncoding("utf-8");

        String login = request.getParameter("login");//index判断方法值

        String findall = request.getParameter("findall");//查找全部人员的判断方法

        String findone = request.getParameter("findone");//查找一个员工的判断方法

        String delete = request.getParameter("delete");//删除员工的判断方法

        String add = request.getParameter("add");//添加员工的方法

        String re = request.getParameter("re");



        if ("login".equals(login)){




            String truecode = (String) request.getSession().getAttribute("turecode");  //正确验证码
            String jude = request.getParameter("jude");                                //页面传递验证码
            String uesrname = request.getParameter("uesrname");                        //页面传递用户名
            String userpassword = request.getParameter("userpassword");                //页面传递密码
            String daojude = jdbcService.judeadminanmae(uesrname,userpassword);           //dao层返回的判断值





            //判断验证码是否正确
            if (truecode.equalsIgnoreCase(jude)) {


                //验证 密码是否正确
                if ("trueright".equals(daojude)){

                    request.getSession().setAttribute("uesrname",uesrname);
                    response.sendRedirect("menu.jsp");

                }else if("apasswordfals".equals(daojude)){  //验证用户名是否正确 正确则发送密码错误消息

                    request.getSession().setAttribute("passwordmag","密码错误");

                    //设置用户名错误信息为空
                    request.getSession().setAttribute("namemag",null);

                    //设置验证码错误信息为空
                    request.getSession().setAttribute("judemag",null);

                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
                    requestDispatcher.forward(request,response);

                }else {  //否则发送用户名错误消息
                    request.getSession().setAttribute("namemag","用户名错误");

                    //设置密码错误为空
                    request.getSession().setAttribute("passwordmag",null);

                    //设置验证码错误信息为空
                    request.getSession().setAttribute("judemag",null);

                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
                    requestDispatcher.forward(request,response);
                }
            }else {
                request.getSession().setAttribute("judemag","验证码错误");

                //设置用户名错误信息为空
                request.getSession().setAttribute("namemag",null);

                //设置密码错误为空
                request.getSession().setAttribute("passwordmag",null);

                RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
                requestDispatcher.forward(request,response);
            }


        } else if ("findall".equalsIgnoreCase(findall)) { //查找全部员工信息


            request.getSession().setAttribute("list",jdbcService.findall());
            response.sendRedirect("show.jsp");




        }else if ("findone".equals(findone)){  //查找某个员工信息

            String workid = request.getParameter("workid");

            if (jdbcService.findone(workid)){ //判断这个员工存不存在

                request.getSession().setAttribute("list",jdbcService.findallone(workid));
                response.sendRedirect("show.jsp");
            }else {

                System.out.println("员工不存在");

                request.getSession().setAttribute("fingmag","员工编号不存在");
                response.sendRedirect("find.jsp");
            }

        } else if ("delete".equals(delete)) {//删除某个员工的信息

            String workid = request.getParameter("workid");
            if (jdbcService.findone(workid)) { //判断这个员工存不存在

                jdbcService.delete(workid);
                request.getSession().setAttribute("workid",workid);
                response.sendRedirect("succes.jsp");


            }else {

                request.getSession().setAttribute("deletemag","员工编号不存在");
                response.sendRedirect("delete.jsp");

            }

        } else if ("add".equals(add)) {

            String workid = request.getParameter("workid");
            String workname = request.getParameter("workname");
            String name = request.getParameter("name");
            String gender = request.getParameter("gender");
            String phone = request.getParameter("phone");


            if (!jdbcService.findone(workid)) { //判断这个员工存不存在

                if (jdbcService.add(workid, workname, name, gender, phone)){ //如果正确添加员工

                    request.getSession().setAttribute("workid",workid);
                    response.sendRedirect("succes.jsp");

                }else {
                    request.getSession().setAttribute("addmag","员工编号已经存在!!!");
                    response.sendRedirect("add.jsp");

                }
            }else {
                request.getSession().setAttribute("addmag","员工编号已经存在!!!");
                response.sendRedirect("add.jsp");

            }



        } else if ("re".equals(re)) {

            String workid = request.getParameter("workid");
            String workname = request.getParameter("workname");
            String name = request.getParameter("name");
            String gender = request.getParameter("gender");
            String phone = request.getParameter("phone");

            if (jdbcService.findone(workid)) { //判断这个员工存不存在

                if (jdbcService.rework(workid, workname, name, gender, phone)) { //验证修改成功不成功

                    request.getSession().setAttribute("workid",workid);
                    response.sendRedirect("succes.jsp");
                }else {
                    request.getSession().setAttribute("remag","添加失败");
                    response.sendRedirect("re.jsp");
                }

            }else {
                request.getSession().setAttribute("remag","员工编号不存在无法修改！！！");
                response.sendRedirect("re.jsp");
            }



        }






    }


}
