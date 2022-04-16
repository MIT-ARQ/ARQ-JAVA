<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Gestão de Questionários</title>
</head>
<body>

<!-- Barra de menus -->
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<!-- Fim barra de menus -->

<h4>Gestão de Questionários</h4>

<form method="post" action="/questionario/incluir">
  <div class="mb-3 mt-3">
  <br>
    <label>Nome do Questionário</label>
    <input type="text" class="form-control"  required placeholder="Digite o nome" name="nome">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Link</label>
    <input type="url" class="form-control"  required placeholder="Digite o link" name="link">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Data de Publicação</label>
    <input type="date" class="form-control"  required placeholder="Insira a data de publicação" name="dataPublicacao">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Quantidade de questões</label>
    <input type="number" class="form-control"  required placeholder="Digite a quantidade de questões" name="qtdQuestoes">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Nivel</label>
    <select class="form-control" name="nivel" required>
    <option value="">Selecione...</option>
    <option value="INICIANTE">INICIANTE</option>
    <option value="INTERMEDIARIO">INTERMEDIARIO</option>
    <option value="AVANCADO">AVANCADO</option>
    </select>
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Tipo</label>
    <select class="form-control" name="tipo" required>
    <option value="">Selecione...</option>
    <option value="MULTIPLA ESCOLHA">MULTIPLA ESCOLHA</option>
    <option value="DISSERTATIVO">DISSERTATIVO</option>
    <option value="CORRELACIONE COLUNA">CORRELACIONE COLUNA</option>
    <option value="ESTUDO DE CASO">ESTUDO DE CASO</option>
    <option value="ORDENE ACOES">ORDENE ACOES</option>
    </select>
  </div>
  <br>
  <button type="submit" class="btn btn-primary btn-block">Cadastrar</button>
</form>
</body>
</html>