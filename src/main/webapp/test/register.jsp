<%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2019/8/21
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册用户</title>
</head>
<body>
<form method="get" action="/doRegister">
    账户名：<input type="text" name="username" id="username" /><br/>
    密  码：<input type="text" name="password" id="password" /><br/>
    真实姓名:<input type="text" name="name" id="name" /><br/>
    电话:<input type="text" name="phone" id="phone"><br>
    邮箱:<input type="text" name="email" id="email"><br>
    其他联系方式:<input type="text" name="otherPhone">
    注册会员途径:
    <select name="wayId">
        <option value="1">广告</option>
        <option value="2">销售</option>
    </select>
    <input type="submit" value="提交"/><br/>
</form>
</body>
</html>
