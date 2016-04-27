var ManageTime = {
	init: function() {
		this.returnBack();
		this.mageTimeSub();
	},
	returnBack: function() {
		$("#return").on('click', function() {
			$("a[href='admin-timeForward.action']").click();
		});
	},
	mageTimeSub: function() {
		$("#mageTimeSub").on('click', function() {
			$("#")
		})
	}
}

ManageTime.init();