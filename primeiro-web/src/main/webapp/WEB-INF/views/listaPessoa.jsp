<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Pessoas</title>
</head>
<body>
<h1>Pessoas Cadastradas</h1>

<table>
<tr>
<td>Nome</td>
<td>Sobrenome</td>
</tr>

<c:forEach items="${pessoas }" var="pessoa">
<tr>
<td>${pessoa.nome } </td>
<td> ${pessoa.sobrenome } </td>
</tr>
</c:forEach>




</table>



</body>
</html>