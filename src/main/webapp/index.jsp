<%--
  Created by IntelliJ IDEA.
  User: fengwei
  Date: 2019/8/20
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("test","hello");
%>
${requestScope.test}
<h2>登录成功</h2>
</body>
</html>
