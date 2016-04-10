var Table = {
	$table: $("#table"),
	init: function() {
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