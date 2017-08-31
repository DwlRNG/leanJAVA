<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/12
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>INDEX</title>
  </head>
  <body>

  <center>

    <form method="post" action="/Servlet">
      <input type="hidden" name="pc" value="1">
      <input type="submit" value="点击查询">
    </form>

    <button><a href="crieption.jsp">高级搜索</a></button>

  </center>


  </body>
</html>
