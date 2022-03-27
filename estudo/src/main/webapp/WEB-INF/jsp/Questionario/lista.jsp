<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Gestão de Questionários</title>
</head>
<body>
<h3>Cadastramento de Questionários (${listagem.size()})</h3>
<a href="/questionario" class="btn btn-success">Novo questionário</a>

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
	      <th scope="col">Link</th>
	      <th scope="col">Data de publicação</th>
	      <th scope="col">Nivel</th>
	      <th scope="col">Quantidade de questões</th>
	      <th scope="col">Tipo</th>
	      <th scope="col">Ações</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach var="l" items="${listagem}">
	    <tr>
	      <td>${l.id}</th>
	      <td>${l.nome}</th>
	      <td><a href=${l.link}>Link</a></td>
	      <td>${l.dataPublicacao}</td>
	      <td>${l.nivel}</td>
	      <td>${l.qtdQuestoes}</td>
	      <td>${l.tipo}</td>
	      <td><a href="/questionario/${l.id}/excluir">excluir</a></td>
	    </tr>
	  </c:forEach>
	  </tbody>
	</table>
</c:if>

</body>
</html>