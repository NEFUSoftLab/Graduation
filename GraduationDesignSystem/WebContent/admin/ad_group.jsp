<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div class="panel panel-primary">
	<div class="panel-heading">
		<span>阶段时间</span>
		<a href="#" class="pull-right"><span class="label label-success">添加</span></a>
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
						<button id="modify" class="btn btn-default btn-xs modify" type="submit"><span class="glyphicon glyphicon-edit"></span> 编辑</button>
						<button id="delete" class="btn btn-default btn-xs delete" type="submit"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>




