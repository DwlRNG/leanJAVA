<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/3/21
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>

<h1>登录</h1>


<%
String ss = (String) request.getAttribute("mag");
String tt="";
if (ss==null){
    ss=tt;
}


%>

<form action="sessionSevrlet" method="post">
    用户名:<input type="text" name="username"><%= ss %><br>
    密  码:<input type="password" name="password"><br>
        <input type="submit" value="登录">


</form>


</body>
</html>
