package login;

import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Dw.L on 2017/3/23.  登录页面调用photomake
 */
public class photo_servlet extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        photomake pm = new photomake(); //得到图片类的对象
        BufferedImage im = pm.getImage();//得到的一次性图片
        photomake.output(im,response.getOutputStream());//把一次性图片写入流中
        request.getSession().setAttribute("righttext",pm.getText());//把一次性图片的文本内容保存到session中
    }

}
