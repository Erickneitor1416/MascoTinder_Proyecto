<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/cards.css">
<title>Mis Mascotas</title>
</head>
<body>
<div>Bienvenido ${nombrePropietario}</div>
<div class="tinder--masc">
			<c:forEach items="${misMascotas}" var="m">
				<div class="tinder--card">
					<img src="${m.url}">
					<h3>${m.nombre}</h3>
					<p>${m.edad}</p>
					<p>${m.sexo}</p>
					<p>${m.especie}</p>
				</div>
			</c:forEach>
		</div>
</body>
</html>