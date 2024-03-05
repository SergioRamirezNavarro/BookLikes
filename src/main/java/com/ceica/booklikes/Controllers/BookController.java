package com.ceica.tareasweb.controller;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.List;
private int User;
private String login;


public class TaskController {
    public User userLogged;

    public boolean login(String username,String password){

        User user=new User();
        userLogged=user.login(username,password);
        if(userLogged!=null){
            return true;
        }else {
            return false;
        }

    }


    public boolean editPassword(String username,String password){
        User user=new User();
        return user.actualizar("password=? where username=?",password,username);
    }

    public boolean createTask(String title, String description, LocalDate deadline){
        Task task=new Task();
        task.insertar("(title,description,deadline,iduser) values (?,?,?,?)",title,description,deadline,userLogged.getIduser());
        return true;
    }

    public List<Task> getAllTaskByUser(){
        Task task=new Task();
        return task.getAllByUser(userLogged.getIduser());
    }
    public List<Book> getAllTask(){
        Book book=new Book();
        return book.getAll();
    }

    public boolean completeTask(int idtask){
        Book book=new Book();
        return book.actualizar("status=? where idtask=?",true, idtask);
    }

    }

    public List<User> getAllUser() {
        User user=new User();
        return  user.getAll();
    }


    public boolean updateUser(User user) {
        return user.actualizar("password=?,idrol=? where iduser=?",user.getPassword(),user.getRol().getIdrol(),user.getIduser());
    }

    public boolean deleteTask(int idTask){
        Book task=new Book();
        return task.borrar("idtask=?",idTask);
    }
}
