<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link href="${pageContext.request.contextPath}/static/css/docs.min.css" rel="stylesheet">
<div class="container bs-example" data-example-id="distriTab">
	<table id="distriTab" class="table table-striped">
		<thead>
			<th>序号</th>
			<th>指导老师</th>
			<th>学生</th>
			<th>操作</th>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>李丹</td>
				<td><button class="btn btn-xs btn-primary" type="button"><span class="badge">4</span></button></td>
				<td>
					<button id="456" class="btn btn-default btn-xs add"><span class="glyphicon glyphicon-plus"></span> 添加</button>
					<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
				</td>
			</tr>
		</tbody>
	</table>

</div>

<%-- <script src="${pageContext.request.contextPath}/static/js/admin/ad_studistri.js"></script> --%>



