<%--
  Created by IntelliJ IDEA.
  User: Dw.L
  Date: 2017/8/27
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>AJAVCity</title>
    <script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
  </head>
  <body>


  <div class="dropdown">
    <button type="button" class="btn dropdown-toggle" id="dropdownMenu"
            data-toggle="dropdown">
      省份
      <span class="caret"></span>
    </button>
    <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
      <li role="presentation" class="dropdown-header">下拉菜单标题</li>
      <li role="presentation" >
        <p role="menuitem"> 北京</p>
      </li>
      <li role="presentation">
        <a role="menuitem" tabindex="-1" href="#">重庆</a>
      </li>
      <li role="presentation">
        <a role="menuitem" tabindex="-1" href="#">贵州</a>
      </li>
    </ul>
  </div>

  <script>
      $(document).ready(function(){
          $("p").click(function(){
          $.post("/Ajax/Servlet",
              {
                  name:"Donald Duck",
                  city:"Duckburg"
              },
              function(data,status){
                  alert("数据：" + data + "\n状态：" + status);
              });
      });
      });
  </script>


  <script>
      $(document).ready(function(){
          $("a").click(function(){
              $.get("/Ajax/Servlet",
                  {
                      name:"Donald Duck",
                      city:"Duckburg"
                  },
                  function(status){
                      alert("\n状态：" + status);
                  });
          });
      });
  </script>


  </body>
</html>
