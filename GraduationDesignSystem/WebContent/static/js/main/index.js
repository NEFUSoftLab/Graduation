// 手风琴
var Accordion = function(el) {
		this.el = el || {};
		var links = this.el.find('.title');
		links.on('click',this.el, this.dropdown);
	}

Accordion.prototype.dropdown = function(e,state) {
	var $el = e.data;
		$this = $(this),
		$next = $this.next();
	if($next.is(":animated"))return;
	$next.slideToggle("normal");
	$this.parent().toggleClass('open');
	$el.find('.submenu').not($next).slideUp().parent().removeClass('open');
}
//初始化row的高度
var row = function(){
	var $row = $('.myrow'),
		total = document.documentElement.clientHeight,
		navHeight = $('nav').outerHeight();
	$row.height(total-navHeight);
};
//动态加载有半部分内容
;(function($, undefined) {
	"use strict";
	$(document).on('click', '[data-trigger="ajax"]', function() {
		var $this = $(this)
			,data = $this.data()
			,$target
			,$head = $('.page-header');
		if (typeof data['target'] != 'undefined') {
			$target = $(data['target']);
			$head.text($this.text());
			$target.load($this.attr('href'));
			return false;
		}
	});
})(jQuery);
//用户更改密码
(function($, undefined) {
	"use strict";
	var $new_pa = $('#new-password'),
		$con_pa = $('#configure-password'),
		$ini_pa = $('#initial-password'),
		$form_pa = $('#up-pa-form');
	//监测旧密码是否正确
	$ini_pa.on('change', function() {
		var $this = $(this),
			index = $form_pa.attr('identifier'),
		    data = $ini_pa.val();
		$.ajax({
			type:'post',
			data:{
				"pwd" : data
			},
			dataType: 'json',
			url: index + '-judgePassword.action',
			success:function(result){
				if(result == 'success'){
					$this.parents('.form-group').removeClass("has-error").addClass("has-success");
				}else{
					$this.parents('.form-group').removeClass("has-success").addClass("has-error");
				}
			}
		});
	});
	$new_pa.on('change',function(){
		if($(this).val().length >= 6){
			$(this).parents('.form-group').removeClass("has-error").addClass("has-success");
		}else{
			$(this).parents('.form-group').removeClass("has-success").addClass("has-error");
		}
	});
	$con_pa.on('input propertychange',function(){
		var p1 = $new_pa.val(),
			p2 = $(this).val();
		if(p1 == p2){
			$(this).parents('.form-group').removeClass("has-error").addClass("has-success");
		}else{
			$(this).parents('.form-group').removeClass("has-success").addClass("has-error");
		}
	});
})(jQuery);
var accordion =  new Accordion($('#accordion'));
row();
$(window).resize(row);
