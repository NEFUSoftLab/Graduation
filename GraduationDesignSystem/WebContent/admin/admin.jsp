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
	<link href="${pageContext.request.contextPath}/static/css/admin/index.css" rel="stylesheet">
	<!-- js  -->
	<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
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
						    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">xxx<span class="caret"></span></a>
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
			<aside class="col-md-2 col-sm-2 col-xs-12">
				<ul id="accordion" class="accordion">
					<li>
						<div class="title"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>教师管理<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="admin-teaForward.action" data-trigger="ajax" data-target="#section-container">教师信息</a></li>
							<li><a href="admin-addTeaForward.action" data-trigger="ajax" data-target="#section-container">管理教师</a></li>
						</ul>
					</li>
					<li>
						<div class="title"><span class="glyphicon glyphicon-education" aria-hidden="true"></span>学生管理<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="#" data-index="3">学生信息</a></li>
							<li><a href="#" data-index="4">管理学生</a></li>
						</ul>
					</li>
					<li>
						<div class="title"><span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>流程控制<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="#" data-index="6">时间安排</a></li>
							<li><a href="#" data-index="7">管理时间</a></li>
						</ul>
					</li>
					<li>
						<div class="title"><span class="glyphicon glyphicon-random" aria-hidden="true"></span>学生分配<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="#">分配情况</a></li>
							<li><a href="#">添加信息</a></li>
						</ul>
					</li>
					<li>
						<div class="title"><span class="glyphicon glyphicon-tasks" aria-hidden="true"></span>分组考核<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="#">分配情况</a></li>
							<li><a href="#">添加信息</a></li>
						</ul>
					</li>
					<li>
						<div class="title"><span class="glyphicon glyphicon-search" aria-hidden="true"></span>个人信息<span class="glyphicon glyphicon-chevron-down"></span></div>
						<ul class="submenu">
							<li><a href="#">个人信息</a></li>
						</ul>
					</li>
				</ul>
			</aside>
			<section class="col-md-10 col-sm-10 col-xs-12 section">
				<h3 class="page-header border">教师信息</h3>
				<div id="section-container">
				</div>
				<footer class="footer">
					<div>
						<p>Designed and built with all the love in the world by <i class="designer">PYL</i>,<i class="designer">Zl</i>,<i class="designer">DYX</i>,<i class="designer">LYN</i></p>
						<p>未经允许，禁止转载、抄袭、镜像</p>
						<p>用心做站，做不一样的站</p>
					</div>
				</footer>
			</section>
		</div>
	</div>
		<!-- 	修改密码模态框         -->
	<div id="update-password" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
				  <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				  <h4 class="modal-title">修改密码</h4>
				</div>
				<div class="modal-body">
					<form id="up-pa-form" identifier="admin" class="form-horizontal">
						<div class="form-group">
							<label for="initial-password" class="col-md-2 col-sm-2 control-label password-label">原密码</label>
							<div class="col-md-9 col-xs-12 col-sm-9">
								<input type="password" class="form-control" id="initial-password" placeholder="请输入初始密码">
							</div>
						</div>
						<div class="form-group">
							<label for="new-password" class="col-md-2 col-sm-2 password-label control-label">密码</label>
							<div class="col-md-9 col-xs-12 col-sm-9">
								<input type="password" class="form-control" id="new-password" placeholder="请输入新的密码">
							</div>
						</div>
						<div class="form-group">
							<label for="configure-password" class="col-md-2 col-sm-2 password-label control-label">确认密码</label>
							<div class="col-md-9 col-xs-12 col-sm-9">
								<input type="password" class="form-control" id="configure-password" placeholder="请再次输入新密码">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
				  <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				  <button type="button" id="up-pa-ok" class="btn btn-primary" disabled="disabled">确认</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal-dialog -->
	</div>
	<script src="${pageContext.request.contextPath}/static/js/main/index.js"></script>
</body>
</html>