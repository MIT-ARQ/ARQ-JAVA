<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Gestão de Trilhas</title>
</head>
<body>

<!-- Barra de menus -->
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<!-- Fim barra de menus -->

<h4>Gestão de Trilhas</h4>

<form method="post" action="/trilha/incluir">
  <div class="mb-3 mt-3">
  <br>
    <label>Nome da Trilha</label>
    <input type="text" class="form-control"  required placeholder="Digite o nome" name="nome">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Categoria</label>
    <input type="text" class="form-control"  placeholder="Digite a categoria" name="categoria">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Área</label>
    <input type="text" class="form-control"  placeholder="Insira a área" name="area">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Aluno:</label>
    <select name="aluno.id" class="form-control">
	    <c:forEach var="a" items="${alunos}">
	    	<option value="${a.id}">${a.nome}</option>
	    </c:forEach>
    </select>
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Conteudos:</label>
    <div class="checkbox">
	    <c:forEach var="c" items="${conteudos}">
	    	<label><input type="checkbox" value="${c.id}" name="idsConteudos" checked> ${c.nome} </label>
	    </c:forEach>
    </div>
  </div>
  <br>
  <button type="submit" class="btn btn-primary btn-block">Cadastrar</button>
</form>
</body>
</html>