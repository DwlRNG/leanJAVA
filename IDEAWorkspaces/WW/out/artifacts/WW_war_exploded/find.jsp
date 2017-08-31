<%--
  Created by IntelliJ IDEA.
  User:wangwei
  Date: 2017/6/2
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>查看学生信息</title>
</head>
<body style="background-color: #24a6aa">
<center style="color: coral">
<br>
<br>
<br>
<h1>查看学生住宿信息</h1>
<br>
<br>
<br>
<form action="/WW/Allservlet" method="post" style="color: crimson">
    <input type="hidden" name="finstudents" value="finstudents">
    输入要查找的学生的学号:<input type="text" name="snumber">
    输入要查找的学生的姓名:<input type="text" name="sname">
                         <input type="submit" value="查找">
</form>

<form action="/WW/Allservlet" method="post" style="color: crimson">

    <input type="hidden" value="findall" name="findall">
    快速查找:<input type="submit" value="查找全部">
</form>
</center>
</body>
</html>
