<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Gestão de Artigos</title>
</head>
<body>

<!-- Barra de menus -->
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<!-- Fim barra de menus -->

<h4>Gestão de Artigos</h4>

<form method="post" action="/artigo/incluir">
  <div class="mb-3 mt-3">
  <br>
    <label>Nome do Artigo</label>
    <input type="text" class="form-control" required placeholder="Digite o nome" name="nome">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Link</label>
    <input type="url" class="form-control" required placeholder="Digite o nome" name="link">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Data de Publicação</label>
    <input type="date" class="form-control" required placeholder="Insira a data de publicação" name="dataPublicacao">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Autor</label>
    <input type="text" class="form-control" required placeholder="Digite o nome do autor" name="autor">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Quantidade de páginas</label>
    <input type="number" class="form-control" required placeholder="Digite a quantidade de páginas" name="qtdPaginas">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Acadêmico</label>
    <div class="checkbox">
    	<input type="checkbox" class="form-control" value="true" name="ehAcademico">
    </div>
  </div>
  <br><br>
  <button type="submit" class="btn btn-primary btn-block">Cadastrar</button>
</form>
</body>
</html>