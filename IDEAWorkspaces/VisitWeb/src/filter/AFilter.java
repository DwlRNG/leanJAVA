package filter;



import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Dw.L on 2017/4/16.
 */
public class AFilter implements javax.servlet.Filter {

   private FilterConfig filterConfig;


    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
       System.out.println("AFilter已经创建");

       /**
        *
        *
        * */

        ServletContext app = filterConfig.getServletContext();
        Map<String,Integer> map = (Map<String, Integer>) app.getAttribute("map");//得到map
        String ip = req.getRemoteAddr();//得到IP地址
        if (map.containsKey(ip)){//判断IP是否已经保存到map中 如果是在map中就让访问次数加一

            int cnt = map.get(ip)+1;//通过IP做钥匙得到value值访问次数
            map.put(ip, cnt);//重新保存IP与访问次数

        }else {//没有IP就新添加IP并加入访问次数
            map.put(ip, 1);
        }
        app.setAttribute("map",map); //重新保存到application中

        chain.doFilter(req, resp);

    }
//下面这个方法在服务器启动时就启动子启动一次

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {


        this.filterConfig = config;//得到config对象  为获取application


    }

}
