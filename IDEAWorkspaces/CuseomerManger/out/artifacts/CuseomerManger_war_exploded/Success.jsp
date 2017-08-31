<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/14
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head >
<body style="text-align: center">
<h1>登录成功</h1>
<hr size="5" color="pink">
<%= session.getAttribute("msg")%>
</body>
</html>
