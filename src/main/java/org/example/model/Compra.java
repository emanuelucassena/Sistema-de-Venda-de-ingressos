package org.example.model;

import java.util.Date;

public class Compra {

    private Usuario usuario;
    private Ingresso ingresso;
    private Date data;


    public Compra() {
    }

    public Compra(Usuario usuario, Ingresso ingresso, Date data) {
        this.usuario = usuario;
        this.ingresso = ingresso;
        this.data = data;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
