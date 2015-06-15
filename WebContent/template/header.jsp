<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BANCO TEROBAN</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.css"/>
</head>
<body>

<header>
    <nav>
    <ul>
        <li><a href="${pageContext.request.contextPath}/Banco/altaTarjeta">Alta Tarjeta</a></li>
        <li><a href="${pageContext.request.contextPath}/Banco/enviarPago">Enviar pago online</a></li>
        <li><a href="${pageContext.request.contextPath}/Banco/bloquearTarjeta">Bloquear tarjeta bancaria</a></li>
        <li><a href="${pageContext.request.contextPath}/Banco/ampliarCupo">Ampliar cupo en cajero</a></li>
        <li><a href="${pageContext.request.contextPath}/Banco/listarTodos">Ver listado de tarjetas</a></li>
     
    </ul>
    </nav>

</header> 