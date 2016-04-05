$(function() {

	$(".submenu li a").on('click', function() {
       console.log($(this).attr("data-index")); 
    });

	
});
