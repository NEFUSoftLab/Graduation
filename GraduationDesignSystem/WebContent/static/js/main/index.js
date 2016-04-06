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
var Row = function(el){
	this.el = el || {};
	var total = document.documentElement.clientHeight;
	var footerHeight = $("footer").outerHeight();
	var navHeight = $("nav").outerHeight();
	this.el.height(total-footerHeight-navHeight);
}
//动态加载有半部分内容
;(function($, undefined) {
	"use strict";
	$(document).on('click', '[data-trigger="ajax"]', function() {
		var $this = $(this)
			,data = $this.data()
			,$target
		if (typeof data['target'] != 'undefined') {
			$target = $(data['target']);
			$target.load($this.attr('href'));
			return false;
		}
	});
})(jQuery);
$(function(){
	var accordion = new Accordion($('#accordion'),false);
	var row = new Row($(".myrow"));
})
