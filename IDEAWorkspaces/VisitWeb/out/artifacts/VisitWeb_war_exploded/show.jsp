<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/16
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">显示结果</h1>
<table align="center" width="60%" border="1">

<tr>
    <th>IP</th>
    <th>次数</th>
</tr>

<c:forEach items="${applicationScope.map}" var="entry">

    <tr>
        <th>${entry.key}</th>
        <th>${entry.value}</th>
    </tr>

</c:forEach>



</table>

</body>
</html>
