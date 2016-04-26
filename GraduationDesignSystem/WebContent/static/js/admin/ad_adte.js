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
				data[name] = value;
			}
			data = JSON.stringify(data);
			$.post("admin-modifyTeacher.action", {data: data}, function() {
				$("#section-container").load('admin-teaForward.action')
			})
			return false;
		});
	},
	add: function() {
		$("#addTeacher").on('click', function() {
			console.log('123');
			var data = {};
			var params = decodeURIComponent(Manage.$teaInfo.serialize(), true).split("&");
			for(var i in params) {
				var name = params[i].split("=")[0];
				var value = params[i].split("=")[1];
				data[name] = value;
			}
			data = JSON.stringify(data);
			$.post("admin-addTeacher.action", {data: data}, function() {
				$("#section-container").load('admin-teaForward.action')
			})
		});
	}
}
Manage.init();