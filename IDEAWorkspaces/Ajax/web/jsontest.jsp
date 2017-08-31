<%--suppress JSAnnotator --%>
<%--suppress ALL --%>
<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/27
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
    <script type="text/javascript">

        window.onload  = function () {

            var but = document.getElementById("but1");
            but.onclick = function () {

                var str = "{\"name\":\"大卫\",\"sex\":\"男\"}";
                var preson = eval("(" +str+ ")");
                alert(preson.name+","+preson.sex);
            }


        }


    </script>


</head>
<body>


<button id="but1">点击显示</button>

</body>
</html>
