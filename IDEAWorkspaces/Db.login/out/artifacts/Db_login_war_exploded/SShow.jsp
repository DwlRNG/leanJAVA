<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/25
  Time: 15:34
  To change this template use File | Settings | File Templates.

  展示修改学生信息
--%>
<%@ page import="Db.login.mian.Students" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/JavaScript">
        function beforeSubmit(form){
            if(form.ssname.value==''){
                alert('用户名不能为空！');
                form.ssname.focus();
                return false;
            }
            if(form.ssmajor.value==''){
                alert('学号不能为空！');
                form.ssmajor.focus();
                return false;
            }
            if(form.ssclass.value==''){
                alert('班级不能为空！');
                form.ssclass.focus();
                return false;
            }
            if(form.sshome.value==''){
                alert('祖籍不能为空！');
                form.sshome.focus();
                return false;
            }
            if(form.ssphone.value==''){
                alert('祖籍不能为空！');
                form.ssphone.focus();
                return false;
            }
            if(form.sspassword.value==''){
                alert('密码不能为空！');
                form.sspassword.focus();
                return false;
            }
            if(form.sspassword.value.length<6){
                alert('密码至少为6位，请重新输入！');
                form.password.focus();
                return false;
            }
            if(form.sspassword.value!=form.sspassword2.value) {
                alert('你两次输入的密码不一致，请重新输入！');
                form.sspassword2.focus();
                return false;
            }
            return true;
        }
    </script>
    <title>修改学生信息</title>


</head>

<body>

<%
    Students students =(Students) request.getAttribute("modifly");
    int sid = students.getSid() ;
    String sname = students.getSname();
    String sgender = students.getSgender();
    String smajir = students.getSmajor();
    String sclass = students.getSclass();
    String shome = students.getShome();
    String sphone = students.getSphone();
    String spassword = students.getSpassword();
%>





<br>
<br>
<center style="color: #2f9a79"><h1>修改信息</h1></center>
<br>
<br>
<hr color="#2f9a79">

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
        <th><%= smajir%></th>
        <th><%= sclass%></th>
        <th><%= shome%></th>
        <th><%= sphone%></th>
        <th><%= spassword%></th>
    </tr>

</table>

<br>

<br>
<center style="color: #2e31ff">
    <form action="AllServlet" method="post" onSubmit="return beforeSubmit(this);">

        <input type="hidden" name="sshow" value="sshow">   <%--方法调用参数--%>
        <input type="hidden" name="ssid" value="<%= sid %>">
        输入新的学生姓名：&nbsp&nbsp<input type="text" name="ssname" >                    <br><br>
        输入新的学生学号：&nbsp&nbsp<input type="text" name="ssmajor" >                   <br><br>
        输入新的学生班级：&nbsp&nbsp<input type="text" name="ssclass">                    <br><br>
        输入新的学生祖籍：&nbsp&nbsp<input type="text" name="sshome" >                    <br><br>
        输入新的学生电话：&nbsp&nbsp<input type="text" name="ssphone" >                   <br><br>
        输入新的学生密码：&nbsp&nbsp<input type="text" name="sspassword">                 <br><br>
        确认新的学生密码：&nbsp&nbsp<input type="text" name="sspassword2">                 <br><br>
        <input type="radio" name="ssgender" value="男" /> 男
        <input type="radio" name="ssgender" value="女" /> 女<br><br>
        <input type="submit" value="提交">&nbsp&nbsp&nbsp&nbsp<input type="reset" value="重置">

    </form>

</center>



</body>

</html>
