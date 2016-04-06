$(function() {

	$(".menuItem").on('click',c);
	
	function c() {
		var o = $(this).data("url"),
		    m = $(this).data("index");
		console.log(o);
		var iframe = '<iframe class="J_iframe" name="iframe' + m + '" width="100%" height="100%" src="' + o + '" frameborder="0" data-id="' + o + '" seamless scrolling=no></iframe>'
		$("#container-wrapper").append(iframe);
	}
	
});
