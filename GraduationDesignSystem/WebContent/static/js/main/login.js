$(function() {
	var login = {
//		number : $("#number").val(),
//		pwd : $("#pwd").val(),
		login: function() {
			$("#login").on('click', function() {
//				console.log(login.number);
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