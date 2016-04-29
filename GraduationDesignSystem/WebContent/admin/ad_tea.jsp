<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<link href="${pageContext.request.contextPath}/static/css/bootstrap-table.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/static/css/admin/index.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/static/js/bootstrap-table.min.js"></script>
<div id="toolbar" class="btn-group">
    <button id="remove" class="btn btn-default delete" disabled>
        <i class="glyphicon glyphicon-trash"></i> 删除
    </button>
    <button class="add btn btn-default">
        <i class="glyphicon glyphicon-plus"></i> 添加
    </button>
    <button id="modify" class="modify btn btn-default" disabled>
        <i class="glyphicon glyphicon-edit"></i> 修改
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
</table>
<div id="load"></div>
<script src="${pageContext.request.contextPath}/static/js/admin/ad_tea.js"></script>
