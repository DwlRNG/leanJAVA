<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/9
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>申请报修</title>
</head>
<body style="background-color: blueviolet">



<center>
    <br>
    <br>
    <h1 style="color: #fff7c7">宿舍报修</h1>
    <br>
    <br>
<form action="/WW/Allservlet" method="post" style="color: bisque">
    <input type="hidden" name="addbaoxiu" value="addbaoxiu">
    请输入要报修的宿舍号:<input type="text" name="dorm" value="例如：4栋607"><br><br>
    请输入宿舍报修情况:<input type="text" name="mag"><br><br>
    请输入报修人姓名:<input type="text" name="sname"><br><br>
    请输入报修人学号:<input type="text" name="snumber"><br><br>
    <input type="submit" value="提交">
</form>
</center>

</body>
</html>
