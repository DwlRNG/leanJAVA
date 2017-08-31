package listener; /**
 * Created by Dw.L on 2017/4/16.
 */

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.LinkedHashMap;
import java.util.Map;

@WebListener()
public class AListener implements ServletContextListener {

/**
* 服务启动时创建map  保存到application中
* */


    public void contextInitialized(ServletContextEvent sce) {

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();//创建Map

        ServletContext application = sce.getServletContext();//保存Map

        application.setAttribute("map",map);

    }

    public void contextDestroyed(ServletContextEvent sce) {

    }

}
