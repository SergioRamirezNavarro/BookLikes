<%--
  Created by IntelliJ IDEA.
  User: AlumnoTarde
  Date: 05/03/2024
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro</title>
</head>
<body>
    <header>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">-idlibro-</th>
                <th scope="col">-titulo-</th>
                <th scope="col">-descripcion-</th>
                <th scope="col">-autor-</th>
                <th scope="col">-fecha de alta-</th>
                <th scope="col">-idusuario-</th>
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
                            <fmt:formatDate value="${book.createdate}" pattern="dd-MM-yyyy" var="formattedCreate_time" />
                            <td><c:out value="${formattedCreatedate}" /></td>
                            <td>
                                <i class="fa-solid fa-pen-to-square"></i>
                            </td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
            </tbody>
        </table>
        <!-- <table>
            <thead>
            <tr>
                <th scope="col">idlibro</th>
                <th scope="col">titulo</th>
                <th scope="col">descripcion</th>
                <th scope="col">autor</th>
                <th scope="col">fecha de alta</th>
                <th scope="col">idusuario</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Dato 1</td>
                <td>Dato 2</td>
                <td>Dato 3</td>
                <td>Dato 4</td>
                <td>Dato 5</td>
                <td>Dato 6</td>
            </tr>
            <tr>
                <td>Dato 1</td>
                <td>Dato 2</td>
                <td>Dato 3</td>
                <td>Dato 4</td>
                <td>Dato 5</td>
                <td>Dato 6</td>
            </tr>
            </tbody>
        </table> -->
    </header>
</body>
</html>
