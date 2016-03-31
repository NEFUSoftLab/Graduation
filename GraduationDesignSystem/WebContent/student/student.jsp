<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
</head>
<body>
	<nav class="navbar  my-navbar">
	    <div class="container-fluid">
			<div class="navbar-header">
				<h2>毕业设计管理系统</h2>
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown">
					    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">郑垒<span class="caret"></a>
						<ul class="dropdown-menu">
							<li><a href="#" data-toggle="modal" data-target="#update-password">修改密码</a></li>
							<li><a href="#">退出</a></li>
						</ul>
					</li>
				</ul>
            </div><!-- /.navbar-collapse -->
	    </div><!-- /.container-fluid -->
	</nav>
</body>
</html>