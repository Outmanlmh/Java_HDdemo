<%--
  Created by IntelliJ IDEA.
  User: LMH
  Date: 2019.03.11
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>uname</th>
        <th>password</th>
        <th>tele</th>
        <th>sex</th>
        <th>action</th>
    </tr>
    <thead>

    </thead>

</table>


<form method="post" action="list.do">
    id:<input type="text" name="id">
    用户名：<input type="text" name="uname">
    密&nbsp码：<input type="password" name="pwd">
    电话号码：<input type="text" name="tele">
</form>

</body>
</html>
