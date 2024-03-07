package com.ceica.booklikes.controller;

import com.ceica.booklikes.models.User;
import java.time.LocalDate;
import java.util.List;

public class TaskController {
    public User userLogged;

    public boolean login(String nombre,String contraseña){

        User user=new User();

        userLogged=user.login(nombre,contraseña);
        if(userLogged!=null){
            return true;
        }else {
            return false;
        }

    }

    public boolean createUser(String nombre, String email, String contraseña)
    {
        User task=new User();
        task.insertar("(nombre,email,contraseña) values (?,?,?)",nombre,email,contraseña);
        return true;
    }
}