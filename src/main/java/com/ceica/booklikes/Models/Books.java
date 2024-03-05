package com.ceica.booklikes.Models;

public class Books {
    private final String idusuario;

    public Books(String titulo, String descripcion, String autor, int FechaAlta, String idusuario) {
        Titulo = titulo;
        Descripcion = descripcion;
        Autor = autor;
        FechaAlta = FechaAlta;
        this.idusuario = idusuario;
    }
    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int fechaAlta() {
        return FechaAlta;
    }

    @Override
    public String toString() {
        return  idusuario +"idusuario:" + Titulo + ", Autor: " + Autor + ", Fecha de Alta: " + FechaAlta;
    }
}


private String Titulo;
    private String Descripcion;
    private String Autor;
    private int FechaAlta;
    private String idusuario;

}
