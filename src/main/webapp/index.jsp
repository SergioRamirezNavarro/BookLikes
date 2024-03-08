<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>index</title>
    <link rel="stylesheet" href="assets/css/index.css">
</head>
<body>

<div class="container">
    <header class="header1">
        <div>
            <h1 style="text-align:center; font-size: 75px; color: #EAEAEA">Book Likes</h1>
            <br></br>
        </div>
    </header>
    <hr>
    <header class="header2">
        <div>
            <a href="login">login</a>
            <br></br>
        </div>
    </header>
    <table class="table" align="center">

        <thead>
        <tr>
            <th scope="col">id libro</th>
            <th scope="col">Título</th>
            <th scope="col">Descripción</th>
            <th scope="col">Autor</th>
        </tr>
        </thead>

        <tbody>
        <c:choose>
            <c:when test="${empty listaLibros}">
                <tr>
                    <td colspan="3">No hay tareas disponibles.</td>
                </tr>
            </c:when>
            <c:otherwise>
                <c:forEach items="${listaLibros}" var="book">
                    <tr>
                        <td><c:out value="${book.idlibro}"/></td>
                        <td><c:out value="${book.titulo}"/></td>
                        <td><c:out value="${book.descripcion}"/></td>
                        <td><c:out value="${book.autor}" /></td>
                        <td>
                            <i class="fa-solid fa-pen-to-square"></i>


                        </td>
                    </tr>
                </c:forEach>
            </c:otherwise>
        </c:choose>
        </tbody>
    </table>
</div>
</body>
</html>
