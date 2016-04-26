<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<div id="toolbar" class="btn-group">
    <button type="button" class="btn btn-default" data-toggle="modal" data-target="#addTitle">
        <i class="glyphicon glyphicon-plus"></i>
    </button>
    <button type="button" class="btn btn-default">
        <i class="glyphicon glyphicon-heart"></i>
    </button>
    <button type="button" class="btn btn-default">
        <i class="glyphicon glyphicon-trash"></i>
    </button>
</div>
<table id="table"
	   data-toggle="table"
       data-url=""
       data-search="true"
       data-show-refresh="true"
       data-show-toggle="true"
       data-show-columns="true"
       data-toolbar="#toolbar"
       data-click-to-select="true">
    <thead>
    <tr>
    	<th data-field="state" data-checkbox="true"></th>
        <th data-field="title">设计题目</th>
        <th data-field="file">文件</th>
        <th data-field="forks_count">Forks</th>
        <th data-field="description">Description</th>
    </tr>
    </thead>
</table>
<div id="addTitle" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
			  <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			  <h4 class="modal-title">添加论文题目</h4>
			</div>
			<div class="modal-body">
				<form id="add-title" class="form-horizontal" enctype="multipart/form-data">
					<div class="form-group">
						<label for="title-name" class="col-md-2 col-sm-2 control-label password-label">论文标题</label>
						<div class="col-md-9 col-xs-12 col-sm-9">
							<input type="text" class="form-control" id="title-name" name="titleBean.tname" placeholder="请输入标题">
						</div>
					</div>
					<div class="form-group">
						<label for="title-file" class="col-md-2 col-sm-2 password-label control-label">文件</label>
						<div class="col-md-9 col-xs-12 col-sm-9">
							<input id="title-file" type="file" class="file" name="file" data-preview-file-type="text">
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
			  <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
			  <button type="button" class="btn btn-primary" id="add-ti-ok">确认</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div>
<script>
$('#title-file').fileinput({
	showPreview : false,
    showUpload:false
    });
$('#table').bootstrapTable();
$('#add-ti-ok').click(function(){
	var formData = new FormData($("#add-title")[0]);
	$.ajax({

         url : '${pageContext.request.contextPath}/teacher-addTitle.action',

         type : 'POST',

         data : formData,
         
         async: true, 
         
         cache: false,

         contentType : false, 

         processData : false,

         success : function(data) {
        	 alert('成功！');
         },

         error : function() {
        	 alert('出错了！');
         }
     });
});
</script>