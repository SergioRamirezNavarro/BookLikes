package com.ceica.booklikes.controller;

import com.ceica.booklikes.models.*;


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
    public boolean register(String username,String email,String password){
        User user = new User();
        return user.insertar("(username,email,contraseña) values (?,?,?)",username,email,password);
    }


    public boolean createBook(String title, String description, LocalDate deadline) {
        Book book = new Book();
        book.insertar("(title,description,deadline,iduser) values (?,?,?,?)", title, description, deadline, userLogged.getIdusuario());
        return true;
    }

    public List<Book> getAllBookByUser() {
        Book book = new Book();
        return book.getAllByUser(userLogged.getIdusuario());
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
        Book book = new Book();
        return book.borrar("idbook=?", idBook);
    }



}
