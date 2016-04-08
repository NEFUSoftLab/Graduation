<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="/struts-tags" %>  
<div class="panel panel-primary">
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
</div>
