<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/18
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除</title>
</head>
<body style="text-align: center">
<h1>     </h1>
<hr size="5" color="green">
<%
    String mag = (String) request.getAttribute("message");

%>

<%= "已经成功删除序列号为"+mag+"的客户"%>





</body>
</html>