<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/9
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>全部宿舍详情</title>
</head>
<body style="background-color: #24a6aa">

<%
    List listb = (List) session.getAttribute("listb");
    request.setAttribute("list",listb);
%>

<center>

    <br>
    <br>
    <br>
    <h1 style="color: coral">超神学院全部学生宿舍报修表</h1>
    <br>
    <br>
    <br>
    <table border="1" style="color: #ffe355">


<%--
        /**
        *
        * mysql> desc baoxiu;
        +---------+--------------+------+-----+---------+-------+
        | Field   | Type         | Null | Key | Default | Extra |
        +---------+--------------+------+-----+---------+-------+
        | dorm    | varchar(15)  | YES  |     | NULL    |       |
        | mag     | varchar(500) | YES  |     | NULL    |       |
        | snmae   | varchar(50)  | YES  |     | NULL    |       |
        | snumber | varchar(30)  | YES  |     | NULL    |       |
        +---------+--------------+------+-----+---------+-------+
        *
        * */
--%>

        <tr>
            <th>寝室</th>
            <th>报修人姓名</th>
            <th>学号</th>
            <th>报修信息</th>
        </tr>
        <c:forEach items="${requestScope.list}" var="lisb">
            <tr>
                <th>${lisb.dorm}</th>
                <th>${lisb.snmae}</th>
                <th>${lisb.snumber}</th>
                <th>${lisb.mag}</th>
                <th><a href="xiufu.jsp?dorm=${lisb.dorm}"><button>确认修复</button></a></th>
            </tr>
        </c:forEach>
    </table>
</center>

</body>
</html>
