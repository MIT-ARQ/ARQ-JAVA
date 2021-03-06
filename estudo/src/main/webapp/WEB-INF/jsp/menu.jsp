<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Estudos</a>
    </div>
    <ul class="nav navbar-nav">
    	<c:if test="${not empty usuarioLogado}">
    		<li class="active"><a href="/usuarios">Usuarios</a></li>
	        <li class="active"><a href="/alunos">Alunos</a></li>
	        <li class="active"><a href="/conteudos">Conteudos</a></li>
			<li class="active"><a href="/artigos">Artigos</a></li>
			<li class="active"><a href="/trilhas">Trilhas</a></li>
			<li class="active"><a href="/videos">Videos</a></li>
			<li class="active"><a href="/questionarios">Questionarios</a></li>
		</c:if>
    </ul>
    <ul class="nav navbar-nav navbar-right">
    	<c:if test="${empty usuarioLogado}">
	      <li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
	      <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	    </c:if>
	    <c:if test="${not empty usuarioLogado}">
      		<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout, ${usuarioLogado.nome}</a></li>
      	</c:if>
    </ul>
  </div>
</nav>