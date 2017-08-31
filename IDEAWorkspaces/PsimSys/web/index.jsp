<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/4
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>登录</title>

  <%-- 刷新验证码脚本 --%>
  <script type="text/javascript">
      function _change(){
          var ele = document.getElementById("photo");
          ele.src="/Pimsys/Photo?xxx="+new Date().getTime();
      }
  </script>

  <%--fomr表单验证脚本--%>
  <script type="text/JavaScript">
      function beforeSubmit(form){
          if(form.uesrname.value==''){
              alert('用户名不能为空！');
              form.uesrname.focus();
              return false;
          }
          if(form.userpassword.value==''){
              alert('密码不能为空！');
              form.userpassword.focus();
              return false;
          }
          if(form.jude.value==''){
              alert('验证码不能为空！');
              form.jude.focus();
              return false;
          }
          return true;
      }
  </script>


  <meta http-equiv="Pargma" content="no-cache">

</head>

<body style="background-color: #188d88">

<%

  String temp="";
  String namemag = (String) session.getAttribute("namemag");
  String judemag = (String) session.getAttribute("judemag");
  String passwordmag = (String) session.getAttribute("passwordmag");

  if (namemag==null){

      namemag=temp;
  }
  if (judemag == null) {

     judemag = temp;
  }

  if (passwordmag == null) {

    passwordmag = temp;
  }


%>



<center>

  <br>
  <br>
  <h1 style="color: red">欢迎使用大卫人事管理系统</h1>
  <br>
  <br>
  <hr color="bisque" size="5">
  <br>
  <br>

  <form action="/Pimsys/Servlet" method="post" onSubmit="return beforeSubmit(this);">

    <input type="hidden" name="login" value="login">
    用户名:     <input type="text" name="uesrname"><%=namemag%><br><br>
    密&nbsp码:  <input type="password" name="userpassword"><%=passwordmag%><br><br>
    验证码:     <input type="text" name="jude"><%=judemag%><br><br>
    &nbsp&nbsp <img src="/Pimsys/Photo" border="1" id="photo">  &nbsp&nbsp

  <button><a href="javascript:_change()" style="text-decoration:none">换一张</a></button><br><br>

               <input type="submit" value="登录">&nbsp&nbsp<input type="reset" value="重置">

  </form>

</center>




</body>
</html>
