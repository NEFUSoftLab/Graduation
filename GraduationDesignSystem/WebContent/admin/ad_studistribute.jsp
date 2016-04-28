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
				<td><button class="btn btn-xs btn-primary" type="button" data-target="#myStudent" data-toggle="modal"><span class="badge">4</span></button></td>
				<td>
					<button id="456" class="btn btn-default btn-xs add"><span class="glyphicon glyphicon-plus"></span> 添加</button>
					<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
				</td>
			</tr>
			<tr>
				<td>1</td>
				<td>李丹</td>
				<td><button class="btn btn-xs btn-primary" type="button"><span class="badge">4</span></button></td>
				<td>
					<button id="456" class="btn btn-default btn-xs add"><span class="glyphicon glyphicon-plus"></span> 添加</button>
					<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
				</td>
			</tr>
			<tr>
				<td>1</td>
				<td>李丹</td>
				<td><button class="btn btn-xs btn-primary" type="button"><span class="badge">4</span></button></td>
				<td>
					<button id="456" class="btn btn-default btn-xs add"><span class="glyphicon glyphicon-plus"></span> 添加</button>
					<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
				</td>
			</tr>
			<tr>
				<td>1</td>
				<td>李丹</td>
				<td><button class="btn btn-xs btn-primary" type="button"><span class="badge">4</span></button></td>
				<td>
					<button id="456" class="btn btn-default btn-xs add"><span class="glyphicon glyphicon-plus"></span> 添加</button>
					<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
				</td>
			</tr>
			<tr>
				<td>1</td>
				<td>李丹</td>
				<td><button class="btn btn-xs btn-primary" type="button"><span class="badge">4</span></button></td>
				<td>
					<button id="456" class="btn btn-default btn-xs add"><span class="glyphicon glyphicon-plus"></span> 添加</button>
					<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
				</td>
			</tr>
			<tr>
				<td>1</td>
				<td>李丹</td>
				<td><button class="btn btn-xs btn-primary" type="button"><span class="badge">4</span></button></td>
				<td>
					<button id="456" class="btn btn-default btn-xs add"><span class="glyphicon glyphicon-plus"></span> 添加</button>
					<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
				</td>
			</tr>
			<tr>
				<td>1</td>
				<td>李丹</td>
				<td><button class="btn btn-xs btn-primary" type="button"><span class="badge">4</span></button></td>
				<td>
					<button id="456" class="btn btn-default btn-xs add"><span class="glyphicon glyphicon-plus"></span> 添加</button>
					<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
				</td>
			</tr>
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
<!-- Modal -->
<div class="modal fade" id="myStudent" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title" id="myModalLabel">学生信息</h4>
			</div>
			<div class="modal-body">
				<table id="distriTab" class="table table-striped">
					<thead>
						<th>序号</th>
						<th>学生姓名</th>
						<th>联系方式</th>
						<th>操作</th>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>李丹</td>
							<td>15561565053</td>
							<td>
								<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
							</td>
						</tr>
						<tr>
							<td>1</td>
							<td>李丹</td>
							<td>15561565053</td>
							<td>
								<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
							</td>
						</tr>
						<tr>
							<td>1</td>
							<td>李丹</td>
							<td>15561565053</td>
							<td>
								<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
							</td>
						</tr>
						<tr>
							<td>1</td>
							<td>李丹</td>
							<td>15561565053</td>
							<td>
								<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
							</td>
						</tr>
						<tr>
							<td>1</td>
							<td>李丹</td>
							<td>15561565053</td>
							<td>
								<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
							</td>
						</tr>
						<tr>
							<td>1</td>
							<td>李丹</td>
							<td>15561565053</td>
							<td>
								<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
							</td>
						</tr>
						<tr>
							<td>1</td>
							<td>李丹</td>
							<td>15561565053</td>
							<td>
								<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
							</td>
						</tr>
						<tr>
							<td>1</td>
							<td>李丹</td>
							<td>15561565053</td>
							<td>
								<button id="456" class="btn btn-default btn-xs delete"><span class="glyphicon glyphicon-trash"></span> 删除</button>	
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary">提交</button>
			</div>
		</div>
	</div>
</div>
<%-- <script src="${pageContext.request.contextPath}/static/js/admin/ad_studistri.js"></script> --%>



