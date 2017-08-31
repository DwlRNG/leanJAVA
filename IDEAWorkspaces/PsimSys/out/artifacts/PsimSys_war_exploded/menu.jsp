<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/4
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>菜单</title>
</head>
<body STYLE="background-color: blueviolet">


<%

      String tem = "";
      String username = (String) session.getAttribute("uesrname");

      if (username == null) {

            username = tem;
      }

%>
      <center style="color: brown"><h1>欢迎管理员<%=username%>使用大卫人事管理系统</h1><br><br>

      <button><a href="find.jsp"style="text-decoration:none">查找员工</a></button>&nbsp&nbsp
      <button><a href="re.jsp"style="text-decoration:none">修改员工</a></button>&nbsp&nbsp
      <button><a href="add.jsp"style="text-decoration:none">添加员工</a></button>&nbsp&nbsp
      <button><a href="delete.jsp"style="text-decoration:none">删除员工</a></button>&nbsp&nbsp

            <br>
            <br>

       <form action="/Pimsys/Servlet" method="post">
            <input type="hidden" value="findall" name="findall">
            <input type="submit" value="查看全部">
      </form>

      </center>



</body>
</html>
