package org.example.service;

import org.example.exceptions.usuario.exceptions.CpfJaCadastradoException;
import org.example.exceptions.usuario.exceptions.LoginIncorretoException;
import org.example.exceptions.usuario.exceptions.LoginJaExistenteException;
import org.example.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastraUsuario(String login, String senha, String nome, String cpf, String email){
        for (Usuario usuario : this.usuarios){
            if (usuario.getCpf().equals(cpf)){
                throw new CpfJaCadastradoException("CPF já cadastrado, tente outro CPF");
            }
            if (usuario.getLogin().equals(login)){
                throw new LoginJaExistenteException("Este login já está em uso.");
            }
        }
        Usuario novousuario = new Usuario(login,senha, nome, cpf, email);
        usuarios.add(novousuario);

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
