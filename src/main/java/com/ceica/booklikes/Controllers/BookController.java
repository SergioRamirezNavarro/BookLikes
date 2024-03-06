package com.ceica.booklikes.Controllers;

import com.ceica.booklikes.Models.*;


import java.time.LocalDate;
import java.util.List;




public class BookController {
    public User userLogged;

    public boolean login(String username, String password) {

        User user = new User();
        userLogged = user.login(username, password);
        if (userLogged != null) {
            return true;
        } else {
            return false;
        }

    }


    public boolean editPassword(String username, String password) {
        User user = new User();
        return user.actualizar("password=? where username=?", password, username);
    }

    public boolean createBook(String title, String description, LocalDate deadline) {
        Book book = new Book();
        book.insertar("(title,description,deadline,iduser) values (?,?,?,?)", title, description, deadline, userLogged.getIduser());
        return true;
    }

    public List<Book> getAllBookByUser() {
        Book Book = new Book();
        return Book.getAllByUser(userLogged.getIduser());
    }

    public List<Book> getAllBook() {
        Book book = new Book();
        return book.getAll();
    }


    public List<User> getAllUser() {
        User user = new User();
        return user.getAll();
    }


    public boolean deleteBook(int idBook) {
        Book Book = new Book();
        return Book.borrar("idbook=?", idBook);
    }

    public boolean favouriteBook(int idBook) {
        Book Book = new Book();
        return Book.favourite("idbook=?", idBook);
    }
}
