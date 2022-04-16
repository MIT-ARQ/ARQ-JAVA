<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Gestão de Alunos</title>
</head>
<body>

<!-- Barra de menus -->
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<!-- Fim barra de menus -->

<h4>Gestão de Alunos</h4>

<form method="post" action="/aluno/incluir">
  <div class="mb-3 mt-3">
  <br>
    <label>Nome do Aluno</label>
    <input type="text" class="form-control"  placeholder="Digite o nome" name="nome">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Data de Nascimento</label>
    <input type="date" class="form-control"  placeholder="Insira a data de nascimento" name="dataNascimento">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Profissão</label>
    <input type="text" class="form-control"  placeholder="Digite a profissão" name="profissao">
  </div>
  <br>
  <button type="submit" class="btn btn-primary btn-block">Cadastrar</button>
</form>
</body>
</html>