<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/9
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>是否确定修复</title>
</head>
<body style="background-color: #24a6aa">


<%
    String dormtablle = request.getParameter("dorm");
%>



<center style="color: coral">
    <br>
    <br>
    <br>
    <h1>是否确定修复</h1>
    <br>
    <br>
    <br>
    <form action="/WW/Allservlet" method="post">
        <input type="hidden" name="deletebaoxiu" value="deletebaoxiu">
        <input type="hidden" name="dorm" value="<%=dormtablle%>"><br>
        <input type="submit" value="修复">
    </form>

</center>

</body>
</html>
