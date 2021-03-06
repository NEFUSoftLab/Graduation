var Manage = {
	$teaInfo: $("#tea_info"),
	init: function() {
		this.modify();
		this.add();
		this.returnBack();
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
			$.ajax({
				type: 'POST',
				data: data,
				url: 'admin-modifyTeacher.action',
				success: function() {
					$("#section-container").load('admin-teaForward.action')
				}
			});
			return false;
		});
	},
	add: function() {
		$("#addTeacher").on('click', function() {
			var data = {};
			var params = decodeURIComponent(Manage.$teaInfo.serialize(), true).split("&");
			for(var i in params) {
				var name = params[i].split("=")[0];
				var value = params[i].split("=")[1];
				data[name] = value;
			}
			$.ajax({
				type: 'POST',
				data: data,
				url: 'admin-addTeacher.action',
				success: function() {
					$("#section-container").load('admin-teaForward.action')
				}
			});
			return false;
		});
	},
	returnBack: function() {
		$("#returnBack").on('click', function() {
			$("#section-container").load('admin-teaForward.action');
		});
	}
}
Manage.init();