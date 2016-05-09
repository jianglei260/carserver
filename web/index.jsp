<%--
  Created by IntelliJ IDEA.
  User: jianglei
  Date: 16/5/7
  Time: 下午9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
  <head>
    <title>hello</title>
  </head>
  <body>
  <%
    response.setHeader("refresh","1");
    Float speed= (Float) getServletConfig().getServletContext().getAttribute("speed");
    out.println("当前速度:"+speed);
  %>
  </body>
</html>
