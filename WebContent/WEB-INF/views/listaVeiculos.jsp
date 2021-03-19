<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>
<title>Estacionamento</title>
</head>
<body>
	<c:import url="head.jsp" />
	<br>
	<h2>Lista de Veiculos</h2>
	<br>
	<br>
	<table>
		<th>Id</th>
		<th>Marca</th>
		<th>Modelo</th>
		<th>Cor</th>
		<th>Placa</th>
		<th>Tipo</th>
		<c:forEach items="${veiculos}" var="listValue">
			<tr>
				<td>${listValue.id }</td>
				<td>${listValue.marca }</td>
				<td>${listValue.modelo }</td>
				<td>${listValue.cor }</td>
				<td>${listValue.placa }</td>
				<td>${listValue.tipo }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>