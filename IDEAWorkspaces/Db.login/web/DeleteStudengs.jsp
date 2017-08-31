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
    <title>删除学生信息</title>

</head>
<body>
<br>
<br>
<center style="color: #2f9a79"><h1>删除学生信息</h1></center>
<br>
<br>

<center style="color: brown">

    <form action="AllServlet" method="post">
        <input type="hidden" name="DeleteStudents" value="DeleteStudents">    <%-- 传递参数调用相应的方法--%>

        输入要删除的学生的姓名&nbsp&nbsp&nbsp<input type="text" name="sname"><br><br>
        输入要删除的学生的学号&nbsp&nbsp&nbsp<input type="text" name="smajor"><br><br>

        <input type="submit" value="提交">&nbsp&nbsp&nbsp<input type="reset" value="重置">


    </form>




</center>

</body>
</html>
