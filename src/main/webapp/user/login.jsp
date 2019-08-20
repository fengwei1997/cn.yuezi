<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2019-08-16
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="/doLogin">

    用户名：<input type="text" name="username" id="username" /><span style="color: red">${loginError}</span><br/>
    密  码：<input type="text" name="password" id="password" /><br/>
    <input type="submit" value="提交"/><br/>
</form>
</body>
</html>
