$(function() {
	var login = {
		number : $("#number").val(),
		pwd : $("#pwd").val(),
		login: function() {
			$("#login").on('click', function() {
				$.ajax({
					type: 'POST',
					data: {
						number : number,
						pwd : pwd
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