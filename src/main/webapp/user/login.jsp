<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2019-08-20
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆</title>
    <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
    <style>
        .center{
            margin: 200px auto;
            width: 350px;
            height: 300px;
        }
        .my-btn{
            width: 100%;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="center">
        <form action="/doLogin">
            <div class="form-group">
                <label for="exampleInputEmail1">用户名</label>
                <input type="email" class="form-control" id="exampleInputEmail1" name="username" placeholder="用户名">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">密码</label>
                <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="密码">
            </div>
            <div class="checkbox">
                <div class="row">
                    <div class="col-md-4">
                        <label>
                            <input type="checkbox"> 记住我
                        </label>
                    </div>
                    <div class="col-md-4">
                        <label>
                            <a href="javascript:">忘记密码</a>
                        </label>
                    </div>
                    <div class="col-md-4">
                        <label>
                            <a href="javascript:">没有账号?</a>
                        </label>
                    </div>
                </div>
            </div>
            <button type="submit" class="btn btn-default my-btn">登陆</button>
        </form>
    </div>
    <script src="../bootstrap/js/jquery.min.js"></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>
</div>
</body>
</html>
