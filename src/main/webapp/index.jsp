<%@ page import="com.ceica.booklikes.models.ModeloBase" %><%--
  Created by IntelliJ IDEA.
  User: Alumno Tarde
  Date: 05/03/2024
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ModeloBase modeloBase=new ModeloBase() {
        @Override
        protected String getNombreTabla() {
            return null;
        }
    };
    modeloBase.getConnection();
%>
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
            <a href="register">registros</a>
            <br></br>
            <a href="user">usuario</a>
        </div>
    </header>
    <hr>

</div>
</body>
</html>