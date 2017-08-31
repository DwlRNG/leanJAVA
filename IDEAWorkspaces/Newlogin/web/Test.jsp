<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/10
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/Servlet" method="post">
    <input type="text" name="username" class="username" placeholder="输入名字">
    <input type="password" name="password" class="password" placeholder="输入密码">
    <button type="submit">登录</button>
    <%--<div class="error"><span>+</span></div>--%>
</form>
</body>
</html>
