<%@ page import="daomain.PageBean" %><%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/6/12
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
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

<%
/*    PageBean pageBean = (PageBean) session.getAttribute("pageBean");*/
/*    request.setAttribute("pb",pageBean);*/
%>



<br>
<br>
<br>
<center>

    <h1 style="color: chocolate">查找结果</h1>

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
<c:forEach items="${pb.beanList}" var="lis">

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

    第${pb.pc}页/共${pb.tp}页

        <a href="Servlet?pc=1" style="color: crimson">首页</a>

    <c:if test="${pb.pc>1}">
        <a href="Servlet?pc=${pb.pc-1}" style="color: crimson">上一页</a>
    </c:if>

<%--计算 begin end--%>
    <c:choose>
        
        <c:when test="${pb.tp}<=10">  <%--如果总页数小于分页数--%>
            <c:set var="begin" value="1"/>
            <c:set var="end" value="${pb.tp}"/>
        </c:when>

        <c:otherwise>   <%--当总页数大于分页数--%>

            <c:set var="begin" value="${pb.pc-5}"/>

            <c:set var="end" value="${pb.pc+4}"/>

            <%--头溢出--%>
            <c:if test="${begin<1}">
                <c:set var="begin" value="1"/>
                <c:set var="end" value="10"/>
            </c:if>
            
            <%--尾溢出--%>
            <c:if test="${end>pb.tp}">
                <c:set var="begin" value="${pb.tp - 9}"/>
                <c:set var="end" value="${pb.tp}"/>
            </c:if>

        </c:otherwise>
    </c:choose>

    <c:forEach var="i" begin="${begin}" end="${end}">
        <c:choose>
            <c:when test="${i eq pb.pc}">
                [${i}]
            </c:when>

            <c:otherwise>
                <a href="Servlet?pc=${i}">${i}</a>
            </c:otherwise>

        </c:choose>
    </c:forEach>


    <c:if test="${pb.pc<pb.tp}">
        <a href="Servlet?pc=${pb.pc+1}" style="color: crimson">下一页</a>
    </c:if>

        <a href="Servlet?pc=${pb.tp}" style="color: crimson">尾页</a>

</center>




</body>
</html>
