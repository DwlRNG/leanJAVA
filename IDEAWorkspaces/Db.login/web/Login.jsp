<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/19
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
<%-- 刷新验证码脚本 --%>
    <script type="text/javascript">
        function _change(){
            var ele = document.getElementById("v");
            ele.src="/photo_servlet?xxx="+new Date().getTime();
        }
    </script>


</head>
<body>



<%
    /*
    * 判断验证码是否正确
    *
    * */
    String temp1 = "";
    String massage = (String) request.getAttribute("falsmassage");
    if (massage==null){
        massage = temp1;
    }

%>


<br>
<br>
<br>
<center>
    <h1 style="color: #ff0006">大卫学生管理系统</h1>
</center>

<hr color="read" size="5">

<br>
<br>
<br>
<center>

    <form action="/plusServlet" method="post">
        <input type="hidden" name="Login" value="Login">

        姓&nbsp名:<input type="text" name="name"> <br><br>
        密&nbsp码:<input type="password" name="password"> <br><br>
        &nbsp&nbsp&nbsp&nbsp&nbsp验证码:<input type="text" name="code" size="10">&nbsp&nbsp<%= massage %>
        &nbsp<img id="v" src="/photo_servlet" border="1" >&nbsp&nbsp<a href="javascript:_change()" style="text-decoration:none">换一张</a><br> <%-- 图片路径设置为显示流文件 --%>
        <br>
        <br>
        &nbsp&nbsp&nbsp<input type="submit" value="登录">
        &nbsp&nbsp<button><a href="RejstStudents.jsp" style="text-decoration:none">注册</a></button>&nbsp&nbsp
    </form>

</center>


</body>
</html>
