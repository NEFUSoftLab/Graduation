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
	<div class="table-responsive panel-body">
		<form id="time_info" class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">上传论题</label>
				<div class="input-daterange input-group col-sm-10" id="datepicker">
					<input type="text" class="input-sm form-control" name="start" />
				    <span class="input-group-addon">to</span>
				    <input type="text" class="input-sm form-control" name="end" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">上传论题</label>
				<div class="input-daterange input-group col-sm-10" id="datepicker">
					<input type="text" class="input-sm form-control" name="start" />
				    <span class="input-group-addon">to</span>
				    <input type="text" class="input-sm form-control" name="end" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">上传论题</label>
				<div class="input-daterange input-group col-sm-10" id="datepicker">
					<input type="text" class="input-sm form-control" name="start" />
				    <span class="input-group-addon">to</span>
				    <input type="text" class="input-sm form-control" name="end" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">上传论题</label>
				<div class="input-daterange input-group col-sm-10" id="datepicker">
					<input type="text" class="input-sm form-control" name="start" />
				    <span class="input-group-addon">to</span>
				    <input type="text" class="input-sm form-control" name="end" />
				</div>
			</div>
		</form>
	</div>
</div>
<script src="${pageContext.request.contextPath}/static/js/admin/ad_time.js"></script>



