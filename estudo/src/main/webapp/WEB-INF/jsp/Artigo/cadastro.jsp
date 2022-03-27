<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Gestão de Artigos</title>
</head>
<body class="container">
<h4>Gestão de Artigos</h4>

<form method="post" action="/artigo/incluir">
  <div class="mb-3 mt-3">
    <label>Nome do Artigo</label>
    <input type="text" class="form-control"  placeholder="Digite o nome" name="nome">
  </div>
  <div class="mb-3 mt-3">
    <label>Link</label>
    <input type="url" class="form-control"  placeholder="Digite o nome" name="link">
  </div>
  <div class="mb-3 mt-3">
    <label>Data de Publicação</label>
    <input type="date" class="form-control"  placeholder="Insira a data de publicação" name="dataPublicacao">
  </div>
  <div class="mb-3 mt-3">
    <label>Autor</label>
    <input type="text" class="form-control"  placeholder="Digite o nome do autor" name="autor">
  </div>
  <div class="mb-3 mt-3">
    <label>Quantidade de páginas</label>
    <input type="number" class="form-control"  placeholder="Digite a quantidade de páginas" name="qtdPaginas">
  </div>
  <div class="mb-3 mt-3">
    <label>Acadêmico</label>
    <div class="checkbox">
    	<input type="checkbox" class="form-control" value="true" name="ehAcademico">
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Cadastrar</button>
</form>
</body>
</html>