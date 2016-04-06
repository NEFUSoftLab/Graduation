<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>毕业设计管理系统</title>
	<link rel="Shortcut Icon" href="${pageContext.request.contextPath}/static/images/favicon.ico">
	<!-- css -->
	<link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/static/css/main/init.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/static/css/main/index.css" rel="stylesheet">
	<!-- js  -->
	<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/main/index.js"></script>
</head>
<body>
	<div id="wrapper" class="container-fulid">
		<nav class="navbar my-navbar navbar-inverse">
		    <div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed my-navbar-toggle" data-toggle="collapse" data-target="#aside" aria-expanded="false">
				        <span class="sr-only">Toggle navigation</span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
	      			</button>
					<h2>毕业设计管理系统</h2>
				</div>
		    	<ul class="nav navbar-nav navbar-right">
					<li class="dropdown">
					    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">郑垒<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#" data-toggle="modal" data-target="#update-password">修改密码</a></li>
							<li><a href="#">退出</a></li>
						</ul>
					</li>
				</ul>
		    </div><!-- /.container-fluid -->
		</nav>
		<div class="row myrow">
			<aside id="aside" class="col-md-2 col-xs-12">
				<ul id="accordion" class="accordion">
					<li>
						<div class="title"><span class="glyphicon glyphicon-home" aria-hidden="true"></span><a href="${pageContext.request.contextPath}/admin-getAllStudent.action" data-trigger="ajax" data-target="#section-content">首页</a></div>
					</li>
					<li>
						<div class="title"><span class="glyphicon glyphicon-duplicate"" aria-hidden="true"></span>我的论题<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="${pageContext.request.contextPath}/admin-getAllStudent.action" data-trigger="ajax" data-target="#section-content">选择论题</a></li>
							<li><a href="#">已选论题</a></li>
						</ul>
					</li>
					<li>
						<div class="title"><span class="glyphicon glyphicon-education" aria-hidden="true"></span>我的导师<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="#">导师信息</a></li>
							<li><a href="#">导师意见</a></li>
						</ul>
					</li>
					<li>
						<div class="title"><span class="glyphicon glyphicon-leaf" aria-hidden="true"></span>我的分数<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="#">阶段分数</a></li>
							<li><a href="#">总分数</a></li>
						</ul>
					</li>
					<li>
						<div class="title"><span class="glyphicon glyphicon-user" aria-hidden="true"></span><a href="${pageContext.request.contextPath}/admin-getAllStudent.action" data-trigger="ajax" data-target="#section-content">个人信息</a></div>
					</li>
				</ul>
			</aside>
			<section id="section-content" class="col-md-10 col-xs-12">213213</section>
		</div>
		<footer>
			<div class="container">
				<p>Designed and built with all the love in the world by <i class="designer">PYL</i>,<i class="designer">Zl</i>,<i class="designer">DYX</i>,<i class="designer">LYN</i></p>
				<p>未经允许，禁止转载、抄袭、镜像</p>
				<p>用心做站，做不一样的站</p>
			</div>
		</footer>
	</div>
</body>
</html>