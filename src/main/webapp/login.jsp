<%--
  Created by IntelliJ IDEA.
  User: Alumno Tarde
  Date: 05/03/2024
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" href="assets/css/login.css">
</head>
<body>
<div class="container row">
    <section class="w-100">
        <style>
            .bg-image-vertical {
                position: relative;
                overflow: hidden;
                background-repeat: no-repeat;
                background-position: right center;
                background-size: auto 100%;
            }

            @media (min-width: 1025px) {
                .h-custom-2 {
                    height: 100%;
                }
            }
        </style>
        <div class="row">
            <div class="col-sm-6 text-black">



                <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

                    <form action="" method="post" style="width: 23rem;">

                        <h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Log in</h3>

                        <div class="form-outline mb-4">
                            <input type="text" id="form2Example18" name="email" class="form-control form-control-lg">
                            <label class="form-label" for="form2Example18">Email</label>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="password" id="form2Example28" name="password" class="form-control form-control-lg">
                            <label class="form-label" for="form2Example28">Password</label>
                        </div>

                        <div class="pt-1 mb-4">
                            <button class="btn btn-info btn-lg btn-block" type="submit">Login</button>
                        </div>
                        <c:if test="${mensaje!=null}">
                            <p class="text-muted">${mensaje}</p>
                        </c:if>


                    </form>

                </div>

            </div>

        </div>
    </section>
</div>


</body>
</html>
