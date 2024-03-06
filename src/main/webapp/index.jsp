<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>index</title>

</head>
<body>
<div class="container">
    <header>
        <div>
            <h1>Book Likes</h1>
            <a href="login">login</a>
            <br></br>
        </div>
    </header>
    <hr>
    <table class="table">
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
                        <td><c:out value="${book.idbook}"/></td>
                        <td><c:out value="${book.title}"/></td>
                        <td><c:out value="${book.description}"/></td>
                        <td><c:out value="${book.author}" /></td>
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
