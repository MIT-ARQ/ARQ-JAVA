<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Gestão de Questionários</title>
</head>
<body class="container">
<h4>Gestão de Questionários</h4>

<form method="post" action="/questionario/incluir">
  <div class="mb-3 mt-3">
    <label>Nome do Questionário</label>
    <input type="text" class="form-control"  placeholder="Digite o nome" name="nome">
  </div>
  <div class="mb-3 mt-3">
    <label>Link</label>
    <input type="url" class="form-control"  placeholder="Digite o link" name="link">
  </div>
  <div class="mb-3 mt-3">
    <label>Data de Publicação</label>
    <input type="date" class="form-control"  placeholder="Insira a data de publicação" name="dataPublicacao">
  </div>
  <div class="mb-3 mt-3">
    <label>Quantidade de questões</label>
    <input type="number" class="form-control"  placeholder="Digite a quantidade de questões" name="qtdQuestoes">
  </div>
  <div class="mb-3 mt-3">
    <label>Nivel</label>
    <input type="text" class="form-control"  placeholder="Digite nivel" name="nivel">
  </div>
  <div class="mb-3 mt-3">
    <label>Tipo</label>
    <div class="checkbox">
    	<input type="text" class="form-control"  placeholder="Digite o tipo" name="tipo">
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Cadastrar</button>
</form>
</body>
</html>