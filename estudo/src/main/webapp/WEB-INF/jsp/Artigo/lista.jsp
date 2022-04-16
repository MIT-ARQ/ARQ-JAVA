<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Gestão de Artigos</title>
</head>
<body>

<!-- Barra de menus -->
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<!-- Fim barra de menus -->

<h3>Cadastramento de Artigos (${listagem.size()})</h3>

<a href="/artigo" class="btn btn-success">Novo artigo</a>

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
	      <th scope="col">Autor</th>
	      <th scope="col">Quantidade de páginas</th>
	      <th scope="col">Acadêmico</th>
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
	      <td>${l.autor}</td>
	      <td>${l.qtdPaginas}</td>
	      <td><input class="form-check-input" style="margin-left:20px" type="checkbox" value="" checked disabled></td>
	      <td><a href="/artigo/${l.id}/excluir">excluir</a></td>
	    </tr>
	  </c:forEach>
	  </tbody>
	</table>
</c:if>

</body>
</html>