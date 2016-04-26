var Manage = {
	$teaInfo: $("#tea_info"),
	init: function() {
		this.modify();
		this.add();
	},
	modify: function() {
		$("#modifyTeacher").on('click', function(event) {
			var params = decodeURIComponent(Manage.$teaInfo.serialize(), true).split("&");
			return false;
		});
	},
	add: function() {
		$("#addTeacher").on('click', function() {
			console.log(decodeURIComponent(Manage.$teaInfo.serialize(), true));
		});
	}
}
Manage.init();