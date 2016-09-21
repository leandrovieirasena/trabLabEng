$(document).on("click","#btnLogin",function(){
	$.ajax({
		url : 'ServletLogin',
		method: "GET",
		data : {
			txtLogin : $('#txtLogin').val(),
			txtSenha : $('#txtSenha').val()
		},
		success : function() {
			console.log("ok");
		}
	});
});