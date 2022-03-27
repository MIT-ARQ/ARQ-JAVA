<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Gestão de Alunos</title>
</head>
<body class="container">
<h4>Gestão de Alunos</h4>

<form method="post" action="/aluno/incluir">
  <div class="mb-3 mt-3">
    <label>Nome do Aluno</label>
    <input type="text" class="form-control"  placeholder="Digite o nome" name="nome">
  </div>
  <div class="mb-3 mt-3">
    <label>Data de Nascimento</label>
    <input type="date" class="form-control"  placeholder="Insira a data de nascimento" name="dataNascimento">
  </div>
  <div class="mb-3 mt-3">
    <label>Profissão</label>
    <input type="text" class="form-control"  placeholder="Digite a profissão" name="profissao">
  </div>
  <button type="submit" class="btn btn-primary">Cadastrar</button>
</form>
</body>
</html>