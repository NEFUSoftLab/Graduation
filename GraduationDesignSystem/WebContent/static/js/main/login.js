$(function() {
	var login = {
		var number = $("#number").val();
		var pwd = $("#pwd").val();
		login: function() {
			$.ajax({
				method: 'POST',
				data: 'number='+number&'pwd='+pwd,
				dataType: 'json',
				url:'',
				success: function() {
					console.log('123');
				}
			});
		},
	}
});