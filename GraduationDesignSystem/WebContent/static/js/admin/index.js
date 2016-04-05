$(function() {

	$(".submenu li a").on('click', function() {
       var index = $(this).attr('data-index');
       $.get("books"+index+".json").success(function() {
    	  $("#content").html(""); 
       });       
    });

	
});
