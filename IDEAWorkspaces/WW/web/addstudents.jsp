<%--
  Created by IntelliJ IDEA.
  User: wangwei
  Date: 2017/6/2
  Time: 0:12
  添加学生信息JSP
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生信息</title>
</head>


<body style="background-color: #24a6aa">
<center style="color: coral">
    <br><br><br><br>
<h1>添加学生信息</h1>
    <br><br><br><br>
<form action="/WW/Allservlet" method="post" style="color: chocolate">

    <input type="hidden" name="addstudents" value="addstudents">
       请输入学生名字:<input type="text" name="sname"><br><br><%--添加的学生的名字--%>
       请输入学生系部:<input type="text" name="sclass"><br><br><%--添加的学生系部--%>
       请输入学生学号:<input type="text" name="snumber"><br><br><%--添加的学生的宿舍--%>
       请输入学生电话:<input type="text" name="sphone"><br><br><%--添加学生的电话--%>
       请输入学生宿舍：<input type="text" name="dorm"><br><br><%--添加学生宿舍--%>
                     <input type="radio" name="sgender" value="男" /> 男
                     <input type="radio" name="sgender" value="女" /> 女<br><br>
       <input type="submit" value="注册">&nbsp&nbsp<input type="reset" value="重置">

</form>
</center>
</body>
</html>
