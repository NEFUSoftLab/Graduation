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
	<script src="${pageContext.request.contextPath}/static/js/main//index.js"></script>
</head>
<body>
	<div id="wrapper" class="container-fulid">
		<nav class="navbar my-navbar navbar-inverse">
		    <div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed my-navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				        <span class="sr-only">Toggle navigation</span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
				        <span class="icon-bar"></span>
	      			</button>
					<h2>毕业设计管理系统</h2>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown">
						    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">郑垒<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#" data-toggle="modal" data-target="#update-password">修改密码</a></li>
								<li><a href="#">退出</a></li>
							</ul>
						</li>
					</ul>
	            </div><!-- /.navbar-collapse -->
		    </div><!-- /.container-fluid -->
		</nav>
		<div class="row myrow">
			<aside class="col-md-3 col-xs-12">
				<ul id="accordion" class="accordion">
					<li>
						<div class="title"><span class="glyphicon glyphicon-search" aria-hidden="true"></span>个人信息<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="#">个人信息</a></li>
							<li><a href="#">修改信息</a></li>
							<li><a href="#">添加信息</a></li>
						</ul>
					</li>
					<li>
						<div class="title"><span class="glyphicon glyphicon-search" aria-hidden="true"></span>个人信息<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="#">个人信息</a></li>
							<li><a href="#">修改信息</a></li>
							<li><a href="#">添加信息</a></li>
						</ul>
					</li>
					<li>
						<div class="title"><span class="glyphicon glyphicon-search" aria-hidden="true"></span>个人信息<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="#">个人信息</a></li>
							<li><a href="#">修改信息</a></li>
							<li><a href="#">添加信息</a></li>
						</ul>
					</li>
					<li>
						<div class="title"><span class="glyphicon glyphicon-search" aria-hidden="true"></span>个人信息<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="#">个人信息</a></li>
							<li><a href="#">修改信息</a></li>
							<li><a href="#">添加信息</a></li>
						</ul>
					</li>
				</ul>
			</aside>
			<section class="col-md-9 col-xs-12">213213</section>
		</div>
	</div>
	<script>
	var accordion = new Accordion($('#accordion'));
	</script>
</body>
</html>