package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {

    private String nome;
    private String descricao;
    private LocalDate data;
    private List<Ingresso> ingressos = new ArrayList<>();
    private String status;

    public Evento(String nome, String descricao, LocalDate data, String status) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.status = status;
    }
    public Evento(String nome, String descricao, LocalDate data) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;

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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
