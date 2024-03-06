package com.ceica.booklikes.servlets;

import com.ceica.booklikes.controller.TaskController;
import com.ceica.booklikes.models.BookDTO;
import com.ceica.booklikes.models.ModeloBase;
import com.ceica.booklikes.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "userServlet", value = "/user")
public class UserServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        String logoutParam = request.getParameter("logout");

        List<BookDTO> bookDTOList = new ArrayList<>();
        BookDTO bookDTO=new BookDTO();
        bookDTO.setIdbook(2);
        bookDTO.setTitle("asdfasd");
        bookDTO.setDescription("assssssssss");
        bookDTO.setAuthor("!asd");
        bookDTO.setCreatetime(new Date("createtime"));
        bookDTO.setIduser(3);
        bookDTOList.add(bookDTO);
        bookDTOList.add(bookDTO);
        request.setAttribute("listaLibros",bookDTOList);

        // Si el parámetro "logout" tiene el valor "salir"
        if ("salir".equals(logoutParam)) {
            // Obtener la sesión actual (creará una nueva si no existe)
            HttpSession session = request.getSession(false);
            if (session != null) {
                // Invalidar la sesión
                session.invalidate();
                // Redireccionar a la página de inicio de sesión, o donde corresponda
                response.sendRedirect(request.getContextPath() + "/");
            }
        }   else
            {
                User user = (User) request.getSession().getAttribute("user");

                if (user == null)
                {
                    response.sendRedirect("login");
                }   else
                    {
                        request.getRequestDispatcher("user.jsp").forward(request, response);
                        response.sendRedirect("admin");
                    }
            }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null)
        {
            response.sendRedirect("login");
        }   else
            {
                //TODO
                response.sendRedirect("login");
            }
    }
}




