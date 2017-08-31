<%--
  Created by IntelliJ IDEA.
  User: wangwei
  Date: 2017/6/1
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>学生宿舍管理系统</title>
  </head>
  <body style="background-color: darkcyan">


  <%
  String demo = "";
  String badmassage = request.getParameter("badmassage");
    if(badmassage!=null){
        demo=badmassage;
    }

  %>
<center style="color: coral">
  <br><br>
  <br>
  <h1>王伟学生宿舍管理系统</h1>

  <br><br>
  <br>
  <form action="/WW/Allservlet" method="post">

    <%=demo%>
    <input type="hidden" name="Login" value="Login">
    账户名:<input type="text" name="aname"><br><br>
    密&nbsp码:<input type="password" name="apassword"><br><br>
    &nbsp&nbsp<input type="submit" value="登录">&nbsp&nbsp
    <input type="reset" name="重置">

  </form>

</center>


  </body>
</html>
