<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/4
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除员工</title>
</head>
<body style="background-color: #ffd3bb">


<%

    String temp1 = "";
    String deletemag = (String) session.getAttribute("deletemag");
    if (deletemag == null) {
        deletemag = temp1;
    }
%>




<br>
<br>
<center style="color: #00d0e2"><h1>删除员工</h1></center>
<br>
<br>
<center style="color: #ff6adc;font-size: larger"><h3 style="color: red"><%=deletemag%></h3></center>

<center style="color: #ff6adc;font-size: larger">
    <form action="/Pimsys/Servlet" method="post">

        <input type="hidden" name="delete" value="delete">
        输入员工编号:<input type="text" name="workid" style="color: blue">    <br><br>
        <input type="submit" value="提交">&nbsp&nbsp<input type="reset" value="重置">
    </form>
</center>

</body>
</html>
