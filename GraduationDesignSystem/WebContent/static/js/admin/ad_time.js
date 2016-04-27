var Time = {
	$form: $('#time_info'),
	init: function() {
		$("#addBtn").on('click', function() {
			$('#addTime').on('show.bs.modal', centerModals);
			$("#addTime").modal({backdrop: 'static', keyboard: false});
			$(window).on('resize', centerModals);  
			return false;
		});
		this.setTime();
		this.modifyButton();
		this.addTime();
		this.delTime();
		this.modifyTime();
	},
	modifyButton: function() {
		$(".modify").on('click', function() {
			var id = this.id
			$.post('admin-modifyTime', {id: id}, function() {
				$("#addTime").modal('show');
			});
		});
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
	addTime: function() {
		$("#addTimeSub").on('click', function() {
			var data = {};
			var params = decodeURIComponent(Time.$form.serialize(), true).split('&');
			for(var i in params) {
				var name = params[i].split("=")[0];
				var value = params[i].split("=")[1];
				data[name] = value;
			}
			$.ajax({
				type: 'POST',
				data: data,
				url: 'admin-addTime.action',
				success: function() {
					$("#section-container").load('admin-timeForward.action');
				}
			})
		});
	},
	modifyTime: function() {
		$("#modifyTimeSub").on('click', function() {
			var data = {};
			var params = decodeURIComponent(Time.$form.serialize(), true).split('&');
			for(var i in params) {
				var name = params[i].split("=")[0];
				var value = params[i].split("=")[1];
				data[name] = value;
			}
			$.ajax({
				type: 'POST',
				data: data,
				url: 'admin-modifyTime.action',
				success: function() {
					$("#section-container").load('admin-timeForward.action');
				}
			})
		});
	},
	delTime: function() {
		$(".delete").on('click', function() {
			var id = this.id;
			console.log('123');
			var confirm = window.confirm('确认删除？');
			if(confirm) {
				$.ajax({
					type: 'POST',
					data: id,
					url: 'admin-delTime.action',
					success: function() {
						$("#section-container").load('admin-timeForward.action');
					}
				})
			}
		})
	}
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