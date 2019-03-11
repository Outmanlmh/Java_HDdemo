<%@ page import="com.neuedu.pojo.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LMH
  Date: 2019.03.05
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        #tb {
            border: solid 1px #000;
            border-collapse: collapse;
        }

        #tb thead th, #tb tbody tr td {
            border: solid 1px #000;
            padding: 10px 5px;
        }
        ul{
            list-style: none;
        }
        ul li{
            border: solid 1px black;
            width: 50px;
            height: 20px;
            float: left;
            text-align: center;
            line-height: 20px;
        }
        ul li:hover {
            background-color: brown;
            color: #fff;
        }
        ul li a{
            text-decoration: none;
            color: black;
            display: block;
        }

    </style>
</head>
<body>



<form >
    <input type="text" name="keyword" value="${keyword}"><input type="submit" value="搜索">
</form>
<a href="add.do">添加</a><span>欢迎，${user_uname.uname}</span>
<table id="tb">
    <thead>
    <tr>
        <th>id</th>
        <th>uname</th>
        <th>password</th>
        <th>tele</th>
        <th>sex</th>
        <th>action</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lists.lists}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.uname}</td>
            <td>${user.password}</td>
            <td>${user.tele}</td>

            <%--<c:if test="${user.sex==1}">--%>
                <%--<td>男</td>--%>
            <%--</c:if>--%>
            <%--<c:if test="${user.sex==0}">--%>
                <%--<td>女</td>--%>
            <%--</c:if>--%>
            <%--jsp中的if-else  使用choose进行包裹--%>
            <c:choose>
                <c:when test="${user.sex==1}">
                    <td>男</td>
                </c:when>
                <c:otherwise>
                    <td>女</td>
                </c:otherwise>
            </c:choose>

            <td><a href="update.do?id=${user.id}">修改</a>&nbsp|&nbsp<a href="delete.do?id=${user.id}">删除</a></td>
        </tr>

    </c:forEach>
    <%--EL表达式
        搭配使用 jstl----标签库
     --%>

    </tbody>
</table>
<%--
    分页条
    1.格式  limit 0，4 从第0行开始，读取四条数据
    2.分页条信息
    首页 上一页 1 2 3 4 下一页 尾页
--%>
<%--<ul>--%>
    <%--<li><a href="#">首页</a></li>--%>
    <%--<li><a href="#">上一页</a></li>--%>
    <%--<li><a href="#">1</a></li>--%>
    <%--<li><a href="#">2</a></li>--%>
    <%--<li><a href="#">3</a></li>--%>
    <%--<li><a href="#">4</a></li>--%>
    <%--<li><a href="#">下一页</a></li>--%>
    <%--<li><a href="#">尾页</a></li>--%>
<%--</ul>--%>

${lists.pageView}
</body>
</html>
