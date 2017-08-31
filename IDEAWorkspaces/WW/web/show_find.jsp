<%@ page import="daomian.wstudents" %><%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/2
  展示查找到的学生信息
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示查找的学生信息</title>
</head>
<body style="background-color: #24a6aa">

<%
    wstudents jspws = (wstudents) session.getAttribute("ws");  //类型转换
    String sname = jspws.getSname();
    String sphone = jspws.getSphone();
    String sclass = jspws.getSclass();
    String dorm = jspws.getDorm();
    String sgender = jspws.getSgender();
    String snumbner = jspws.getSnumber();

%>

<center style="color: coral"><h1>学生详细信息</h1></center>

<table align="center" width="60%" border="1" style="color: chartreuse">

    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>寝室</th>
        <th>班级</th>
        <th>电话</th>
    </tr>
    <tr>
        <th><%= snumbner%> </th>
        <th><%= sname%>    </th>
        <th><%= sgender%>  </th>
        <th><%= dorm%>     </th>
        <th><%= sclass%>   </th>
        <th><%= sphone%>   </th>
        <th><a href="restudent.jsp?snumber=<%= snumbner %>"><button>修改</button></a></th>
        <th><a href="delete.jsp?snumber=<%= snumbner %>&sname=<%= sname %>"><button>删除</button></a></th>
    </tr>

</table>

</body>
</html>
