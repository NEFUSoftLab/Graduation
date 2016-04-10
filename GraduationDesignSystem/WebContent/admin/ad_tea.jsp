<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<link href="${pageContext.request.contextPath}/static/css/bootstrap-table.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/static/js/bootstrap-table.min.js"></script>
<%-- <div class="panel panel-primary">
	<div class="panel-heading">
	    <span class="panel-title">所有老师</span>
	    <span><button class="btn btn-success btn-xs pull-right">添加老师</button></span>
	</div>
	<div class="panel-body">
		<table class="table table-hover">
			<thead>
				<th>工号</th>
				<th>名字</th>
				<th>密码</th>
				<th>电话号码</th>
				<th>操作</th>
			</thead>
			<tbody>
				<c:forEach var="item" items="${teacherBean }">
					<tr>
						<td>${item.number }</td>
						<td>${item.name }</td>
						<td>${item.pwd }</td>
						<td>${item.phone }</td>
						<td>
							<button id="${item.teid }" class="btn btn-default btn-xs modify">
								<span class="glyphicon glyphicon-edit"></span>
								修改
							</button>
							<button id="${item.teid }" class="btn btn-default btn-xs delete">
								<span class="glyphicon glyphicon-trash"></span>
								删除
							</button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div> --%>

<div id="toolbar">
    <button id="remove" class="btn btn-danger" disabled>
        <i class="glyphicon glyphicon-remove"></i> 删除
    </button>
    <button id="add" class="btn btn-success">
        <i class="glyphicon glyphicon-plus"></i> 添加
    </button>
</div>
<table id="table" 
	   data-toggle="table"
	   data-toolbar="#toolbar"
       data-pagination="true"
       data-search="true"
       data-page-list="[10, 20, 50, 100]"
       data-show-refresh="true"
       data-show-toggle="true"
       data-page-size="10"
       data-page-number="1"
       data-pagination-first-text="首页"
       data-pagination-pre-text="上一页"
       data-pagination-next-text="下一页"
       data-pagination-last-text="末页"
       data-show-columns="true">
    <thead>
    <tr>
        <th data-checkbox="true"></th>
        <th data-align="right" data-sortable="true">工号</th>
        <th data-align="center" data-sortable="true">姓名</th>
        <th data-sortable="true">密码</th>
        <th data-sortable="true">电话号码</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
	    <c:forEach var="item" items="${teacherBean }">
			<tr>
				<td><input type="checkbox" name="teachers"/></td>
				<td>${item.number }</td>
				<td>${item.name }</td>
				<td>${item.pwd }</td>
				<td>${item.phone }</td>
				<td>
					<button id="${item.teid }" class="btn btn-default btn-xs modify">
						<span class="glyphicon glyphicon-edit"></span>
						修改
					</button>
					<button id="${item.teid }" class="btn btn-default btn-xs delete">
						<span class="glyphicon glyphicon-trash"></span>
						删除
					</button>
				</td>
			</tr>
		</c:forEach>
    </tbody>
</table>
<script src="${pageContext.request.contextPath}/static/js/admin/ad_tea.js"></script>



