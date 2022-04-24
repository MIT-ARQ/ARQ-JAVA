<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Gestão de Trilhas</title>
</head>
<body>

<!-- Barra de menus -->
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<!-- Fim barra de menus -->

<h3>Cadastramento de Trilhas (${listagem.size()})</h3>
<a href="/trilha" class="btn btn-success">Nova trilha</a>

<br><br>

<c:if test="${empty listagem}">
	<h5>Nenhum conteúdo a ser exibido.</h5>
</c:if>

<c:if test="${not empty listagem}">
	<table class="table table-stripped table-bordered">
	  <thead class="thead-dark">
	    <tr>
	      <th scope="col">ID</th>
	      <th scope="col">Nome</th>
	      <th scope="col">Categoria</th>
	      <th scope="col">Área</th>
	      <th scope="col">Conteudo</th>
	      <th scope="col">Aluno</th>
	      <th scope="col">Ações</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach var="l" items="${listagem}">
	    <tr>
	      <td>${l.id}</td>
	      <td>${l.nome}</td>
	      <td>${l.categoria}</td>
	      <td>${l.area}</td>
	      <td>${l.conteudos.size()}</td>
	      <td>${l.aluno.nome}</td>
	      <td><a href="/trilha/${l.id}/excluir">excluir</a></td>
	    </tr>
	  </c:forEach>
	  </tbody>
	</table>
</c:if>

</body>
</html>