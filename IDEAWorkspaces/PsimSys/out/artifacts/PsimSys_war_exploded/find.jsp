<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/4
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查找员工</title>
</head>
<body style="background-color: #ffd3bb">


<%

    String temp1 = "";
    String fingmag = (String) session.getAttribute("fingmag");
    if (fingmag == null) {
        fingmag = temp1;
    }
%>




<br>
<br>
<center style="color: #00d0e2"><h1>查找员工</h1></center>
<br>
<br>

<center style="color: #ff6adc;font-size: larger">
<form action="/Pimsys/Servlet" method="post">

    <input type="hidden" name="findone" value="findone">
    输入员工编号:<input type="text" name="workid" style="color: blue">    <br><br>
    <h3 style="color: red"><%=fingmag%></h3>
    <input type="submit" value="提交">&nbsp&nbsp<input type="reset" value="重置">
</form>
</center>

</body>
</html>
