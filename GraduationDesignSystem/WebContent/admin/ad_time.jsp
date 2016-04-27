<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link href="${pageContext.request.contextPath}/static/css/bootstrap-datepicker.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/static/js/bootstrap-datepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap-datepicker.zh-CN.min.js"></script>
<div class="panel panel-default">
	<div class="panel-heading">
		<span>阶段时间</span>
		<a id="addBtn" href="#" data-target="#addTime" class="pull-right" data-toggle="modal"><span class="label label-success">添加</span></a>
	</div>
	<!-- Table -->
	<div class="table-responsive panel-body">
		<table class="table">
			<thead>
				<th>阶段名称</th>
				<th>开始时间</th>
				<th>结束时间</th>
				<th>操作</th>
			</thead>
			<tbody>
				<tr>
					<td>上传论题</td>
					<td>2015-10-19</td>
					<td>2015-10-25</td>
					<td>
						<button id="123" class="btn btn-default btn-xs modify"><span class="glyphicon glyphicon-edit"></span> 编辑</button>
						<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
					</td>
				</tr>
				<tr>
					<td>上传论题</td>
					<td>2015-10-19</td>
					<td>2015-10-25</td>
					<td>
						<button id="1234" class="btn btn-default btn-xs modify"><span class="glyphicon glyphicon-edit"></span> 编辑</button>
						<button id="5678" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<!-- Modal -->
<div class="modal fade" id="addTime" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="myModalLabel">添加阶段</h4>
			</div>
			<div class="modal-body">
				<form id="time_info" class="form-horizontal">
					<div class="form-group">
						<label class="col-sm-2 control-label">阶段名称</label>
						<div class="col-sm-10 input">
							<c:if test="${empty timeBean }">
								<input type="text" name="timeBean.name" class="form-control" placeholder="请输入答辩阶段名称">
							</c:if>
							<c:if test="${not empty timeBean }">
								<input type="text" name="timeBean.name" class="form-control" value="${timeBean.name }">
							</c:if>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">开始时间</label>
						<div class="input-group date">
							<c:if test="${empty timeBean }">
								<input type="text" name="timeBean.starttime" class="form-control"><span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
							</c:if>
							<c:if test="${not empty timeBean }">
								<input type="text" name="timeBean.starttime" class="form-control" value="${timeBean.starttime }"><span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
							</c:if>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">结束时间</label>
						<div class="input-group date">
							<c:if test="${empty timeBean }">
								<input type="text" name="timeBean.endtime" class="form-control"><span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
							</c:if>
							<c:if test="${not empty timeBean }">
								<input type="text" name="timeBean.endtime" class="form-control" value="${timeBean.endtime }"><span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
							</c:if>
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<c:if test="${empty timeBean }">
					<button id="addTimeSub" type="button" class="btn btn-primary">提交</button>
				</c:if>
				<c:if test="${not empty timeBean }">
					<button id="modifyTimeSub" type="button" class="btn btn-primary">提交</button>
				</c:if>
			</div>
		</div>
	</div>
</div>
<script src="${pageContext.request.contextPath}/static/js/admin/ad_time.js"></script>



