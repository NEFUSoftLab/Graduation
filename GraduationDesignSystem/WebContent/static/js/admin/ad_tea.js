var Table = {
	$table: $("#table"),
	init: function() {
		$.ajax({
			type: 'POST',
			url: "admin-getAllTeacher.action",
			dataType: 'json',
			success: function(data) {
				var dataJSON = $.parseJSON(data);
				var data = $.parseJSON(JSON.stringify(dataJSON.list));
				var currentPage = dataJSON.currentPage;
				Table.$table.bootstrapTable({
					data: data,
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
			        queryParamsType: 'limit',
			        paginationFirstText: "首页",
			        paginationPreText:"上一页",
			        paginationNextText: "下一页",
			        paginationLastText: "末页",
			        showColumns: "true"
				});
				$(".pagination .page-pre").addClass("disabled");
				$(".pagination .page-number").eq(Table.currentPage-1).addClass("active");
			}
		});
	},
	disabled: function() {
		$(document).on('click', '.pagination .page-pre, .pagination .page-next, .pagination .page-number', function(event) {
			event.stopPropagation();
			var $length = $(".pagination .page-number").size();
			var $index = $(".pagination .page-number.active").index();
			if($index == 1) {
				$(".pagination .page-pre").addClass("disabled");
			}
			if($index == $length) {
				$(".pagination .page-next").addClass("disabled");
			}
		});
	},
	nextPage: function() {
		console.log(Table.$table.bootstrapTable());
	},
	entry: function() {
		this.init();
		this.disabled();
		this.nextPage();
	}
}

Table.entry();