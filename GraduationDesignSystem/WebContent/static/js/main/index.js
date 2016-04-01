// 手风琴
var Accordion = function(el) {
		this.el = el || {};
		var links = this.el.find('.title');
		links.on('click',this.el, this.dropdown)
	}

Accordion.prototype.dropdown = function(e) {
	var $el = e.data;
		$this = $(this),
		$next = $this.next();
	$next.slideToggle("normal");
	$this.parent().toggleClass('open');
	$el.find('.submenu').not($next).slideUp().parent().removeClass('open');
}
