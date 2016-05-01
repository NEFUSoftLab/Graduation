var Distri = {
	init: function() {
		this.addStudent();
	},
	addStudent: function() {
		$(".add").on('click', function() {
			var id = $(this).attr('id');
			$.post('admin-addDistri.action', {id: id}, function() {
				$("#section-container").load();
			});
		});
	}
}
Distri.init();