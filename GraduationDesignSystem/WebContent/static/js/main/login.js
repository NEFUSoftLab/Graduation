$(function() {
	var login = {
		login: function() {
			$("#login").on('click', function() {
				console.log($("#number").val());
				$.ajax({
					type: 'POST',
					data: {
						number : $("#number").val(),
						pwd : $("#pwd").val()
					},
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