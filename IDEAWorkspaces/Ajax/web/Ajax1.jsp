<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/26
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Ajax1</title>

    <script type="text/javascript">
        function createXMLHttprequest() {    /*得到异步对象*/

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

            var but1 = document.getElementById("but1");  /*通过ID得到按钮*/
            but1.onclick = function () {      /*给按钮添加点击事件*/

                /*AJAX的4步操作，得到服务器响应内容，把响应的结果显示到h1*/

                //1.得到异步对象
                var Httprequest = createXMLHttprequest();

                //2.调用Open函数  Open函数三大对象  请求方式请求的servlet的路径  是否为异步请求true
                Httprequest.open("GEt", "AllServlet",true);

                //3.发送请求  get请求没有请求体但是也要给出null  某些浏览器坑不能发送 比如firefox
                Httprequest.send(null);

                //4.给异步对象注册监听器

                Httprequest.onreadystatechange = function () {   //当Httprequest 的状态发生变化时执行  readyState5种状态参考java笔记


                    if (Httprequest.readyState == 4 && Httprequest.status == 200) { //双重判断  status页面响应状态

                        /*一般要执行的事件都放到这里 */

                        var text = Httprequest.responseText; //得到服务器响应的字符串  如果是json需 执行 1  与 2

                        var p = eval("(" + text + ")");   //1.解析json串
                        var s = p.name+","+p.sex;         //2.将解析的串转换为字符串

                        var h11 = document.getElementById("h11");
                        h11.innerHTML = s;
                    }
                }
            }
        }
    </script>

</head>
<body>

<center><button id="but1">点击这里</button></center>
<center><h1 id="h11"></h1></center>

</body>
</html>
