<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/25
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Db.login.mian.Students" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除学生信息</title>
</head>
<body>

<%
    Students students =(Students) request.getAttribute("deletemassgae");
    int sid = students.getSid() ;
    String sname = students.getSname();
    String sgender = students.getSgender();
    String smajor = students.getSmajor();
    String sclass = students.getSclass();
    String shome = students.getShome();
    String sphone = students.getSphone();
    String spassword = students.getSpassword();
%>





<br>
<br>
<center style="color: #2f9a79"><h1>准备删除学生的信息</h1></center>
<br>
<br>
<hr color="5F639A">

<table align="center" width="60%" border="1" style="color: chartreuse">

    <tr>
        <th>学生编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>学号</th>
        <th>班级</th>
        <th>祖籍</th>
        <th>联系方式</th>
        <th>登录密码</th>
    </tr>
    <tr>
        <th><%= sid%></th>
        <th><%= sname%></th>
        <th><%= sgender%></th>
        <th><%= smajor%></th>
        <th><%= sclass%></th>
        <th><%= shome%></th>
        <th><%= sphone%></th>
        <th><%= spassword%></th>
    </tr>

</table>
<br>
<br>
<center style="color: #ff0006">

    <form action="AllServlet" method="post">
        <input type="hidden" name="delete" value="delete">  <%--判断参数--%>
        <input type="hidden" name="delete_name" value="<%= sname %>"> <%--需要删除的信息的名字--%>
        <input type="hidden" name="delete_major" value="<%= smajor%>">  <%--需要删除的信息的名字--%>
        <input type="submit" value="确认删除" size="15">&nbsp&nbsp&nbsp&nbsp<a href="DeleteStudengs.jsp"><input type="button" value="取消"></a>
    </form>


</center>




</body>
</html>
