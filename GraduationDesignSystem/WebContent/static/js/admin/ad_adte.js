var Manage = {
	$teaInfo: $("#tea_info"),
	init: function() {
		this.modify();
		this.add();
	},
	modify: function() {
		$("#modifyTeacher").on('click', function() {
			console.log(Manage.$teaInfo.serialize());
		});
	},
	add: function() {
		$("#addTeacher").on('click', function() {
			console.log(Manage.$teaInfo.serialize());
		});
	}
}