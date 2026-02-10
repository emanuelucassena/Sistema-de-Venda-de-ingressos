package org.example.service;

import org.example.exceptions.evento.exceptions.DataInvalidaException;
import org.example.exceptions.evento.exceptions.EventoJaCadastradoException;
import org.example.exceptions.evento.exceptions.ListadeEventosDisponíveisVaziaException;
import org.example.exceptions.evento.exceptions.QuantidadedeIngressosInvalidaException;
import org.example.model.Evento;
import org.example.model.Ingresso;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventoService {

    List<Evento> eventos = new ArrayList<>();

    public void cadastrarEvento(String nome, String descricao, Date data, int qtdIngresso, float valorIngresso){
        if (data.before(new Date())){
            throw new DataInvalidaException("Não é possível cadastrar eventos em datas passadas. ");
        }
        if (qtdIngresso <= 0){
            throw new QuantidadedeIngressosInvalidaException("O evento deve ter pelo menos um ingresso disponível.");
        }
        for (Evento e : eventos){
            if (e.getNome().equals(nome) && e.getData().equals(data)){
                throw new EventoJaCadastradoException("Já existe um evento com este nome nesta data.");
            }
        }
        Evento evento = new Evento(nome, descricao, data);
        List<Ingresso> ingressosGerados = new ArrayList<>();
        for (int i = 1; i <= qtdIngresso; i++) {
            String idIngresso = nome.substring(0, Math.min(nome.length(), 3)).toUpperCase() + "-" + i;

            Ingresso ingresso = new Ingresso(idIngresso, valorIngresso, "Disponível");
            ingressosGerados.add(ingresso);
        }

        evento.setIngressos(ingressosGerados);
        evento.setStatus("Ativo");
        eventos.add(evento);

    }

    public List<Evento> listarEventosDisponiveis(Evento evento) {
        List<Evento> ativos = new ArrayList<>();
        for (Evento e : eventos) {
            if (e.getStatus().equals("Ativo")){
                ativos.add(e);
            }
        }
        if (ativos.isEmpty()){
            throw new ListadeEventosDisponíveisVaziaException("Não há eventos ativos no momento.");
        }

        return ativos;
        }

    }

