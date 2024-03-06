<%--
  Created by IntelliJ IDEA.
  User: AlumnoTarde
  Date: 05/03/2024
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuario</title>
</head>
<body>
<div class="container">
    <header>
        Welcome, <p>${name}</p>
        <a href="?logout=salir">salir</a>
    </header>
    <hr>
    <div class="datos">
        <table class="table">
            <thead>
                <table>
                    <tr>
                        <th scope="col">-idlibro-</th>
                        <th scope="col">-titulo-</th>
                        <th scope="col">-descripcion-</th>
                        <th scope="col">-autor-</th>
                        <th scope="col">-fecha de creacion-</th>
                        <!-- <th scope="col">contraseña</th> -->

                    </tr>
                </table>
            </thead>

            <tbody id="tableTask">
            <c:choose>
                <c:when test="${empty listalibros}">
                    <tr>
                        <td colspan="3">No hay tareas disponibles.</td>
                    </tr>
                </c:when>
                <c:otherwise>
                    <c:forEach items="${listalibros}" var="book">
                        <tr>
                            <td><c:out value="${book.idbook}"/></td>
                            <td><c:out value="${book.title}"/></td>
                            <td><c:out value="${book.description}"/></td>
                            <td><c:out value="${book.author}"/></td>
                            <fmt:formatDate value="${book.createtime}" pattern="dd-MM-yyyy" var="formattedCreate_time" />
                            <td><c:out value="${formattedCreatetime}" /></td>
                            <td><c:out value="${book.iduser}"/></td>
                            <td>
                                <i class="fa-solid fa-pen-to-square"></i>
                                <i onClick="borrar(${book.idtask})" class="fa-solid fa-trash"></i>
                            </td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
            </tbody>
        </table>

    </div>
</div>


</body>
</html>
