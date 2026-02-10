package org.example.model;

import java.util.Date;

public class Compra {

    private Usuario usuario;
    private Ingresso ingresso;
    private Date date;

    public Compra(Usuario usuario, Ingresso ingresso, Date date) {
        this.usuario = usuario;
        this.ingresso = ingresso;
        this.date = date;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
