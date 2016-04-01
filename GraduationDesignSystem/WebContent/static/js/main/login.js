$(function() {
	var login = {
		url: 'student-login.action',
		number: $('#number').val(),
		login: function() {
			$("#login").on('click', function() {
				$.ajax({
					type: 'POST',
					data: {
						"userBean" : {
							'number' : $("#number").val(),
							'pwd' : $("#pwd").val()
						}
					},
					dataType: 'json',
					url: login.url,
					success: function(data) {
//						if(data == 'success') {
//							window.location = '';
//						}
						console.log(data);
					}
				});
				
			})
			return this;
		},
		cswitch: function() {
			console.log('123');
			$('#switch-stu-login').click(function(){
				$('#switch-stu-login').removeClass("switch-btn").addClass('switch-btn-focus');
				$('#switch-tea-login').removeClass("switch-btn-focus").addClass('switch-btn');
				$('.switch-line').animate({left:'0px',width:'70px'});
				$('#tea-login').css('display','none');
				$('#stu-login').css('display','block');
			});
			$('#switch-tea-login').click(function(){
				$('#switch-stu-login').removeClass("switch-btn-focus").addClass('switch-btn');
				$('#switch-tea-login').removeClass("switch-btn").addClass('switch-btn-focus');
				$('.switch-line').animate({left:'154px',width:'70px'});
				$('#tea-login').css('display','block');
				$('#stu-login').css('display','none');
			});
			return this;
		}
	}
	login.login().cswitch();
});