$(function() {
	var login = {
		$number: $('#number').val(),
		login: function() {
			$("#login").on('click', function() {
				console.log(login.$number);
				$.ajax({
					type: 'POST',
					data: {
						number : $("#number").val(),
						pwd : $("#pwd").val()
					},
					url:'student-getAll.action',
					success: function(data) {
						console.log(data);
					}
				});
				
			})
			
		},
	}
	login.login();
});