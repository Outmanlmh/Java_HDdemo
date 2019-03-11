<%--
  Created by IntelliJ IDEA.
  User: LMH
  Date: 2019.02.26
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>欢迎登陆睿乐购</p>
<form action="userController" method="post">
    账号：<input type="text" name="uname" >
    密码：<input type="password" name="pwd">
    <input type="submit" value="登录">
</form>

<%
//    java片段
    pageContext.setAttribute("pageContext","pageContext");
    request.setAttribute("request","request");
   // request.getRequestDispatcher("index.jsp").forward(request,response);

%>
<%= pageContext.getAttribute("pageContext")%>
<%= request.getAttribute("request")%>
</body>
</html>
