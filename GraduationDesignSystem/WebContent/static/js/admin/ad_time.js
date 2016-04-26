var Time = {
	init: function() {
		$("#addBtn").on('click', function() {
			$('#addTime').on('show.bs.modal', centerModals);
			$("#addTime").modal({backdrop: 'static', keyboard: false});
			$(window).on('resize', centerModals);  
			return false;
		});
		this.setTime();
	},
	setTime: function() {
		$('.input-group.date').datepicker({
			format: "yyyy-mm-dd",
		    language: "zh-CN",
		    autoclose: true,
		    todayHighlight: true,
		    toggleActive: true
		});
	},
}
Time.init();

function centerModals() {  
    $('#addTime').each(function(i) {   
        var $clone = $(this).clone().css('display', 'block').appendTo('body'); 
        var top = Math.round(($clone.height() - $clone.find('.modal-content').height()) / 2);   
        top = top > 0 ? top : 0;   
        $clone.remove();   
        $(this).find('.modal-content').css("margin-top", top);   
    });   
}  