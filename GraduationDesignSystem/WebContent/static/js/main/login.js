$(function() {
	var login = {
		number : $("#number").val(),
		pwd : $("#pwd").val(),
		login: function() {
			$("#login").on('click', function() {
				console.log('456');
				$.ajax({
					method: 'POST',
					data: {
						'number' : number,
						'pwd' : pwd
					},
					dataType: 'json',
					url:'student-login.action',
					success: function(data) {
						console.log(data);
					}
				});
			})
			
		},
	}
	login.login();
});