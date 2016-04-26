var Manage = {
	$teaInfo: $("#tea_info"),
	init: function() {
		this.modify();
		this.add();
	},
	modify: function() {
		$("#modifyTeacher").on('click', function(event) {
			var data = {};
			var params = decodeURIComponent(Manage.$teaInfo.serialize(), true).split("&");
			for(var i in params) {
				var name = params[i].split("=")[0];
				var value = params[i].split("=")[1];
				data['teacherBean.'+name] = value;
			}
			$.post("admin-modifyTeacher.action", {data: data}, function() {
				
			});
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