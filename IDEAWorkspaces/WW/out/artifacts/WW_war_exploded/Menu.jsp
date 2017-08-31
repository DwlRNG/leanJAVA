<%--
  Created by IntelliJ IDEA.
  User: wangwei
  Date: 2017/6/2
  Time: 0:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>菜单</title>
</head>





<body style="background-color: bisque">


<%
    String name = (String) session.getAttribute("aname");

%>


<center>

    <br>
    <br>
    <br>
    <h1 style="color: red">欢迎管理员<%=name%>使用王伟宿舍管理系统</h1>

    <br>
    <br><br>

    <button name="add"><a href="addstudents.jsp">添加学生信息</a></button><br><br>
    <button name="find"><a href="find.jsp">查看学生信息</a></button><br><br>
    <button><a href="addbaoxiu.jsp">申请宿舍报修</a></button><br><br>
    <button><a href="findbaoxiu.jsp">查看宿舍报修</a></button><br><br>
    <button><a href="deletebaoxiu.jsp">删除报修的宿舍</a></button><br><br>
</center>
</body>
</html>
