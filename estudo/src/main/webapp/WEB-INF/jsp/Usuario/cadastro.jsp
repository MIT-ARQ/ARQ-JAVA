<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Cadastro de Usuário</title>
</head>
<body>

<!-- Barra de menus -->
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<!-- Fim barra de menus -->

<h4>Cadastro de Usuário</h4>

<form method="post" action="/usuario/incluir">
  <div class="mb-3 mt-3">
    <label>Nome do usuario</label>
    <input type="text" class="form-control"  required placeholder="Digite o nome" name="nome">
  </div>
  <div class="mb-3 mt-3">
    <label>E-mail</label>
    <input type="email" class="form-control"  required placeholder="Digite o e-mail" name="email">
  </div>
  <div class="mb-3 mt-3">
    <label>Senha</label>
    <input type="password" class="form-control"  required placeholder="Insira a senha" name="senha">
  </div>
  <button type="submit" class="btn btn-primary">Cadastrar</button>
</form>
</body>
</html>