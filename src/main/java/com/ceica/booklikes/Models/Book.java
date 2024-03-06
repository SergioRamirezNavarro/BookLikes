package com.ceica.booklikes.Models;

import java.util.Date;

public class Book extends ModeloBase{
    private  int idlibro;
    private String titulo;
    private String descripcion;
    private String autor;
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
}
