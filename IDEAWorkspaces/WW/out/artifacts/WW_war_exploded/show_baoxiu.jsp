<%@ page import="daomian.baoxiu" %><%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/9
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>报修情况</title>
</head>
<body style="background-color: darkcyan">

<%
    baoxiu bx = (baoxiu) session.getAttribute("bx");
%>


<br>
<br>
<center style="color: coral"><h1>宿舍报修状况表</h1></center>
<br>
<br>
<table align="center" width="60%" border="1" style="color: cyan">

    <tr>
        <th>宿舍号</th>
        <th>报修人</th>
        <th>报修人学号</th>
        <th>报修情况</th>
    </tr>

    <tr>
        <th><%=bx.getDorm()%></th>
        <th><%=bx.getSnmae()%></th>
        <th><%=bx.getSnumber()%></th>
        <th><%=bx.getMag()%></th>
    </tr>




</table>

</body>
</html>
