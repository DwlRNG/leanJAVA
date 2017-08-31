<%@ page import="Db.login.mian.Students" %><%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/19
  Time: 15:09
  To change this template use File | Settings | File Templates.

  //展示查找到的学生信息
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show</title>
</head>



<body>

<%

    Students students =(Students) request.getAttribute("students");
    int sid = students.getSid() ;
    String sname = students.getSname();
    String sgender = students.getSgender();
    String smajir = students.getSmajor();
    String sclass = students.getSclass();
    String shome = students.getShome();
    String sphone = students.getSphone();
    String spassword = students.getSpassword();

%>





<br>
<br>
<center style="color: chartreuse"><h1>学生信息表</h1></center>
<br>
<br>
<hr color="chartreuse">

<table align="center" width="60%" border="1" style="color: chartreuse">

<tr>
    <th>学生编号</th>
    <th>姓名</th>
    <th>性别</th>
    <th>学号</th>
    <th>班级</th>
    <th>祖籍</th>
    <th>联系方式</th>
    <th>登录密码</th>
</tr>
    <tr>
        <th><%= sid%></th>
        <th><%= sname%></th>
        <th><%= sgender%></th>
        <th><%= smajir%></th>
        <th><%= sclass%></th>
        <th><%= shome%></th>
        <th><%= sphone%></th>
        <th><%= spassword%></th>
    </tr>






</table>








</body>
</html>
