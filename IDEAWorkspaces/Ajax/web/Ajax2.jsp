<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/26
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>


<head>
    <title>ajax2</title>



    <script type="text/javascript">
        function createXMLHttprequest() {    /*建立得到异步对象的函数*/

            try { //相当于循环  为解决浏览器不能获取异步对象
                return new XMLHttpRequest();
            }
            catch(e){
                try{
                    return ActiveXObject("Msxml2.XMLHTTP");
                }catch (e){
                    try {
                        return ActiveXObject("Microsoft.XMLHTTP");
                    }catch (e){
                        alert("哥们用的啥浏览器啊");
                        throw  e;
                    }
                }
            }
        }

        window.onload = function () {    /* 添加监听器 文档加载完成过后会执行以下的代码 */

            var input1 = document.getElementById("input1");  /*通过ID得到输入框*/
            input1.onblur = function () {      /*给输入框失去焦点添加监听器*/

                /*AJAX的4步操作，得到服务器响应内容，把响应的结果显示到h1*/

                //1.得到异步对象
                var Httprequest = createXMLHttprequest();

                //2.调用Open函数  Open函数三大对象  请求方式请求的servlet的路径  是否为异步请求true
                Httprequest.open("POST", "AllServlet",true);

                //3.发送请求  Post请求设置请求头
                Httprequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");

                Httprequest.send("name="+input1.value);

                //4.给异步对象注册监听器

                Httprequest.onreadystatechange = function () {   //当Httprequest 的状态发生变化时执行  readyState5种状态参考java笔记


                    if (Httprequest.readyState == 4 && Httprequest.status == 200) { //双重判断  status页面响应状态

                        /*一般要执行的事件都放到这里 */

                        var text = Httprequest.responseText; //得到服务器响应的字符串
                        if(text == "1") {
                            var h4_1 = document.getElementById("h4_1");
                            h4_1.innerHTML ="用户名已被注册";

                        }else if (text == "0"){
                            var h4_2 = document.getElementById("h4_1");
                            h4_2.innerHTML ="用户名可用";
                        }
                    }
                }
            }
        }
    </script>




</head>


<body>
<br>
<br>
<br>

    <form>

       <center> 用户名：&nbsp&nbsp<input type="text" name="username" id="input1">
           <h4 id="h4_1" style="color: red"></h4>
           <h5 id="h4_2" style="color: chartreuse">
           </h5></center><br><br>
       <center>密&nbsp码：&nbsp&nbsp<input type="text" name="password" id="input2">
       </center> <br><br>
       <center><input type="submit" value="注册"></center>

    </form>


</body>
</html>
