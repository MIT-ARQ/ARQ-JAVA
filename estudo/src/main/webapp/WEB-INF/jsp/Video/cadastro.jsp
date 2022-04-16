<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Gestão de Videos</title>
</head>
<body>

<!-- Barra de menus -->
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<!-- Fim barra de menus -->

<h4>Gestão de Videos</h4>

<form method="post" action="/video/incluir">
  <div class="mb-3 mt-3">
  <br>
    <label>Nome do Video</label>
    <input type="text" class="form-control"  required placeholder="Digite o nome" name="nome">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Link</label>
    <input type="url" class="form-control"  required placeholder="Digite o nome" name="link">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Data de Publicação</label>
    <input type="date" class="form-control"  required placeholder="Insira a data de publicação" name="dataPublicacao">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Duração</label>
    <input type="number" class="form-control"  required placeholder="Digite a duração em segundos" name="duracao">
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Formato</label>
    <select class="form-control" name="formato" required>
    <option value="">Selecione...</option>
    <option value="MP4">MP4</option>
    <option value="AVI">AVI</option>
    <option value="MOV">MOV</option>
    <option value="RMVB">RMVB</option>
    <option value="3GP">3GP</option>
    <option value="FLV">FLV</option>
    <option value="WMV">WMV</option>
    <option value="MKV">MKV</option>
    </select>
  </div>
  <div class="mb-3 mt-3">
  <br>
    <label>Permite download</label>
    <div class="checkbox">
    	<input type="checkbox" class="form-control" value="true" name="permiteDownload">
    </div>
  </div>
  <div class="mb-3 mt-3">
  	<br><br><br>
  	<button type="submit" class="btn btn-primary btn-block">Cadastrar</button>
  </div>
</form>
</body>
</html>