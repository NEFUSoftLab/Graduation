var Table = {
	$table: $("#table"),
	init: function() {
		$.ajax({
			url: "admin-getAllTeacher.action",
			type: 'POST',
			success: function(data) {
				console.log(data);
				var data = $.parseJSON(JSON.stringify(data.list));
				$table.bootstrapTable({
					data: data,
					pagination: true,
				    toolbar: "#toolbar",
			        search: "true",
			        sidePagination: "server",
			        pageList: "[10, 20, 50, 100]",
			        showRefresh: "true",
			        showToggle: "true",
			        pageSize: "10",
			        pageNumber: "1",
			        paginationFirstText: "首页",
			        paginationPreText:"上一页",
			        paginationNextText: "下一页",
			        paginationLastText: "末页",
			        showColumns: "true"
				});
			}
		});
		$(".pagination .page-pre").addClass("disabled");
		return this;
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
		return this;
	}
}

Table.init().disabled();