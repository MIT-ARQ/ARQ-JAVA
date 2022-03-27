<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Gestão de Trilhas</title>
</head>
<body class="container">
<h4>Gestão de Trilhas</h4>

<form method="post" action="/trilha/incluir">
  <div class="mb-3 mt-3">
    <label>Nome da Trilha</label>
    <input type="text" class="form-control"  placeholder="Digite o nome" name="nome">
  </div>
  <div class="mb-3 mt-3">
    <label>Categoria</label>
    <input type="text" class="form-control"  placeholder="Digite a categoria" name="categoria">
  </div>
  <div class="mb-3 mt-3">
    <label>Área</label>
    <input type="text" class="form-control"  placeholder="Insira a área" name="area">
  </div>
  <button type="submit" class="btn btn-primary">Cadastrar</button>
</form>
</body>
</html>