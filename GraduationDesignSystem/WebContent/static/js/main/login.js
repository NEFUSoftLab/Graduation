$(function() {
	var login = {
		url: 'student-login.action',
		login: function() {
			$("#login").on('click', function() {
				var number = $("input[name='number']").val();
				var pwd = $("input[name='pwd']").val();
				console.log(number);
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
//							if(data == 'success') {
//								window.location = '';
//							}
							console.log(data);
						}
					});
				}
				
				
			})
			return this;
		},
		cswitch: function() {		
			$(".choose a").on('click', function() {
				var index = $(this).index();
				$(this).addClass('switch-btn-focus').siblings().removeClass('swicth-btn-focus');
				$(".content-panel .wrapper").eq(index).addClass('show').siblings(".wrapper").removeClass('show');
				$(".switch-line").animate({left: index*163+'px'});
			})
			return this;
		}
	}
	login.login().cswitch();
});