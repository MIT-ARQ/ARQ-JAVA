<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Gest�o de Usu�rios</title>
</head>
<body>

<!-- Barra de menus -->
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<!-- Fim barra de menus -->

<h3>Cadastramento de Usu�rios(${listagem.size()})</h3>

<br><br>

<c:if test="${empty listagem}">
	<h5>Nenhum conte�do a ser exibido.</h5>
</c:if>

<c:if test="${not empty listagem}">
	<table class="table table-stripped table-bordered">
	  <thead class="thead-dark">
	    <tr>
	      <th scope="col">ID</th>
	      <th scope="col">Nome</th>
	      <th scope="col">Email</th>
	      <th scope="col">Alunos</th>
	      <th scope="col">Conteudos</th>
	      <th scope="col">A��es</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach var="l" items="${listagem}">
	    <tr>
	      <td>${l.id}</th>
	      <td>${l.nome}</th>
	      <td>${l.email}</td>
	      <td>${l.alunos.size()}</td>
	      <td>${l.conteudos.size()}</td>
		  <td>
		      <c:if test="${usuarioLogado.admin}">
		      	<a href="/usuario/${l.id}/excluir">excluir</a>
		      </c:if>
		  </td>	
	    </tr>
	  </c:forEach>
	  </tbody>
	</table>
</c:if>

</body>
</html>