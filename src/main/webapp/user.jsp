<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Usuario</title>
</head>
<body>
<div class="container">
    <header>

        Welcome, -${name}-
        <a href="?logout=salir">salir</a>
    </header>
    <hr>
    <div class="datos">
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
                                <td><c:out value="${book.idlibro}"/></td>
                                <td><c:out value="${book.titulo}"/></td>
                                <td><c:out value="${book.descripcion}"/></td>
                                <td><c:out value="${book.autor}" /></td>
                                <td>
                                    <i class="fa-solid fa-pen-to-square"></i>
                                </td>
                                <td><button onclick="">dar like libro</button></td>
                            </tr>
                        </c:forEach>
                    </c:otherwise>
                </c:choose>
                </tbody>
            </table>
        <button onclick="">dar alta libro</button>

        <button onclick="">dar baja libro</button>
           <%--     <table>
                    <tr>
                        <th scope="col">-idlibro-</th>
                        <th scope="col">-titulo-</th>
                        <th scope="col">-descripcion-</th>
                        <th scope="col">-autor-</th>
                         <th scope="col">-fecha de creacion-</th>
                        <th scope="col">-idusuario-</th>

                    </tr>
                </table>
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
                            <td><c:out value="${book.author}"/></td>
                            <td><c:out value="${book.iduser}"/></td>
                            <<td>
                                <i class="fa-solid fa-pen-to-square"></i>
                                <i onClick="borrar(${book.idbook})" class="fa-solid fa-trash"></i>
                            </td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
            </tbody>
        </table> --%>

    </div>
</div>


</body>
</html>
