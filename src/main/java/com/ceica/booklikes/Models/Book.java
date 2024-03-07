package com.ceica.booklikes.Models;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book extends ModeloBase{
    private  int idlibro;
    private String titulo;
    private String descripcion;
    private String autor;
    private User user;
    private Date fechaalta;
    private int idusuario;

    public Book() {
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    protected String getNombreTabla() {
        return "libro";
    }

    @Override
    public String toString() {
        return "Book{" +
                "idlibro=" + idlibro +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", autor='" + autor + '\'' +
                ", fechaalta=" + fechaalta +
                ", idusuario=" + idusuario +
                '}';
    }

    public List<Book> getAllByUser(int iduser) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book();
        Connection conn = book1.getConnection();
        String sql = "SELECT idlibro,titulo,descripcion,autor,fechaalta,\n" +
                        "T1.idusuario,nombre\n" +
                        "from libro T0 \n" +
                        "left join usuario T1 on T0.idusuario=T1.idusuario where T1.idusuario=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, iduser);
            ResultSet resultSet = pst.executeQuery();
            bookList=readResulSet(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bookList;
    }

    private List<Book> readResulSet(ResultSet resultSet) throws SQLException {
        List<Book> bookList = new ArrayList<>();
        while (resultSet.next()) {
            Book book = new Book();
            book.idlibro = resultSet.getInt("idlibro");
            book.titulo = resultSet.getString("titulo");
            book.descripcion = resultSet.getString("descripcion");
            book.autor = resultSet.getString("autor");
            book.fechaalta = resultSet.getDate("fechaalta");
            User user = new User();
            user.setIdusuario(resultSet.getInt("idusuario"));
            user.setNombre(resultSet.getString("nombre"));
            book.user = user;
            bookList.add(book);
        }
        return bookList;
    }

    public List<Book> getAll() {
        List<Book> taskList = new ArrayList<>();
        Book task1 = new Book();
        Connection conn = task1.getConnection();
        String sql = "SELECT idlibro,titulo,descripcion,autor,fechaalta,\n" +
                "T1.idusuario,nombre\n" +
                "from libro T0 \n" +
                "left join usuario T1 on T0.idusuario=T1.idusuario";
        try {
            Statement st = conn.createStatement();
            ResultSet resultSet = st.executeQuery(sql);
            taskList=readResulSet(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return taskList;
    }
}