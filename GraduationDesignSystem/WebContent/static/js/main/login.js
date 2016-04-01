$(function() {
	var login = {
		number: $('#number').val(),
		login: function() {
			$("#login").on('click', function() {
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
			return this;
		},
		cswitch: function() {
			
		}
	}
	login.login().cswitch();
});