<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<link href="${pageContext.request.contextPath}/static/css/bootstrap-table.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/static/js/bootstrap-table.min.js"></script>
<div id="toolbar">
    <button id="remove" class="btn btn-danger" disabled>
        <i class="glyphicon glyphicon-remove"></i> 删除
    </button>
    <button href="admin-addTeaForward.action" data-trigger="ajax" data-target="#section-container" class="btn btn-success">
        <i class="glyphicon glyphicon-plus"></i> 添加
    </button>
</div>
<table  id="table"
	   	data-pagination="true"
		data-toolbar="#toolbar"
		data-search="true"
		data-side-pagination="server"
		data-page-list="[10, 20, 50, 100]"
		data-show-refresh="true"
		data-show-toggle="true"
		data-page-size="10"
		data-page-number="1"
		data-pagination-first-text="首页"
		data-pagination-pre-text="上一页"
		data-pagination-next-text="下一页"
		data-pagination-last-text="末页"
		data-show-columns="true" 
>
    <thead>
    <tr>
        <th data-field="state" data-checkbox="true"></th>
        <th data-field="number" data-align="right" data-sortable="true">工号</th>
        <th data-field="name" data-align="center" data-sortable="true">姓名</th>
        <th data-field="pwd" data-sortable="true">密码</th>
        <th data-field="phone" data-sortable="true">电话号码</th>
    </tr>
    </thead>
</table>
<script src="${pageContext.request.contextPath}/static/js/admin/ad_tea.js"></script>
