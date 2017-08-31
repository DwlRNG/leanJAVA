<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/25
  Time: 15:54
  To change this template use File | Settings | File Templates.

  测试输入框不能为空的脚本

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>

    <script type="text/JavaScript">
        function beforeSubmit(form){
            if(form.username.value==''){
                alert('用户名不能为空！');
                form.username.focus();
                return false;
            }
            if(form.password.value==''){
                alert('密码不能为空！');
                form.password.focus();
                return false;
            }
            if(form.password.value.length<6){
                alert('密码至少为6位，请重新输入！');
                form.password.focus();
                return false;
            }
            if(form.password.value!=form.password2.value) {
                alert('你两次输入的密码不一致，请重新输入！');
                form.password2.focus();
                return false;
            }
            return true;
        }
    </script>

</head>
<body>


<center>
   <form method="post" name="form" onSubmit="return beforeSubmit(this);">

       用户名：<input type="text" name="username" >
       密   码：<input type="password" name="password" value="">
       重复密码：<input type="password" name="password2" value="">
       <input type="submit" name="tijiao">

   </form>



</center>




</body>
</html>
