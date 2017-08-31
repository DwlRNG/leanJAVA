<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/19
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<br>
<br>

<center style="color: chartreuse"><h1>查看学生信息</h1></center>
<br>
<br>
<hr color="chartreuse">
<br>
<br>
<center>

    <form action="/plusServlet" method="post">
        <input type="hidden" name="FindStudents" value="FindStudents">    <%-- 传递参数调用相应的方法--%>

        学生姓名：&nbsp&nbsp<input type="text" name="sname"><br><br>
        学生学号：&nbsp&nbsp<input type="text" name="smajor"><br><br>
        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="查询">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="reset" value="重置">

    </form>

</center>


</body>
</html>
