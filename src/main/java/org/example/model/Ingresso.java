package org.example.model;

public class Ingresso {

    private String id;
    private float valor;
    private String status;


    public Ingresso() {
    }

    public Ingresso(String id, float valor, String status) {
        this.id = id;
        this.valor = valor;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
