package com.ceica.booklikes.controller;



import com.ceica.booklikes.models.User;

import java.time.LocalDate;
import java.util.List;

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

}