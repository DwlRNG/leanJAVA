<%@ page import="java.util.List" %>
<%@ page import="PimSys.PimSysDaoMain.JdbcDaoMain" %><%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/5
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>查找结果展示界面</title>
</head>

<body>

<%

    List list = (List) session.getAttribute("list");

    request.setAttribute("list",list);
%>
<br>
<br>
<center><h1 style="color: red">查找到的员工</h1></center>
<br>
<br>
<table align="center" width="60%" border="1" style="color: brown">

    <tr style="color: #fff6c0;background-color: #00d0e2">
        <th>工作编号</th>
        <th>工作职位</th>
        <th>员工姓名</th>
        <th>员工性别</th>
        <th>员工电话</th>
    </tr>

 <c:forEach items="${requestScope.list}" var="lis">
    <tr style="color: #f66aff;background-color: #fae3f5">
        <th>${lis.workid}</th>
        <th>${lis.workname}</th>
        <th>${lis.name}</th>
        <th>${lis.gender}</th>
        <th>${lis.phone}</th>
    </tr>

 </c:forEach>

</table>



</body>
</html>
