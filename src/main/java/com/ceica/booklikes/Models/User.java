package com.ceica.booklikes.Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

private int iduser;
private int user;

private String username;
private String password;

public User() {
}

public int getIduser() {
    return iduser;
}

public void setIduser(int iduser) {
    this.iduser = iduser;
}

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

@Override
protected String getNombreTabla() {
    return "user";
}


@Override
public String toString() {
    return "User{" +
            "iduser=" + iduser +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
}

public User login(String username, String password) {
    User user=new User();
    Connection conn=user.getConnection();
    String sql="select iduser,username,rol.idrol,description from " +
            "user left join rol on user.idrol=rol.idrol " +
            "where username=? and password=?";
    try {
        PreparedStatement pst=conn.prepareStatement(sql);
        pst.setString(1,username);
        pst.setString(2,password);
        ResultSet resultSet=pst.executeQuery();
        if(resultSet.next()){
            user.iduser=resultSet.getInt("iduser");
            user.username=resultSet.getString("username");
            return user;
        }else {
            return null;
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }


}
}

public class User {
    public int iduser;
    public int username;
    public int password;


    public Connection getConnection() {
    }
}
