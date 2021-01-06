<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Pessoa</title>
</head>
<body>
<form action="/primeiro-web/cadastroPessoa" method="post">
<div>
<label>Nome</label>
<input type="text" name="nome">
</div>
<div>
<label>Sobrenome</label>
<input type="text" name="sobrenome">
</div>
<div>
<label>Senha</label>
<input type="password" name="senha">
</div>
<button type="submit">Cadastrar</button>
</form>


</body>
</html>