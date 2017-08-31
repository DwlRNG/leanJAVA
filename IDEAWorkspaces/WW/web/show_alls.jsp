<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/9
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查找全部结果显示</title>
</head>
<body style="background-color: #24a6aa">

<%

    List list = (List) session.getAttribute("list");
    request.setAttribute("list",list);

%>

<center>

    <br>
    <br>
    <br>
    <h1 style="color: coral">超神学院全部学生</h1>
    <br>
    <br>
    <br>
    <table border="1" style="color: chartreuse">

<%--        /**
        * wstudents的JAVABEN
        *
        * mysql> desc wstudents;
        +---------+-------------+------+-----+---------+-------+
        | Field   | Type        | Null | Key | Default | Extra |
        +---------+-------------+------+-----+---------+-------+
        | sname   | varchar(50) | YES  |     | NULL    |       |
        | sclass  | varchar(50) | YES  |     | NULL    |       |
        | snumber | varchar(50) | YES  |     | NULL    |       |
        | sphone  | varchar(50) | YES  |     | NULL    |       |
        | dorm    | varchar(50) | YES  |     | NULL    |       |
        | sgender | varchar(20) | YES  |     | NULL    |       |
        +---------+-------------+------+-----+---------+-------+
        *
        * */--%>

        <tr>
            <th>姓名</th>
            <th>性别</th>
            <th>学号</th>
            <th>班级</th>
            <th>电话</th>
            <th>寝室</th>
        </tr>
        <c:forEach items="${requestScope.list}" var="lis">
            <tr>
                <th>${lis.sname}</th>
                <th>${lis.sgender}</th>
                <th>${lis.snumber}</th>
                <th>${lis.sclass}</th>
                <th>${lis.sphone}</th>
                <th>${lis.dorm}</th>
                <th><a href="restudent.jsp?snumber=${lis.snumber}"><button>修改</button></a></th>
                <th><a href="delete.jsp?snumber=${lis.snumber}&sname=${lis.sname}"><button>删除</button></a></th>
            </tr>
        </c:forEach>
    </table>
</center>

</body>
</html>
