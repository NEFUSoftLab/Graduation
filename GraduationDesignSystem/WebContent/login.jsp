<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>毕业设计管理</title>
	<link rel="Shortcut Icon" href="${pageContext.request.contextPath}/static/images/favicon.ico">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/main/init.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/main/login.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/main/login.js"></script>

</head>
<body>
	<h1>毕业设计管理系统<sub>信息学院</sub></h1>
	<div class="content-panel">
		<div class="header">
			<a href="admin-login_forward.action"><span class="label label-success pull-right">管理员入口</span></a>
			<div class="choose">
				<a class="switch-btn switch-btn-focus" name="stu" href="javascript:void(0)">学生登录</a>
				<a class="switch-btn" name="tea" href="javascript:void(0)">教师登录</a>
				<div class="switch-line" ></div>
			</div>
		</div>
		<div class="wrapper show">
			<div class="wrapper-login">
				<div class="login-box">
					<form method="post" class="form-horizontal">
						<div class="row">
							<div class="form-group">
							    <label class="col-sm-2 col-md-2 col-xs-2 control-label col-sm-offset-1 col-xs-offset-1 col-md-offset-1">学号</label>
							    <div class="col-sm-8 col-md-8 col-xs-8">
							    	<input type="text"  class="form-control"  name="student-number" placeholder="请输入学号">
							    </div>
						    </div>
							<div class="form-group">
								<label class="col-sm-2 col-md-2 col-xs-2 control-label col-sm-offset-1 col-xs-offset-1 col-md-offset-1">密码</label>
								<div class="col-sm-8 col-md-8 col-xs-8">
								  <input type="password"  class="form-control" name="student-pwd"  placeholder="请输入密码">
								</div>
							</div>
						</div>
						<div class="login-btn">
						  <button type="button" class="btn btn-width btn-primary center-block login">登录</button>
						</div>
					</form>
				</div>
			</div>
		</div>

 		<div class="wrapper">
			<div class="wrapper-login">
				<div class="login-box">
					<form method="post" class="form-horizontal">
						<div class="row">
							<div class="form-group">
							    <label class="col-sm-2 col-md-2 col-xs-2 control-label col-sm-offset-1 col-xs-offset-1 col-md-offset-1">工号</label>
							    <div class="col-sm-8 col-md-8 col-xs-8">
							    	<input type="text" name="teacher-number" class="form-control"  placeholder="请输入工号">
							    </div>
						    </div>
							<div class="form-group">
								<label class="col-sm-2 col-md-2 col-xs-2 control-label col-sm-offset-1 col-xs-offset-1 col-md-offset-1">密码</label>
								<div class="col-sm-8 col-md-8 col-xs-8">
								  <input type="password"  class="form-control" name="teacher-pwd" placeholder="请输入密码">
								</div>
							</div>
						</div>
						<div class="login-btn">
						  <button type="button" class="btn btn-width btn-primary center-block login">登录</button>
						</div>
					</form>
				</div>
			</div>
		</div> 
	</div>
</body>
</html>