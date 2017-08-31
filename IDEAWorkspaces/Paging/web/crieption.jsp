<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/13
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>多条件组合查询</title>
</head>
<body style="background-color: darkcyan">


<br>
<br>
<br>


<center>

    <h1>高级搜索</h1>

    <form action="/Servlet2" method="post">
        姓名:
        <input type="text" name="name">
        <br>
        <br>
        <br>

        &nbsp&nbsp <select name="home_id">
            <option value="0" selected="selected">====选择国家====</option>
        <option value="1">中国</option>
        <option value="2">俄罗斯</option>
        <option value="3">美国</option>
        <option value="4">加拿大</option>
        <option value="5">英国</option>
        <option value="6">德国</option>
        <option value="7">意大利</option>
        <option value="8">法国</option>
        <option value="9">巴基斯坦</option>
        </select>

        <input type="hidden" name="pc" value="1">
        <br>
        <br>
        <br>
        &nbsp&nbsp<input type="submit" value="搜索">&nbsp&nbsp<input type="reset" value="重置">

    </form>


</center>




</body>
</html>
