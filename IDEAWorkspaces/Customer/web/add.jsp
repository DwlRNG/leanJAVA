<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/15
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddCustomer</title>
</head>
<%-- <input type="hidden" name="method" value="add"> --%>
<body style="text-align: center">
<form action="/Customer/Servlet" method="post">
    <h1>添加客户</h1>
    <hr size="5" color="yellow">
    添加客户序号：<input type="text" name="addnumber" ><br/>
    添加客户名字：<input type="text" name="addname"><br/>
    添加客户性别：<input type="text" name="addsex"><br/>
    添加客户电话：<input type="text" name="addphone"> <br/>
    <br>
    <input type="submit" value="添加">



</form>

</body>
</html>
