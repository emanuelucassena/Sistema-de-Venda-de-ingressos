package org.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {

    private String nome;
    private String descricao;
    private Date data;
    private List<Ingresso> ingressos = new ArrayList<>();
    private String status;

    public Evento(String nome, String descricao, Date data, String status) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
