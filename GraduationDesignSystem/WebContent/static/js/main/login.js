$(function() {
	var Login = {
		url: 'student-login.action',
		login: function() {
			$(document).on('keypress', function(event) {
				if(event.keyCode == 13) {
					$("#login").click();
				}
			});
			$("#login").on('click', function() {
				var number = $("input[name='number']").val();
				var pwd = $("input[name='pwd']").val();
				if(number == "" || pwd == "") {
					$('.form-group').addClass('has-error');
				}else {
					$.ajax({
						type: 'POST',
						data: {
							"studentBean.number": number,
							"studentBean.pwd": pwd
						},
						dataType: 'json',
						url: Login.url,
						success: function(data) {
							if(data == 'success') {
								console.log('success');
								window.href = "";
							}else {
								$('.form-group').addClass('has-error');
							}
						}
					});
				}
				
				
			});
			return this;
		},
		tab: function() {		
			$(".choose a").on('click', function() {
				var index = $(this).index();
				$(this).addClass('switch-btn-focus').siblings().removeClass('swicth-btn-focus');
				$('.form-group').removeClass('has-error');
				$(".content-panel .wrapper").eq(index).addClass('show').siblings(".wrapper").removeClass('show');
				$(".switch-line").animate({left: index*163+'px'});
				if($(this).attr('name') == 'stu') {
					Login.url = "student-login.action";
				}else if($(this).attr('name') == 'tea') {
					Login.url = 'teacher-login.action';
				}
			});
			return this;
		}
	}
	Login.login().tab();
});