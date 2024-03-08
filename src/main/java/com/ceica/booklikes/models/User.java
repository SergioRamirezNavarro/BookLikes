package com.ceica.booklikes.models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class User extends ModeloBase {
    private int idusuario;
    private String nombre;
    private String email;
    private String contraseña;

    public User() {
    }

    public User(int idusuario, String nombre, String email, String contraseña) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    protected String getNombreTabla() {
        return "usuario";
    }


    @Override
    public String toString() {
        return "User{" +
                "idusuario=" + idusuario +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }

    public User login(String email, String contraseña) {
        User usuario = new User();
        Connection conn = usuario.getConnection();
        String sql = " select idusuario,nombre,email,contraseña from usuario " +
                "where email=? and contraseña=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, contraseña);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                usuario.idusuario = resultSet.getInt("idusuario");
                usuario.nombre = resultSet.getString("nombre");
                usuario.email = resultSet.getString("email");
                usuario.contraseña = resultSet.getString("contraseña");
                return usuario;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<User> getAll() {
        List<User> userList=new ArrayList<>();
        User user=new User();
        Connection conn=user.getConnection();
        String consulta= "select idusuario,nombre,email,contraseña \n" +
                "from usuario";
        try {
            Statement stm=conn.createStatement();
            ResultSet resultSet=stm.executeQuery(consulta);
            while (resultSet.next()){
                User user1=new User();
                user1.setIdusuario(resultSet.getInt("idusuario"));
                user1.setNombre(resultSet.getString("nombre"));
                user1.setEmail(resultSet.getString("email"));
                user1.setContraseña(resultSet.getString("contraseña"));
                userList.add(user1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }
}