$(function() {
	var login = {
		login: function() {
			$("#login").on('click', function() {
				$.ajax({
					type: 'POST',
					data: {
						number : $("#number").val(),
						pwd : $("#pwd").val()
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