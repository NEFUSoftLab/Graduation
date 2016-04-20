var currentPage = 1;
var pageSize = 10
var Table = {
	$table: $("#table"),
	init: function(pageSize, page) {
		var data = null;
		if(pageSize != null && page != null) {
			data = {page: page, pageSize: pageSize};
		}
		$.ajax({
			type: 'POST',
			url: "admin-getAllTeacher.action",
			dataType: 'json',
			data: data,
			success: function(data) {
				var dataJSON = $.parseJSON(data);
				var data = $.parseJSON(JSON.stringify(dataJSON.list));
				currentPage = dataJSON.currentPage;
				Table.$table.bootstrapTable({
					data: data,
					totalRows: dataJSON.allRows,
					pageNumber: currentPage
				});
				
					/*data: data,
					pagination: true,
				    toolbar: "#toolbar",
			        search: "true",
			        sidePagination: "server",
			        pageList: "[10, 20, 50, 100]",
			        showRefresh: "true",
			        showToggle: "true",
			        pageSize: "10",
			        pageNumber: currentPage,
			        totalRows: dataJSON.allRows,
			        paginationFirstText: "首页",
			        paginationPreText:"上一页",
			        paginationNextText: "下一页",
			        paginationLastText: "末页",
			        showColumns: "true"*/
				if(currentPage == 1) {
					$(".pagination .page-pre").addClass("disabled");
				}
			}
		});
	},
	disabled: function() {
		$(document).on('click', '.pagination .page-pre, .pagination .page-next, .pagination .page-number', function(event) {
			event.stopPropagation();
			var $length = $(".pagination .page-number").size();
			console.log($length);
			if(currentPage == 1) {
				$(".pagination .page-pre").addClass("disabled");
			}
			if(currentPage == $length-1) {
				console.log('123');
				$(".pagination .page-next").addClass("disabled");
			}
		});
	},
	nextPage: function() {
		$(document).on('click', '.pagination .page-next', function(event) {
			event.stopPropagation();
			currentPage = currentPage + 1;
			$.post("admin-getAllTeacher.action", {page: currentPage, pageSize: pageSize}, function(data) {
				var dataJSON = $.parseJSON(data);
				var data = $.parseJSON(JSON.stringify(dataJSON.list));
				Table.$table.bootstrapTable('destroy').bootstrapTable({
					data: data,
					totalRows: dataJSON.allRows,
					pageNumber: currentPage
				});
			})
		});
	},
	entry: function() {
		this.init();
		this.disabled();
		this.nextPage();
	}
}
Table.entry();
