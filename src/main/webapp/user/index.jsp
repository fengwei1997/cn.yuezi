<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 2019-08-20
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>月子会所-首页</title>
    <link href="../bootstrap/css/bootstrap.css" rel="stylesheet">
    <style>
        .header {
            padding: 15px 25px;
            border-bottom: #0f0f0f 1px solid;
        }

        .row div {
            height: 50px;
            text-align: center;
            line-height: 50px;
            font-size: 25px;
        }

        .row .select {
            border-bottom: #0f0f0f 3px solid;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="header">
        <div class="row">
            <div class="col-lg-2 select">
                <a href="javascript:">首页</a>
            </div>
            <div class="col-lg-2">
                <a href="javascript:">套餐</a>
            </div>
            <div class="col-lg-2">
                <a href="javascript:">商品</a>
            </div>
            <div class="col-lg-2">
                <a href="javascript:">服务</a>
            </div>
            <div class="col-lg-2">
                <a href="javascript:">个人中心</a>
            </div>
        </div>
    </div>
    <div class="body">
        <div class="carousel slide" id="slidershow" data-ride="carousel" data-interval="2000">
            <!--计数器-->
            <ol class="carousel-indicators">
                <li class="active" data-target="#slidershow" data-slide-to="0"></li>
                <li data-target="#slidershow" data-slide-to="1"></li>
            </ol>
            <!--图片容器-->
            <div class="carousel-inner">
                <div class="item active">
                    <img src="../images/lunbo1.jpg"/>
                </div>
                <div class="item">
                    <img src="../images/lunbo2.jpg"/>
                </div>
                <!--轮播导航-->
                <a href="#slidershow" data-slide="prev" class="left carousel-control" role="button">

                </a>
                <a href="#slidershow" data-slide="next" class="right carousel-control" role="button">

                </a>
            </div>
        </div>
    </div>
    <div class="footer">

    </div>
</div>
<script src="../bootstrap/js/jquery.min.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>
</body>
</html>