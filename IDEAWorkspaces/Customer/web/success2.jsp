<%@ page import="main.CustomerUser" %><%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/15
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查找成功</title>
</head>
<body style="text-align: center">
<%

    CustomerUser user = (CustomerUser) request.getAttribute("user");
    System.out.println(user.getCanme());
%>
<h1>客户详细信息</h1>
客户ID:<%= user.getCid() %>  &nbsp &nbsp
姓名:<%= user.getCanme() %>  &nbsp &nbsp
性别:<%= user.getGender() %>  &nbsp &nbsp
电话:<%= user.getCphone() %>


</body>
</html>
