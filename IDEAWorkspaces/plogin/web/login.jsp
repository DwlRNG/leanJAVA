<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/3/23
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
<script type="text/javascript">
    function _change(){
    var ele = document.getElementById("v");
    ele.src="/plogin/photo_servlet?xxx="+new Date().getTime();
}

</script>

</head>
<body>

<%    //这段JSP是判断验证码是否为空的
    String temp = "";
    String bad =(String) request.getAttribute("badtext");
    if(bad==null){
        bad=temp;

    }
%>


<%

    //这段JSP是判断是否直接访问未登录界面的
    String ss ="";
    String notlogin = (String) request.getAttribute("mag");
    if(notlogin == null){
        notlogin=ss;
    }

%>


<h1>Weclcome Dawei Word</h1>
<%= notlogin %>
<form action="/plogin/ProvingServlet" method="post">
    <%= bad%><br>
    用户名:<input type="text" name="uname"><br>
    密 &nbsp 码:<input type="password" name="password"><br>
    验证码:<input type="text" name="utext" size="3">
    <img id="v" src="/plogin/photo_servlet" border="1"><a href="javascript:_change()">换一张</a><br> <%-- 图片路径设置为显示流文件 --%>
    <input type="submit" value="注册">
</form>


</body>
</html>
