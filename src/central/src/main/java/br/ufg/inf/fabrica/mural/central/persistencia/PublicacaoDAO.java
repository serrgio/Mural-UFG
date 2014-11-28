/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.Notificacao;
import br.ufg.inf.fabrica.mural.central.dominio.Publicacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author José Sérgio
 * @author Vinícius
 */

public class PublicacaoDAO extends DaoAbstrata<Publicacao, Long>{

    /**
     * Retorna uma Coleção de Publicação.
     *
     * @param termo
     * @param dataInicio
     * @param dataFim
     * @return
     */
    public Collection consultarPublicacoes(String termo, Date dataInicio, Date dataFim) {

        List<Publicacao> publicacoes = new ArrayList<>();

        for (Publicacao p : list()) {
            if (p.getFimVigencia().after(dataFim) && p.getFimVigencia().before(dataInicio)) {
                if(p.getConteudo().contains(termo)){
                    publicacoes.add(p);
                }
            }
        }
        return publicacoes;
    }

    /**
     * estado = agendada
     *
     * @param estado
     * @return
     */
    public Collection obterPublicacoes(String estado) {
        List<Publicacao> publicacoes = new ArrayList<>();

        for (Publicacao p : list()) {
            if (p.getEstado().equals(estado)) {
                publicacoes.add(p);
            }
        }

        return publicacoes;
    }

    public void mudaEstadoPublicacao(String estado, Collection listaPublicacao) {
        update(update(null));
    }

    public List<Publicacao> buscarAgendadas(Date dia) {

        List<Publicacao> publicacoes = new ArrayList<>();

        for (Publicacao p : list()) {
            if (p.getDataAgenda().equals(dia)) {
                publicacoes.add(p);
            }
        }

        return publicacoes;
    }

    public List<Publicacao> buscarVigentesAposPeriodoVigencia(Date dia) {

        List<Publicacao> publicacoes = new ArrayList<>();

        for (Publicacao p : list()) {
            if (p.getFimVigencia().before(dia)) {
                publicacoes.add(p);
            }
        }

        return publicacoes;
    }

    public boolean alterar(Publicacao publicacao){
        update(publicacao);
        return true;
    }

}
