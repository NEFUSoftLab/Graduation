<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>毕业论文管理系统</title>
	
	<!-- Bootstrap -->
	<link rel="Shortcut Icon" href="${pageContext.request.contextPath}/static/images/favicon.ico">
	<link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/static/css/animate.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/static/css/login.css" rel="stylesheet">
	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	  <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	  <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->
	<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/admin-login.js"></script>
</head>
<body>
	<div id="wrap" class="container animated fadeInDown">
		<div id="logo">
			<img src="${pageContext.request.contextPath}/common/images/logo.png">
		</div>
		<h4>毕业生论文管理系统</h4>
		<h4>管理员登录</h4>
		<form id="admin-login">
			<div class="form-group">
				<input id="admin-account-input"  name="account" type="text" class="form-control input-lg" placeholder="请输入账号">
			</div>
			<div class="form-group">
				<input id="admin-password-input" name="password"  type="password" class="form-control input-lg" placeholder="请输入密码">
			</div>
			<button id="admin-submit-button" type="button" class="btn btn-success btn-lg submit-button">登录</button>
			<a class="pull-right" href="${pageContext.request.contextPath}/comm/student">学生登录</a>
			<span id="gap" class="pull-right">|</span>
			<a class="pull-right" href="${pageContext.request.contextPath}/comm/teacher">教师登录</a>
		</form>
	</div>
</body>
</html>