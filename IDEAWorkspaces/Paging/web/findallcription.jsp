<%@ page import="daomain.PageBean" %><%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/12
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询</title>

    <script type="text/JavaScript">
        function yanzheng(form) {
            if (form.pc.value<=1){
                alert('已经是第一页！');
                form.pc.focus();
                return false;
            }
        }
    </script>

</head>
<body style="background-color: darkcyan">



<br>
<br>
<br>
<center>

    <h1 style="color: chocolate">多条件组合查询结果</h1>

</center>

<br>
<br>
<br>

<table style="background-color: #fff1bb" width="60%" align="center" border="1">

    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>国家</th>
    </tr>
    <c:forEach items="${pb2.beanList}" var="lis">

        <tr>
            <th>${lis.num}</th>
            <th>${lis.name}</th>
            <th>${lis.adderse}</th>
        </tr>


    </c:forEach>

</table>

<br>
<br>

<center style="color: #2cff24">

    第${pb2.pc}页/共${pb2.tp}页

    <a href="Servlet2?pc=1&&name=${pb2.name}&&home_id=${pb2.home_id}" style="color: crimson ; text-decoration:none">首页</a>

    <c:if test="${pb2.pc>1}">
        <a href="Servlet2?pc=${pb2.pc-1}&&name=${pb2.name}&&home_id=${pb2.home_id}" style="color: crimson ; text-decoration:none">上一页</a>
    </c:if>


    <c:choose>

        <c:when test="${pb2.tp}<=10">  <%--如果总页数小于分页数--%>
            <c:set var="begin2" value="1"/>
            <c:set var="end2" value="${pb2.tp}"/>
        </c:when>

        <c:otherwise>   <%--当总页数大于分页数--%>

            <c:set var="begin2" value="${pb2.pc-5}"/>

            <c:set var="end2" value="${pb2.pc+4}"/>

            <%--头溢出--%>
            <c:if test="${begin2<1}">
                <c:set var="begin2" value="1"/>
                <c:set var="end2" value="10"/>
            </c:if>

            <%--尾溢出--%>
            <c:if test="${end2>pb2.tp}">
                <c:set var="begin2" value="${pb2.tp - 9}"/>
                <c:set var="end2" value="${pb2.tp}"/>
            </c:if>
        </c:otherwise>
    </c:choose>

    <c:forEach var="i2" begin="${begin2}" end="${end2}">
        <c:choose>
            <c:when test="${i2 eq pb2.pc}">
                [${i2}]
            </c:when>

            <c:otherwise>
                <a href="Servlet2?pc=${i2}&&name=${pb2.name}&&home_id=${pb2.home_id}" style="color: #8d4700 ; text-decoration:none">${i2}</a>
            </c:otherwise>

        </c:choose>
    </c:forEach>


    <c:if test="${pb2.pc<pb2.tp}">

        <a href="Servlet2?pc=${pb2.pc+1}&&name=${pb2.name}&&home_id=${pb2.home_id}" style="color: crimson ; text-decoration:none">下一页</a>

    </c:if>

    <a href="Servlet2?pc=${pb2.tp}&&name=${pb2.name}&&home_id=${pb2.home_id}" style="color: crimson ; text-decoration:none">尾页</a>

</center>




</body>
</html>
