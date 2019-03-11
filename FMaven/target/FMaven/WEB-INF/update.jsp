
<%--
  Created by IntelliJ IDEA.
  User: LMH
  Date: 2019.03.06
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="doUpdate.do">
    <input type="hidden" name="id" value="${user.id}" >
    用户名：<input type="text" name="uname"value="${user.uname}"><br>
    密   码：<input type="password" name="password"value="${user.password}"><br>
    电   话：<input type="text" name="tele"value="${user.tele}"><br>
    性 别：<label>男<input type="radio" value="1" name="sex"<c:if test="${user.sex==1}"> checked="checked"</c:if>></label><label>女<input type="radio"value="0" name="sex"<c:if test="${user.sex==0}"> checked="checked"</c:if>></label><br>
    <input type="submit" value="update">
</form>
</body>
</html>
