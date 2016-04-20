var currentPage = 1;
var pageSize = 10;
var Table = {
	$table: $("#table"),
	$remove: $("#remove"),
	selections: [],
	init: function() {
		$.ajax({
			type: 'POST',
			url: "admin-getAllTeacher.action",
			dataType: 'json',
			data: {
				page: 1,
				pageSize: 10
			},
			success: function(data) {
				var dataJSON = $.parseJSON(data);
				var data = $.parseJSON(JSON.stringify(dataJSON.list));
				Table.$table.bootstrapTable({
					data: data,
					totalRows: dataJSON.allRows,
					pageNumber: 1,
					pageSize: pageSize
				});
				$(".pagination .page-pre").addClass("disabled");
			}
		});
		this.selectedPageSize();
		this.nextPage();
		this.prePage();
		this.selectedPage();
	}, 
	nextPage: function() {
		$(document).on('click', '.pagination .page-next', function(event) {
			event.stopPropagation();
			currentPage = currentPage + 1;
			console.log(pageSize);
			$.post("admin-getAllTeacher.action", {page: currentPage, pageSize: pageSize}, function(data) {
				var dataJSON = $.parseJSON(data);
				var data = $.parseJSON(JSON.stringify(dataJSON.list));
				Table.$table.bootstrapTable('destroy').bootstrapTable({
					data: data,
					totalRows: dataJSON.allRows,
					pageNumber: currentPage,
					pageSize: pageSize
				});
				Table.disabled(currentPage);
			});
		});
	},
	prePage: function() {
		$(document).on('click', '.pagination .page-pre', function(event) {
			event.stopPropagation();
			currentPage = currentPage - 1;
			$.post("admin-getAllTeacher.action", {page: currentPage, pageSize: pageSize}, function(data) {
				var dataJSON = $.parseJSON(data);
				var data = $.parseJSON(JSON.stringify(dataJSON.list));
				Table.$table.bootstrapTable('destroy').bootstrapTable({
					data: data,
					totalRows: dataJSON.allRows,
					pageNumber: currentPage,
					pageSize: pageSize
				});
				Table.disabled(currentPage);
			});
		});
	},
	selectedPage: function() {
		$(document).on('click', '.pagination .page-number', function(event) {
			event.stopPropagation();
			currentPage = $(".pagination .page-number.active").index();
			$.post("admin-getAllTeacher.action", {page: currentPage, pageSize: pageSize}, function(data) {
				var dataJSON = $.parseJSON(data);
				var data = $.parseJSON(JSON.stringify(dataJSON.list));
				Table.$table.bootstrapTable('destroy').bootstrapTable({
					data: data,
					totalRows: dataJSON.allRows,
					pageNumber: currentPage,
					pageSize: pageSize
				});
				Table.disabled(currentPage);
			});
		})
	},
	selectedPageSize: function() {
		$(document).on('click', '.dropdown-menu li', function(event) {
			event.stopPropagation();
			pageSize = $('.dropdown-menu li.active a').text();
			$.post("admin-getAllTeacher.action", {page: currentPage, pageSize: pageSize}, function(data) {
				var dataJSON = $.parseJSON(data);
				var data = $.parseJSON(JSON.stringify(dataJSON.list));
				Table.$table.bootstrapTable('destroy').bootstrapTable({
					data: data,
					totalRows: dataJSON.allRows,
					pageNumber: currentPage,
					pageSize: pageSize
				});
				Table.disabled(currentPage);
			});
			
		});
	},
	removeData: function() {
		$table.on('check.bs.table uncheck.bs.table ' +
                'check-all.bs.table uncheck-all.bs.table', function () {
            $remove.prop('disabled', !$table.bootstrapTable('getSelections').length);
            selections = $.map($table.bootstrapTable('getSelections'), function (row) {
	            return row.id
	        });;
        });
	}
	disabled: function(currentPage) {
		var $length = $(".pagination .page-number").size();
		if(currentPage == 1) {
			$(".pagination .page-pre").addClass("disabled");
		}
		if(currentPage == $length) { 
			$(".pagination .page-next").addClass("disabled");
		}
	},
}

Table.init();
