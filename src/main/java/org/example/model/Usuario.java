package org.example.model;

import java.util.List;

public class Usuario {

    private String login;
    private String senha;
    private String nome;
    private String CPF;
    private String email;
    private List<Compra>compras;

    public Usuario() {
    }

    public Usuario(String login, String senha, String nome, String CPF, String email) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    public List<Compra> getCompras() {
        return compras;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
