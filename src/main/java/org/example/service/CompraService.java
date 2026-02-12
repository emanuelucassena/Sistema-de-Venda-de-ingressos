package org.example.service;

import org.example.exceptions.compra.exceptions.CancelamentoInvalidoException;
import org.example.exceptions.compra.exceptions.EventoInativoException;
import org.example.exceptions.compra.exceptions.IngressoEsgotadoException;
import org.example.model.Compra;
import org.example.model.Evento;
import org.example.model.Ingresso;
import org.example.model.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CompraService {

    List<Compra> compras = new ArrayList<>();

    public void comprarIngresso(Usuario usuario, Evento evento){
        if (!evento.getStatus().equals("Ativo")){
            throw new EventoInativoException("Evento indisponível para compra");
        }

        Ingresso disponivel = null;
        for (Ingresso ingresso : evento.getIngressos()){
            if (ingresso.getStatus().equals("Disponivel")){
                disponivel = ingresso;
                break;
            }
        }

        if (disponivel == null){
            throw new IngressoEsgotadoException("Ingressos esgotados");
        }

        disponivel.setStatus("vendido");
        Compra compra = new Compra(usuario, disponivel, LocalDate.now());
        compras.add(compra);
    }


    public List<Compra> listarIngressosComprados(Usuario usuario){
        List<Compra> listaDeCompras = new ArrayList<>();
        for (Compra c : compras){
            if (c.getUsuario().equals(usuario)){
                listaDeCompras.add(c);
            }
        }
        return listaDeCompras;
    }

    public void cancelarCompra(Compra compra){
        if (compra.getEvento().getData().isBefore(LocalDate.now()))
        {
            throw new CancelamentoInvalidoException("Evento já passou");
        }

        compra.getIngresso().setStatus("Disponível");

        compras.remove(compra);
    }



}
