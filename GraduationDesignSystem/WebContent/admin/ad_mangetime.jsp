<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link href="${pageContext.request.contextPath}/static/css/bootstrap-datepicker.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/static/js/bootstrap-datepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap-datepicker.zh-CN.min.js"></script>
<div class="panel panel-default">
	<div class="panel-heading">
		<span>管理时间</span>
	</div>
	<!-- Table -->
	<div class="panel-body">
		<form id="allTime_info" class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">上传论题</label>
				<div class="input-group date col-sm-8 input-daterange">
					<input type="text" class="input-sm form-control" name="${123 }.start" />
				    <span class="input-group-addon">to</span>
				    <input type="text" class="input-sm form-control" name="end" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">上传论题</label>
				<div class="input-daterange input-group date col-sm-8">
					<input type="text" class="input-sm form-control" name="start" />
				    <span class="input-group-addon">to</span>
				    <input type="text" class="input-sm form-control" name="end" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">上传论题</label>
				<div class="input-daterange input-group date col-sm-8">
					<input type="text" class="input-sm form-control" name="start" />
				    <span class="input-group-addon">to</span>
				    <input type="text" class="input-sm form-control" name="end" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">上传论题</label>
				<div class="input-daterange input-group date col-sm-8">
					<input type="text" class="input-sm form-control" name="start" />
				    <span class="input-group-addon">to</span>
				    <input type="text" class="input-sm form-control" name="end" />
				</div>
			</div>
		</form>
	</div>
	<div class="panel-footer clearfix"> 
		<button id="return" type="button" class="btn btn-sm btn-default">返回</button>
		<button id="mageTimeSub" type="button" class="btn btn-sm btn-primary pull-right">提交</button>
	</div>
</div>
<script src="${pageContext.request.contextPath}/static/js/admin/ad_mangetime.js"></script>



