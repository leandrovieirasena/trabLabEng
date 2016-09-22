<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="gerestoque.model.Funcionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Dashboard</title>
<link rel="stylesheet" href="css/generico.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
	
	<% if(session.getAttribute("usuario") != null){ %>	
	
	<nav class="navbar navbar-default navbar-static-top">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" href="#">Gerencia Estoque Show</a>
	    </div>
	
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	      <ul class="nav navbar-nav">
	        <li>
	        	<a href="#">Funcionários<i class="glyphicon glyphicon-user margin-icone-menu"></i></a>
	        </li>
	        <li>
	        	<a href="#">Lojas<i class="glyphicon glyphicon-home margin-icone-menu"></i></a>
	        </li>
	        <li class="active">
	        	<a href="#">Produtos<i class="glyphicon glyphicon-tags margin-icone-menu"></i></a>
	        </li>
	        <li>
	        	<a href="#">Requisicões<i class="glyphicon glyphicon-list-alt margin-icone-menu"></i></a>
	        </li>
	      </ul>
	      <ul class="nav navbar-nav navbar-right">
	        <li>
	        	<a href="#">Bem-Vindo <b> <%= session.getAttribute("usuario") %></b><i class="glyphicon glyphicon-sunglasses margin-icone-menu"></i></a>
	        </li>
			<li>
				<a href="./index.jsp">Sair <% session.invalidate(); %></a>
			</li>
	      </ul>
	    </div>
	  </div>
	</nav>
	
	<div class="container-fluid">
		<div class="col-xs-12">
			<h1>Olá</h1>
		</div>
	</div>
	
	<% } else { %>
	
	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-12">
				<h1 class="text-center">Ahhhhhhhhhhh! Você não devia estar aqui....</h1>
				<br>
				<iframe class="center-block" width="560" height="315" 
					src="https://www.youtube.com/embed/SIaFtAKnqBU?autoplay=1&controls=0&loop=1">
				</iframe>
				<h1 class="text-center">Tente realizar seu Login,<br> e boa sorte na Prova de Lab.Engenharia. :)</h1>
			</div>
		</div>
	</div>
	
	
	<% } %>
	
</body>
</html>