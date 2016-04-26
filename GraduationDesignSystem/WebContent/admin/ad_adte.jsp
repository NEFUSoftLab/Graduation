<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div class="panel panel-primary">
  <div class="panel-heading">
      <span class="panel-title">添加老师</span>
      <a href="#"><span class="label label-success pull-right">下载模板</span></a>
  </div>
	  <div class="panel-body">
	      <form class="form-horizontal">
		  	  <div class="form-group">
			      <label class="col-sm-1 col-md-1 control-label">工号</label>
			      <div class="col-sm-4 col-md-4">
			         <div></div>
			      	 <c:if test="${empty teacherBean }">
			       	 	<input type="text" class="form-control" placeholder="请输入工号">
			       	 </c:if>
			       	 <c:if test="${not empty teacherBean }">
			       	 	<input type="text" class="form-control" value="${teacherBean.number }">
			       	 </c:if>
			      </div>
			      <label class="col-sm-1 col-md-1 col-md-offset-1 control-label">姓名</label>
			      <div class="col-sm-4 col-md-4">
			      	  <c:if test="${empty teacherBean }">
			      	  	  <input type="password" class="form-control" placeholder="请输入姓名">
			      	  </c:if>
			          <c:if test="${not empty teacherBean }">
			      	  	  <input type="password" class="form-control" value="${teacherBean.name }">
			      	  </c:if>
			      </div>
			  </div>
			  <div class="form-group">
			  	  <label class="col-sm-1 col-md-1 control-label">密码</label>
			      <div class="col-sm-4 col-md-4">
			      	 <c:if test="${empty teacherBean }">
			       	 	<input type="text" class="form-control" placeholder="请输入密码">
			       	 </c:if>
			       	 <c:if test="${not empty teacherBean }">
			       	 	<input type="text" class="form-control" value="${teacherBean.pwd }">
			       	 </c:if>
			      </div>
			      <label class="col-sm-1 col-md-1 col-md-offset-1 control-label">职称</label>
			      <div class="col-sm-4 col-md-4">
			          <c:if test="${empty teacherBean }">
			          	<input type="text" class="form-control" placeholder="请输入职称">
			          </c:if>
			          <c:if test="${not empty teacherBean }">
			          	<input type="text" class="form-control" value="${teacherBean.level }">
			          </c:if>
			      </div>
			  </div>
			  <div class="form-group">
			  	  <label class="col-sm-1 col-md-1 control-label">邮箱</label>
			      <div class="col-sm-5 col-md-5">
			      	 <c:if test="${empty teacherBean }">
			          	<input type="email" class="form-control" placeholder="请输入邮箱">
			         </c:if>
			       	 <c:if test="${not empty teacherBean }">
			          	<input type="email" class="form-control" value="${teacherBean.email }">
			         </c:if>
			      </div>
			  </div>
			  <div class="form-group">
			      <div id="adtea_submit"  class="col-sm-offset-9 col-sm-2">
			      	 <c:if test="${empty teacherBean }">
			          	<button id="addTeacher" type="submit" class="btn btn-default">提交</button>
			         </c:if>
			      	 <c:if test="${not empty teacherBean }">
			          	<button id="modifyTeacher" type="submit" class="btn btn-default">提交</button>
			         </c:if>
			      </div>
		      </div>
	      </form>
	  </div>
</div>




