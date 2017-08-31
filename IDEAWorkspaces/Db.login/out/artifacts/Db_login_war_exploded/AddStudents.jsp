<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/19
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<br>
<br>
<center style="color: black"><h1>注册学生</h1></center>
<br>
<br>
<hr color="blue" size="5">
<center style="color: #ff003a">

    <form action="/plusServlet" method="post">
        <input type="hidden" name="Students" value="Students">     <%-- 传递参数调用相应的方法--%>

        请输入学生编号: <input type="text" name="sid"><br><br>
        请输入学生姓名：<input type="text" name="sname"><br><br>
        请输入学生学号：<input type="text" name="smajor"><br><br>
        请输入学生班级：<input type="text" name="sclass"><br><br>
        请输入学生祖籍：<input type="text" name="shome"><br><br>
        请输入学生电话：<input type="text" name="sphone"><br><br>
        请输入学生密码：<input type="text" name="spassword"><br><br>
                      <input type="radio" name="sgender" value="男" /> 男
                      <input type="radio" name="sgender" value="女" /> 女<br><br>
        <input type="submit" value="注册">&nbsp&nbsp<input type="reset" value="重置">
    </form>

</center>

</body>
</html>
