<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/4/27
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>city</title>



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

        window.onload = function () {

            var sen = document.getElementById("sen");
            sen.onchage = function () {
                var xmlhttp = createXMLHttprequest();
                xmlhttp.open("POST", "Servet2", true);
                xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");  //设置请求头
                xmlhttp.send("sen=" + sen.value);
                xmlhttp.onreadystatechange = function () {

                    if (xmlhttp.readyState ==4 && xmlhttp.status ==200) {



                    }

                };
                
            };



        };





    </script>




</head>
<body>

<center style="color: brown"><h1>省市联动</h1></center>

<br>
<br>
<br>

<center style="color: chartreuse"><select name="sen" id="sen">

    <option>===选择省===</option>
    <option name="01" id="1"></option>
    <option name="02" id="2"></option>
    <option name="03" id="3"></option>
    <option name="04" id="4"></option>
    <option name="05" id="5"></option>
    <option name="06" id="6"></option>
    <option name="07" id="7"></option>

</select></center>

<br>
<br>
<br>



<center style="color: chartreuse" id="si"><select name="si">

    <option>===选择市===</option>
    <option name="11" id="11"></option>
    <option name="22" id="12"></option>
    <option name="33" id="13"></option>
    <option name="44" id="14"></option>
    <option name="55" id="15"></option>
    <option name="66" id="16"></option>
    <option name="77" id="17"></option>



</select></center>



</body>
</html>
