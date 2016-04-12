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
(function($, undefined) {
	"use strict";
	$("#up-pa-ok").on('click', function() {
		var $new_pa = $('#new-password'),
			$con_pa = $('configure-password'),
			$ini_pa = $('initial-password');
		if($new_pa.val() !== $con_pa.val()){
			$().alert();
		}
	});
})(jQuery);
var accordion =  new Accordion($('#accordion'));
row();
$(window).resize(row);
