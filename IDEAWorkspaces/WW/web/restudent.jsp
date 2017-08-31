<%--
  Created by IntelliJ IDEA.
  User: wangwei
  Date: 2017/6/2
  Time: 1:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更改学生住宿信息</title>
</head>
<body style="background-color: darkcyan">

<%
    String snumber = request.getParameter("snumber");
%>
<br>
<br>
<br>
<center style="color: coral"><h1>修改学生住宿信息</h1>
    <br>
    <br>
    <br>


<form action="/WW/Allservlet" method="post">

    <input type="hidden" name="restudents" value="restudents">
    <input type="hidden" name="snumber" value="<%=snumber%>"> <%--学号--%>
    请输入学生名字:<input type="text" name="sname"><br><br><%--添加的学生的名字--%>
    请输入学生系部:<input type="text" name="sclass"><br><br><%--添加的学生系部--%>
    请输入学生电话:<input type="text" name="sphone"><br><br><%--添加学生的电话--%>
    请输入学生宿舍：<input type="text" name="dorm"><br><br><%--添加学生宿舍--%>
    <input type="radio" name="sgender" value="男" /> 男
    <input type="radio" name="sgender" value="女" /> 女<br><br>
    <input type="submit" value="提交">&nbsp&nbsp<input type="reset" value="重置">

</form>
</center>

</body>
</html>
