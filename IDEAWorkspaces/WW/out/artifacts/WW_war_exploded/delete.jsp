<%--
  Created by IntelliJ IDEA.
  User: wangwei
  Date: 2017/6/2
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除学生信息</title>
</head>
<body style="background-color: #24a6aa">
<center style="color: coral">
    <br><br><br><br>

<%
    String snumber = request.getParameter("snumber");
    String sname = request.getParameter("sname");
%>

<h1>是否删除学生信息</h1>
    <br><br><br><br>
<form action="/WW/Allservlet" method="post">

    <input type="hidden" name="deletestudents" value="deletestudents">
    <input type="hidden" name="snumber" value="<%=snumber%>"> <%--学号--%>
    <input type="hidden" name="sname" value="<%=sname%>">     <%--姓名--%>
    <center><input type="submit" value="删除"></center>
</form>
</center>


</body>
</html>
