<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2019-08-20
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>月子会所-注册</title>
    <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
    <style>
        .center{
            margin: 100px auto;
            width: 350px;
            height: 600px;
        }
        .my-btn{
            width: 100%;
        }
        .right{
            float: right;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="center">
        <form>
            <h3>账户信息</h3>
            <div class="form-group">
                <label for="username">用户名</label>
                <input type="text" class="form-control" id="username" placeholder="用户名">
            </div>
            <div class="form-group">
                <label for="password1">密码</label>
                <input type="password" class="form-control" id="password1" placeholder="密码">
            </div>
            <div class="form-group">
                <label for="password2">重复密码</label>
                <input type="password" class="form-control" id="password2" placeholder="重复密码">
            </div>
            <h3>个人信息</h3>
            <div class="form-group">
                <label for="name">真实姓名</label>
                <input type="text" class="form-control" id="name" placeholder="真实姓名">
            </div>
            <div class="form-group">
                <label for="idNumber">身份证号</label>
                <input type="text" class="form-control" id="idNumber" placeholder="用户名">
            </div>
            <div class="form-group">
                <label for="phone">手机号</label>
                <input type="text" class="form-control" id="phone" placeholder="手机号">
            </div>
            <div class="form-group">
                <label for="email">邮箱</label>
                <input type="text" class="form-control" id="email" placeholder="邮箱">
            </div>
            <div class="checkbox">
                <div class="row">
                    <div class="col-md-12">
                        <a href="javascript:" class="right">已有账号?去登陆</a>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <label>
                            <input type="checkbox"> 我已详细阅读并同意《<a href="javascript:">月子会所用户条许可条例</a>》
                        </label>
                    </div>
                </div>
            </div>
            <button type="submit" class="btn btn-default my-btn">注册</button>
        </form>
    </div>
    <script src="../bootstrap/js/jquery.min.js"></script>
    <script src="../bootstrap/js/bootstrap.min.js"></script>
</div>
</body>
</html>
