var currentPage = 1;
var pageSize = 10;
var selections = [];
var checked = [];
var Table = {
	$table: $("#table"),
	$remove: $("#remove"),
	$modify: $("#modify"),
	init: function() {
		selections = [];
		checked = [];
		pagination(pageSize, currentPage);
		this.selectedPageSize();
		this.nextPage();
		this.prePage();
		this.selectedPage();
		this.changeState();
		this.removeSelections();
		this.modifySelections();
		this.addTeacher();
	}, 
	nextPage: function() {
		$(document).on('click', '.pagination .page-next', function(event) {
			event.stopImmediatePropagation();
			currentPage = currentPage + 1;
			pagination(pageSize, currentPage);
		});
	},
	prePage: function() {
		$(document).on('click', '.pagination .page-pre', function(event) {
			event.stopImmediatePropagation();
			currentPage = currentPage - 1;
			pagination(pageSize, currentPage);
			return false;
		});
	},
	selectedPage: function() {
		$(document).on('click', '.pagination .page-number', function(event) {
			event.stopImmediatePropagation();
			currentPage = $(".pagination .page-number.active").index();
			pagination(pageSize, currentPage);
			return false;
		})
	},
	selectedPageSize: function() {
		$(document).on('click', '.dropdown-menu li', function(event) {
			event.stopImmediatePropagation();
			pageSize = $('.dropdown-menu li.active a').text();
			currentPage = 1;
			pagination(pageSize, currentPage);
			return false;
		});
	},
	//改变删除按钮的状态
	changeState: function() {
		Table.$table.on('check.bs.table uncheck.bs.table ' +
                'check-all.bs.table uncheck-all.bs.table', function () {
            Table.$remove.prop('disabled', !Table.$table.bootstrapTable('getSelections').length);
            Table.$modify.prop('disabled', !Table.$table.bootstrapTable('getSelections').length);
            selections = Table.getSelections();
            $.grep(selections, function(n) {
            	if($.inArray(n, checked) == -1) {
            		checked.push(n);
            	}
            });
        });
	},
	getSelections: function() {
		return $.map(Table.$table.bootstrapTable('getSelections'), function (row) {
            return row.number
        });
	},
	//删除选中数据
	removeSelections: function() {
		$(document).on('click', '#remove', function(event) {
			event.stopImmediatePropagation();
			var teNumber = checked.toString();
			var confirm = window.confirm('确定是否删除选中数据');
			if(confirm) {
				$.ajax({
					type: 'POST',
					data: {teNumber: teNumber},
					url: 'admin-delTeacher.action',
					success: function() {
						if(teNumber < pageSize) {
							Table.$table.bootstrapTable('remove', {
								field: 'number',
								values: teNumber
							});
						}else {
							pagination(pageSize, currentPage);
						}
						
					}
				});
				Table.$remove.prop('disabled', true);
			}
			return false;
		})
	},
	//修改选中数据
	modifySelections: function() {
		$(document).on('click', '#modify', function(event) {
			event.stopImmediatePropagation();
			var teNumber = Table.getSelections();
			if(teNumber.length == 0) {
				alert("请选择修改内容");
			}else if(teNumber.length > 1) {
				alert("只能选中一个");
			}else {
				teNumber = teNumber.toString();
				$.post('admin-modifyFowardTea.action',{teNumber: teNumber}, function() {
					$("#section-container").load('admin-modifyFowardTea.action');
				});
			}
			return false;
		})
	},
	addTeacher: function() {
		$(".add").on('click', function() {
			$("#section-container").load('admin-addTeaForward.action');
		})
	},
	disabled: function(currentPage) {
		var $length = $(".pagination .page-number").size();
		if(currentPage == 1) {
			$(".page-pre").addClass("disabled");
		}
		if(currentPage == $length) { 
			$(".pagination .page-next").addClass("disabled");
		}
	},
}
Table.init();

function pagination(pageSize, page) {
	var url = 'admin-getAllTeacher.action';
	$.ajax({
		type: 'POST',
		url: url,
		dataType: 'json',
		data: {
			page: page,
			pageSize: pageSize,
		},
		beforeSend: function() {
			$("#load").fadeIn();
		},
		success: function(data) {
			var dataJSON = $.parseJSON(data);
			var data = $.parseJSON(JSON.stringify(dataJSON.list));
			Table.$table.bootstrapTable('destroy').bootstrapTable({
				data: data,
				totalRows: dataJSON.allRows,
				pageNumber: page,
				pageSize: pageSize,
				columns: [
				            {
				            	class: "check",
		                        field: 'state',
		                        checkbox: true,
		                        align: 'center',
		                        valign: 'middle'
		                    },
				            {
				            	field: 'teid',
				            	title: '序号',
				            	visible: false
				            },
				            {
				            	field: 'number',
				            	align: 'center',
				            	title: '工号'
				            },
				            {
				            	field: 'name',
				            	align: 'center',
				            	title: '姓名'
				            },
				            {
				            	field: 'pwd',
				            	align: 'center',
				            	title: '密码'
				            },
				            {
				            	field: 'phone',
				            	align: 'center',
				            	title: '电话号码'
				            },
							{
							    title: '教师论文',
							    align: 'center',
							    events: operateEvents,
							    formatter: operateFormatter
							} 
				         ]
			});
			saveCheckBox(checked);
			Table.disabled(page);
			$("#load").fadeOut();
		},
		error: function() {
			$("#load").fadeOut(function() {
				alert('请求失败');
			});
		}
	});
}

function saveCheckBox(arr) {
	if(arr != null) {
		$("#table tr").each(function() {
			var val = $(this).children("td:nth-child(2)").text();
			if($.inArray(val, arr) != -1) {
				if($(this).children("td:nth-child(2)").text() == val) {
					console.log($(this).children('td:first-child'));
					$(this).addClass('selected').find('.check input').attr('checked', true);
					
				}
			}
		});
	}else {
		return ;
	}
}

function operateFormatter(value, row, index) {
    return [
        '<a class="more" href="javascript:void(0)" title="Like">',
        '[详情]',
        '</a>  ',
    ].join('');
}

window.operateEvents = {
    'click .like': function (e, value, row, index) {
        alert('You click like action, row: ' + JSON.stringify(row));
    },
};
