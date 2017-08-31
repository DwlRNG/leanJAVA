<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/21
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>adminmenue</title>
</head>
<body>

<%
    //来自添加学生的request域对象信息
    String temp = "";
    String addmassage = (String) request.getAttribute("massage");

    if (addmassage == null) {
        addmassage = temp;
    }

%>


<%
    //来自修改学生信息的request域对象的信息
    String temp1 = "";
    String addmassage1 = (String) request.getAttribute("massage1");

    if (addmassage1 == null) {
        addmassage1 = temp1;
    }

%>


<%
    //来自删除学生信息的request域对象的信息
    String temp2 = "";
    String deletemassage = (String) request.getAttribute("delete_massage");

    if (deletemassage == null) {
       deletemassage = temp2;
    }

%>




<center><h1>欢迎管理员使用大卫学生管理系统</h1></center>
<br>
<br>
<center><h1 style="color: aqua"><%= addmassage%></h1></center>
<center><h1 style="color: aqua"><%= addmassage1%></h1></center>
<center><h1 style="color: aqua"><%= deletemassage%></h1></center>
<hr color="read" size="5">
<center><button><a href="FindStudents.jsp" style="text-decoration:none">查询学生信息</a></button></center><br>
<center><button><a href="AddStudents.jsp" style="text-decoration:none">添加学生信息</a></button></center><br>
<center><button><a href="modifystudents.jsp" style="text-decoration:none">修改学生信息</a></button></center><br>
<center><button><a href="DeleteStudengs.jsp" style="text-decoration:none">删除学生信息</a></button></center><br>
</body>
</html>
