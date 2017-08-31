<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/4
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改员工信息</title>
</head>
<body style="background-color: bisque">

<script type="text/JavaScript">
    function beforeSubmit(form){
        if(form.workid.value==''){
            alert('员工编号不能为空！');
            form.workid.focus();
            return false;
        }
        if(form.workname.value==''){
            alert('员工职位不能为空！');
            form.workname.focus();
            return false;
        }
        if(form.name.value==''){
            alert('员工名字不能为空！');
            form.name.focus();
            return false;
        }
        if(form.gender.value==''){
            alert('员工性别不能为空！');
            form.gender.focus();
            return false;
        }
        if(form.phone.value==''){
            alert('员工电话不能为空！');
            form.phone.focus();
            return false;
        }
        return true;
    }
</script>

<%
    String temp2 = "";
    String remag = (String) session.getAttribute("remag");

    if (remag == null) {
        remag = temp2;
    }
%>

<br>
<br>
<center style="color: crimson"><h1>修改员工信息</h1></center>
<br>
<center style="color: crimson"><h1><%=remag%></h1></center>

<br>
<br>

<center style="color: #00d0e2"><form action="/Pimsys/Servlet" method="post" onSubmit="return beforeSubmit(this);">
    <input type="hidden" name="re" value="re">
    请输入员工编号:<input type="text" name="workid"><br><br>
    请输入员工职位:<input type="text" name="workname"><br><br>
    请输入员工姓名:<input type="text" name="name"><br><br>
    请输入员工电话:<input type="text" name="phone"><br><br>
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="radio" name="gender" value="男" /> 男
    <input type="radio" name="gender" value="女" /> 女<br><br>
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="修改">&nbsp&nbsp&nbsp&nbsp<input type="reset" name="重置">

</form></center>

</body>
</html>
