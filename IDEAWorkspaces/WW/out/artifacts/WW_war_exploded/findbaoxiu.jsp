<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/9
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查找报修</title>
</head>
<body style="background-color: #24a6aa">


<center style="color: coral">
    <br>
    <br>
    <h1>查找报修</h1>
    <br>
    <br>
    <form action="/WW/Allservlet" method="post">
        <input type="hidden" value="findbaoxiu" name="findbaoxiu">
        请输入要查找的宿舍:<input type="text" name="dorm" value="例如：4栋606">
        <input type="submit" value="查找">
    </form>


    <form action="/WW/Allservlet" method="post" style="color: crimson">

        <input type="hidden" value="findallbaoxiu" name="findallbaoxiu">
        快速查找:<input type="submit" value="查找全部宿舍">
    </form>

</center>


</body>
</html>
