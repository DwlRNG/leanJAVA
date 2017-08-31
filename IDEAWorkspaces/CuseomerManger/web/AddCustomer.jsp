<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/14
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddCustomer</title>
</head>
<body style="text-align: center">
<form action="/CustomerManger/Servlet" method="">
    <input type="hidden" name="method" value="add">
    <h1>添加客户</h1>
    <hr size="5" color="yellow">
    添加客户序号：<input type="text" name="addname" ><br/>
    添加客户名字：<input type="text" name="addname"><br/>
    添加客户电话：<input type="text" name="number"> <br/>
    <label><input name="sex" type="radio" value="" />男</label>
    <label><input name="sex" type="radio" value="" />女</label><br>
    <br>
    <br>
    <input type="submit" value="添加">



</form>

</body>
</html>
