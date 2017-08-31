<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/26
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>菜单</title>
</head>
<body>


<%

    String  temp1 = "";
    String name = request.getParameter("name");

    if (name == null) {
        name = temp1;
    }


%>
<h1><%= "你好啊"+name%></h1>
<button><a href="admin/admin.jsp">管理员</a></button><br>
<button><a href="vip/Vip.jsp">VIP入口</a></button><br>
<button><a href="user/Roadman.jsp">路人入口</a></button>

</body>
</html>
