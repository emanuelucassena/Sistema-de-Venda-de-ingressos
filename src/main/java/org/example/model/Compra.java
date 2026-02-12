package org.example.model;

import java.time.LocalDate;


public class Compra {

    private Usuario usuario;
    private Ingresso ingresso;
    private Evento evento;
    private LocalDate date;

    public Compra(Usuario usuario, Ingresso ingresso, LocalDate date) {
        this.usuario = usuario;
        this.ingresso = ingresso;
        this.date = date;
    }
    public Compra(Usuario usuario, Ingresso ingresso, Evento evento, LocalDate date) {
        this.usuario = usuario;
        this.ingresso = ingresso;
        this.evento = evento;
        this.date = date;
    }



    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Ingresso getIngresso() {
        return this.ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
