<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/27
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json</title>

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

        window.onload = function (){

            var but = document.getElementById("but")

            but.onclick = function () {

                var httprequest = createXMLHttprequest();

                httprequest.open("GET","AllServlet2",true);

                httprequest.send(null);

                httprequest.onreadystatechange = function () {

                    if (httprequest.readyState == 4 && httprequest.state ==200) {

                        var masg  = httprequest.responseText;

                        document.getElementById("h11").innerHTML = masg;

                    }
                }
            }
        }

    </script>

</head>
<body>


<button id="but">点击</button>

<h1 id="h11"></h1>

</body>
</html>
