<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/3/23
  Time: 9:52
  图片生成类的servlet
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>

<%
    String uname =(String) session.getAttribute("uname");
    if(uname == null){
        request.setAttribute("mag","不能访问未登录界面请登录后访问");
        RequestDispatcher ree = request.getRequestDispatcher("login.jsp");
        ree.forward(request,response);
    }


%>


<h1>注册成功</h1>
欢迎<%= uname %>

</body>
</html>
