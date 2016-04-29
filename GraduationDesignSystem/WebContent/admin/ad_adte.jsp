<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div class="panel panel-default">
  <div class="panel-heading">
      <span class="panel-title">管理老师</span>
      <a href="#"><span class="label label-success pull-right">下载模板</span></a>
  </div>
	  <div class="panel-body">
	      <form id="tea_info" class="form-horizontal">
		  	  <div class="form-group">
			      <label class="col-sm-1 col-md-1 control-label">工号</label>
			      <div class="col-sm-4 col-md-4">
			         <div></div>
			      	 <c:if test="${empty teacherBean }">
			       	 	<input type="text" name="teacherBean.number" class="form-control" placeholder="请输入工号">
			       	 </c:if>
			       	 <c:if test="${not empty teacherBean }">
			       	 	<input type="text" name="teacherBean.number" class="form-control" value="${teacherBean.number }">
			       	 </c:if>
			      </div>
			      <label class="col-sm-1 col-md-1 col-md-offset-1 control-label">姓名</label>
			      <div class="col-sm-4 col-md-4">
			      	  <c:if test="${empty teacherBean }">
			      	  	  <input type="text" name="teacherBean.name" class="form-control" placeholder="请输入姓名">
			      	  </c:if>
			          <c:if test="${not empty teacherBean }">
			      	  	  <input type="text" name="teacherBean.name" class="form-control" value="${teacherBean.name }">
			      	  </c:if>
			      </div>
			  </div>
			  <div class="form-group">
			  	  <label class="col-sm-1 col-md-1 control-label">密码</label>
			      <div class="col-sm-4 col-md-4">
			      	 <c:if test="${empty teacherBean }">
			       	 	<input type="text" name="teacherBean.pwd" class="form-control" placeholder="请输入密码">
			       	 </c:if>
			       	 <c:if test="${not empty teacherBean }">
			       	 	<input type="text" name="teacherBean.pwd" class="form-control" value="${teacherBean.pwd }">
			       	 </c:if>
			      </div>
			      <label class="col-sm-1 col-md-1 col-md-offset-1 control-label">职称</label>
			      <div class="col-sm-4 col-md-4">
			          <c:if test="${empty teacherBean }">
			          	<input type="text" name="teacherBean.level" class="form-control" placeholder="请输入职称">
			          </c:if>
			          <c:if test="${not empty teacherBean }">
			          	<input type="text" name="teacherBean.level" class="form-control" value="${teacherBean.level }">
			          </c:if>
			      </div>
			  </div>
			  <div class="form-group">
			  	  <label class="col-sm-1 col-md-1 control-label">邮箱</label>
			      <div class="col-sm-5 col-md-5">
			      	 <c:if test="${empty teacherBean }">
			          	<input type="email" name="teacherBean.email" class="form-control" placeholder="请输入邮箱">
			         </c:if>
			       	 <c:if test="${not empty teacherBean }">
			          	<input type="email" name="teacherBean.email" class="form-control" value="${teacherBean.email }">
			         </c:if>
			      </div>
			  </div>
	      </form>
	  </div>
	  <div class="panel-footer clearfix">
	  	  <button id="returnBack" class="btn btn-sm btn-default">返回</button>
		  <c:if test="${empty teacherBean }">
	       	<button id="addTeacher" class="btn btn-sm btn-primary pull-right">提交</button>
	      </c:if>
	   	  <c:if test="${not empty teacherBean }">
	       	<button id="modifyTeacher" class="btn btn-sm btn-primary pull-right">提交</button>
	      </c:if>
	  </div>
</div>
<script src="${pageContext.request.contextPath}/static/js/admin/ad_adte.js"></script>



