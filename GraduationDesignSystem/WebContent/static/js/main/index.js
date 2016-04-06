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
	console.log(footerHeight+"  "+navHeight);
	this.el.height(total-footerHeight-navHeight);
}
$(function(){
	var accordion = new Accordion($('#accordion'),false);
	var row = new Row($(".myrow"));
})
