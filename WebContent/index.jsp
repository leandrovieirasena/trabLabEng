<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"> -->
<title>Acesso Sistema</title>
<link rel="stylesheet" href="css/generico.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="alinha-box-login">
			<div class="box-login">		
				<div class="row">
					<div class="col-xs-12">
						<h4 class="text-center">Gerencia Estoque Show</h4>
						<img src="imgs/estoque-index.png" class="img-responsive center-block imagem-estoque-index">
						<label for="txtLogin">Login:</label>
						<input type="text" class="form-control" name="txtLogin" id="txtLogin">
						<hr class="divider"></hr>
						<label for="txtSenha">Senha:</label>
						<input type="password" class="form-control" name="txtSenha" id="txtSenha">
						<hr class="divider"></hr>
						<button id="btnLogin" class="btn btn-primary btn-block">Logar</button>
					</div>
				</div>
			</div>	
		</div>
	</div>

</body>
</html>