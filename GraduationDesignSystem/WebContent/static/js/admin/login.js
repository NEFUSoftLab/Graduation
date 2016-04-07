$(function() {
	var Login = {
		url: 'admin-login.action',
		login: function() {
			$(document).on('keypress', function(event) {
				if(event.keyCode == 13) {
					$("#ad-btn").click();
				}
			});

			$("#ad-btn").on('click', function() {
				var number = $('#ad-no').val();
				var pwd = $("#ad-pd").val();
				if(number == "" || pwd == "") {
					$('.form-group').addClass('has-error');
				}else {
					$.ajax({
						type: 'POST',
						data: {
							"number": number,
							"pwd": pwd
						},
						dataType: 'json',
						url: Login.url,
						success: function(data) {
							if(data == 'fail') {
								$('.form-group').addClass('has-error');
							}else {
								window.location = 'admin-index.action';	
							}
						}
					})
				}
			});
			return this;
		}
	}
	Login.login();
});