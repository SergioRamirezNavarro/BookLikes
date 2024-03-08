package com.ceica.booklikes.servlets;

import com.ceica.booklikes.Models.Book;
import com.ceica.booklikes.Models.BookDTO;
import com.ceica.booklikes.Models.User;
import com.ceica.booklikes.controller.BookController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "indexServlet", value = "")
public class IndexServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //quitar cuando se pille el controlador

       //hasta aqui

        BookController bookController= new BookController();
        List<Book> bookList= bookController.getAllBook();
       request.setAttribute("listaLibros",bookList);
        request.getRequestDispatcher("index.jsp").forward(request, response);


    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


    }
}
