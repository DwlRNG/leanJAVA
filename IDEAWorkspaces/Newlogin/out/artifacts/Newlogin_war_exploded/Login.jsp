<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/3/28
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" class="no-js">

<head>

    <meta charset="utf-8">
    <title>New Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
    <link rel="stylesheet" href="assets/css/reset.css">
    <link rel="stylesheet" href="assets/css/supersized.css">
    <link rel="stylesheet" href="assets/css/style.css">
    <![endif]-->


</head>

<body>
<%
    String s ="";
    String notname =(String) session.getAttribute("notname");
    if (notname==null){
        notname = s;
    }
%>

<div class="page-container">
    <h1>New Login</h1>
<%= notname %>
    <form action="/Newlogin/Servlet" method="post">
        <input type="text" name="username" class="username" placeholder="输入名字">
        <input type="password" name="password" class="password" placeholder="输入密码">
        <button type="submit">登录</button>
        <div class="error"><span>+</span></div>
    </form>
    <div class="connect">
        <p>Or connect with:</p>
        <p>
            <a class="facebook" href=""></a>
            <a class="twitter" href=""></a>
        </p>
    </div>
</div>
<div align="center">Collect from </div>


<script src="assets/js/jquery-1.8.2.min.js"></script>
<script src="assets/js/supersized.3.2.7.min.js"></script>
<script src="assets/js/supersized-init.js"></script>
<script src="assets/js/scripts.js"></script>

</body>

</html>
