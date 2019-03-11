<%--
  Created by IntelliJ IDEA.
  User: LMH
  Date: 2019.02.20
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JavaWeb_pro</title>
  </head>
  <body>
  <%--<form action="#" method="post">--%>
    <%--<input type="text" name="username"><br>--%>
    <%--<input type="password" name="password"><br>--%>
    <%--<input type="submit" value="测试http请求"><br>--%>
<%--</form>--%>
    <%= pageContext.getAttribute("pageContext")%>
    <%= request.getAttribute("request")%>

  </body>
</html>
