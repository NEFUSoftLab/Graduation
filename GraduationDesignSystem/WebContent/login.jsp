<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>毕业设计管理</title>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8">
	<link rel="stylesheet" type="text/css" href="static/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="static/css/main/init.css">
	<link rel="stylesheet" type="text/css" href="static/css/main/login.css">
	<script type="text/javascript" src="static/js/jquery.min.js"></script>
	<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="static/js/main/login.js"></script>

</head>
<body>
	<h1>毕业设计管理系统<sub>信息学院</sub></h1>
	<div class="content-panel">
		<div class="header">
			<div class="choose">
				<a class="switch-btn-focus" id="switch-stu-login" href="javascript:void(0)">学生登录</a>
				<a class="switch-btn" id="switch-tea-login" href="javascript:void(0)">教师登录</a>
				<div class="switch-line" ></div>
			</div>
		</div>
		<div class="wrapper">
			<div class="wrapper-login">
				<div class="login-box">
					<form method="post" class="form-horizontal">
						<div class="row">
							<div class="form-group">
							    <label class="col-sm-2 col-md-2 col-xs-2 control-label col-sm-offset-1 col-xs-offset-1 col-md-offset-1">账号</label>
							    <div class="col-sm-8 col-md-8 col-xs-8">
							    	<input type="text" id="number" name="number" class="form-control" id="inputEmail3" placeholder="请输入账号">
							    </div>
						    </div>
							<div class="form-group">
								<label class="col-sm-2 col-md-2 col-xs-2 control-label col-sm-offset-1 col-xs-offset-1 col-md-offset-1">密码</label>
								<div class="col-sm-8 col-md-8 col-xs-8">
								  <input type="password" id="pwd" name="pwd" class="form-control" id="inputPassword3" placeholder="请输入密码">
								</div>
							</div>
						</div>
						<div>
						  <button type="button" id="login" class="btn btn-width btn-primary center-block">登录</button>
						</div>
					</form>
				</div>
			</div>
		</div>

<!-- 		<div class="wrapper">
	<div class="wrapper-login">
		<div class="login-box">
			<form method="post" class="form-horizontal">
				<div class="row">
					<div class="form-group">
					    <label class="col-sm-2 col-md-2 col-xs-2 control-label col-sm-offset-1 col-xs-offset-1 col-md-offset-1">账号</label>
					    <div class="col-sm-8 col-md-8 col-xs-8">
					    	<input type="text" id="number" class="form-control" id="inputEmail3" placeholder="请输入账号">
					    </div>
				    </div>
					<div class="form-group">
						<label class="col-sm-2 col-md-2 col-xs-2 control-label col-sm-offset-1 col-xs-offset-1 col-md-offset-1">密码</label>
						<div class="col-sm-8 col-md-8 col-xs-8">
						  <input type="password" id="pwd" class="form-control" id="inputPassword3" placeholder="请输入密码">
						</div>
					</div>
				</div>
				<div>
				  <button type="button" id="login" class="btn btn-width btn-primary center-block">登录</button>
				</div>
			</form>
		</div>
	</div>
</div> -->
	</div>
</body>
</html>