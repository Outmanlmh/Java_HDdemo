<%--
  Created by IntelliJ IDEA.
  User: LMH
  Date: 2019.03.05
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加成员</title>
</head>
<body>
<form method="post" action="doAdd.do">
    用户名：<input type="text" name="uname"><br>
    密  码：<input type="password" name="password"><br>
    电  话：<input type="text" name="tele"><br>
    性 别：<label>男<input type="radio" value="1" name="sex"></label><label>女<input type="radio"value="0" name="sex"></label><br>
    <input type="submit" value="ADD">
</form>
</body>
</html>
