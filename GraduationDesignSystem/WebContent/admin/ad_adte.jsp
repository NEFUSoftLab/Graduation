<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div class="panel panel-primary">
  <div class="panel-heading">
      <h3 class="panel-title">添加老师</h3>
  </div>
  <div class="panel-body">
      <form class="form-horizontal">
	  	  <div class="form-group">
		      <label class="col-sm-1 col-md-1 control-label">工号</label>
		      <div class="col-sm-4 col-md-4">
		       	 <input type="text" class="form-control" placeholder="请输入工号">
		      </div>
		      <label class="col-sm-1 col-md-1 col-md-offset-1 control-label">姓名</label>
		      <div class="col-sm-4 col-md-4">
		          <input type="password" class="form-control" placeholder="请输入姓名">
		      </div>
		  </div>
		  <div class="form-group">
		  	  <label class="col-sm-1 col-md-1 control-label">密码</label>
		      <div class="col-sm-4 col-md-4">
		       	 <input type="text" class="form-control" placeholder="请输入密码">
		      </div>
		      <label class="col-sm-1 col-md-1 col-md-offset-1 control-label">职称</label>
		      <div class="col-sm-4 col-md-4">
		          <input type="password" class="form-control" placeholder="请输入职称">
		      </div>
		  </div>
		  <div class="form-group">
		      <div class="col-sm-offset-2 col-sm-10">
		      	  <button type="submit" class="btn btn-default">Sign in</button>
		      </div>
	      </div>
      </form>
  </div>
</div>



