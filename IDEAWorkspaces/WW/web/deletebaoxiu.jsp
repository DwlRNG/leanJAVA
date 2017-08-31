<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/9
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除报修</title>
</head>
<body style="background-color: #24a6aa">

<%

    String dormtablle = request.getParameter("dorm");

%>



<center style="color: coral">
    <br>
    <br>
    <br>
    <h1>删除保修寝室</h1>
    <br>
    <br>
    <br>
    <form action="/WW/Allservlet" method="post">
        <input type="hidden" name="deletebaoxiu" value="deletebaoxiu">
        请输入要删除的保修寝室号:<input type="text" name="dorm"><br><br>
        <input type="submit" value="删除"> &nbsp&nbsp<input type="reset">
    </form>

</center>

</body>
</html>
