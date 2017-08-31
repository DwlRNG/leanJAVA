<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/3/21
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<h1>Success</h1>



<%
    String username =(String) session.getAttribute("username");
        if (username==null){
            request.setAttribute("mag","滚犊子还没填写名字");
            RequestDispatcher re = request.getRequestDispatcher("login.jsp");
            re.forward(request,response);
            return;
    }
%>

热烈欢迎<%= username%>


</body>
</html>
