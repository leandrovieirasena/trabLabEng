$(document).on("click","#btnLogin",function(){
	$.ajax({
		url : 'ServletLogin',
		method: "POST",
		data : {
			txtLogin : $('#txtLogin').val()
		},
		success : function() {
			console.log("ok");
		}
	});
});