<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/15
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="text-align: center">

<form action="/Customer/BServlet" method="post">
    <h1>查找客户</h1>
    <hr size="5" color="blue">
    输入要查找的名字：<input type="text" name="findname" ><br>
    输入要查找的电话：<input type="text" name="findphone" ><br>
    <br>
    <input type="submit" value="查找">


</form>
</body>
</html>