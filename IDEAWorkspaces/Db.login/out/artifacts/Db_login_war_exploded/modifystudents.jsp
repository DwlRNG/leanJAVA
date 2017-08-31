<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/23
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>modify</title>
</head>
<body>
<br>
<br>
<br>
<center><h1 style="color: brown">修改学生信息</h1></center>
<br>
<br>
<hr color="brown" size="5">
<br>
<br>
<center>

    <form action="AllServlet" method="post">
        <input type="hidden" name="modifystudents" value="modifystudents">
        请输入要修改学生的名字：&nbsp&nbsp<input type="text" name="sname"><br><br>
        请输入要修改学生的学号：&nbsp&nbsp<input type="text" name="smajor"><br><br>
        <input type="submit" value="查询">&nbsp&nbsp&nbsp&nbsp<input type="reset" value="重置">
    </form>

</center>


</body>
</html>
