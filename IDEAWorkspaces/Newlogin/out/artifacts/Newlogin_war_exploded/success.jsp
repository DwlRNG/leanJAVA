<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/9
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<%
    String name =(String) session.getAttribute("name");
    if(name==null){
        session.setAttribute("notname","未输入密码和名字");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Login.jsp");
        requestDispatcher.forward(request,response);
    }
%>

<h1>登录成功</h1>
欢迎<%= name%>


</body>
</html>
