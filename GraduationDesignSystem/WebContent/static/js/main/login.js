$(function() {
	var Login = {
		url: 'student-login.action',
		login: function() {
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
						url: login.url,
						success: function(data) {
							if(data == 'success') {
								window.location = '';
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
			});
			return this;
		}
	}
	Login.login().tab();
});