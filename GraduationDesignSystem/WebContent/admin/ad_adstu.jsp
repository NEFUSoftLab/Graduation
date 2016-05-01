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
			      	 <c:if test="${empty studentBean }">
			       	 	<input type="text" name="studentBean.number" class="form-control" placeholder="请输入工号">
			       	 </c:if>
			       	 <c:if test="${not empty studentBean }">
			       	 	<input type="text" name="studentBean.number" class="form-control" value="${studentBean.number }">
			       	 </c:if>
			      </div>
			      <label class="col-sm-1 col-md-1 col-md-offset-1 control-label">姓名</label>
			      <div class="col-sm-4 col-md-4">
			      	  <c:if test="${empty studentBean }">
			      	  	  <input type="text" name="studentBean.name" class="form-control" placeholder="请输入姓名">
			      	  </c:if>
			          <c:if test="${not empty studentBean }">
			      	  	  <input type="text" name="studentBean.name" class="form-control" value="${studentBean.name }">
			      	  </c:if>
			      </div>
			  </div>
			  <div class="form-group">
			  	  <label class="col-sm-1 col-md-1 control-label">密码</label>
			      <div class="col-sm-4 col-md-4">
			      	 <c:if test="${empty studentBean }">
			       	 	<input type="text" name="studentBean.pwd" class="form-control" placeholder="请输入密码">
			       	 </c:if>
			       	 <c:if test="${not empty studentBean }">
			       	 	<input type="text" name="studentBean.pwd" class="form-control" value="${studentBean.pwd }">
			       	 </c:if>
			      </div>
			      <label class="col-sm-1 col-md-1 col-md-offset-1 control-label">职称</label>
			      <div class="col-sm-4 col-md-4">
			          <c:if test="${empty studentBean }">
			          	<input type="text" name="studentBean.sex" class="form-control" placeholder="请输入性别">
			          </c:if>
			          <c:if test="${not empty studentBean }">
			          	<input type="text" name="studentBean.sex" class="form-control" value="${studentBean.level }">
			          </c:if>
			      </div>
			  </div>
			  <div class="form-group">
			  	  <label class="col-sm-1 col-md-1 control-label">邮箱</label>
			      <div class="col-sm-5 col-md-5">
			      	 <c:if test="${empty studentBean }">
			          	<input type="email" name="studentBean.email" class="form-control" placeholder="请输入邮箱">
			         </c:if>
			       	 <c:if test="${not empty studentBean }">
			          	<input type="email" name="studentBean.email" class="form-control" value="${studentBean.email }">
			         </c:if>
			      </div>
			  </div>
	      </form>
	  </div>
	  <div class="panel-footer clearfix">
	  	  <button id="returnBack" class="btn btn-sm btn-default">返回</button>
		  <c:if test="${empty studentBean }">
	       	<button id="addStudent" class="btn btn-sm btn-primary pull-right">提交</button>
	      </c:if>
	   	  <c:if test="${not empty studentBean }">
	       	<button id="modifyStudent" class="btn btn-sm btn-primary pull-right">提交</button>
	      </c:if>
	  </div>
</div>
<script src="${pageContext.request.contextPath}/static/js/admin/ad_adstu.js"></script>



