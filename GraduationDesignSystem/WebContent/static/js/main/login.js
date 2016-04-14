$(function() {
	var Login = {
		url: 'student-login.action',
		login: function() {
			$(document).on('keypress', function(event) {
				if(event.keyCode == 13) {
					$(".login").click();
				}
			});
			$(".login").on('click', function() {
				var bean = Login.url.split('-')[0];
				var number = $('input[name="'+bean+'-number"]').val();
				var pwd = $('input[name="'+bean+'-pwd"]').val();
				if(number == "" || pwd == "") {
					$('.form-group').addClass('has-error');
				}else {
					$.ajax({
						type: 'POST',
						data: {
							"number" : number,
							"pwd" : pwd
						},
						dataType: 'json',
						url: Login.url,
						success: function(data) {
							if(data == 'success') {
								console.log('success');
								location.href = bean + "-index.action";
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