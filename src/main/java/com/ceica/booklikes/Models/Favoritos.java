package com.ceica.booklikes.Models;

import java.util.Date;

public class Favoritos extends ModeloBase {
    private int idfavorito;
    private int idusuario;
    private int idlibro;
    private Date fechafavorito;

    public int getIdfavorito() {
        return idfavorito;
    }

    public void setIdfavorito(int idfavorito) {
        this.idfavorito = idfavorito;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public Date getFechafavorito() {
        return fechafavorito;
    }

    public void setFechafavorito(Date fechafavorito) {
        this.fechafavorito = fechafavorito;
    }

    public Favoritos() {

    }

    @Override
    protected String getNombreTabla() {
        return null;
    }
}
