package org.example.service;

import org.example.exceptions.usuario.exceptions.CpfJaCadastradoException;
import org.example.exceptions.usuario.exceptions.LoginIncorretoException;
import org.example.exceptions.usuario.exceptions.LoginJaExistenteException;
import org.example.model.Administrador;
import org.example.model.Cliente;
import org.example.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastraUsuario(String login, String senha, String nome, String cpf, String email, boolean isAdmin) {

        for (Usuario u : this.usuarios) {
            if (u.getCpf().equals(cpf)) {
                throw new CpfJaCadastradoException("CPF já cadastrado, tente outro CPF");
            }
            if (u.getLogin().equals(login)) {
                throw new LoginJaExistenteException("Este login já está em uso.");
            }
        }
        Usuario novoUsuario;

        if (isAdmin) {
            novoUsuario = new Administrador(login, senha, nome, cpf, email);
        } else {
            novoUsuario = new Cliente(login, senha, nome, cpf, email);
        }


        this.usuarios.add(novoUsuario);
    }

    public Boolean login(String login, String senha){

        for (Usuario usuario1 : usuarios){
            if (usuario1.getLogin().equals(login) && usuario1.getSenha().equals(senha)){
                return true;
            }
        }
        throw new LoginIncorretoException("Login ou senha incorretos");
    }
}
