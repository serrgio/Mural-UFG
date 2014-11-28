/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.Dispositivo;
import br.ufg.inf.fabrica.mural.central.dominio.Notificacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author José Sérgio
 * @author Vinícius
 */

public class NotificacaoDAO extends DaoAbstrata<Notificacao, Long> {

    public boolean verificarUsuarioNotificacaoDirigida(String login, String senha, long idDispositivo) {

        DispositivoDao dispositivoDao = new DispositivoDao();
        Dispositivo dispositivo = dispositivoDao.buscarDispositivo(idDispositivo);

        if (dispositivo.getUsuario().getLogin().equals(login) && dispositivo.getUsuario().getSenha().equals(senha)) {
            return true;
        } else {
            return false;
        }
    }

    public Collection obterNotificacoes(String estado) {

        List<Notificacao> notificacoes = new ArrayList<Notificacao>();

        for (Notificacao n : list()) {
            if (n.getEstado().equals(estado)) {
                notificacoes.add(n);
            }
        }

        return notificacoes;
    }

    /**
     * Altera o estado de todas as notificações
     *
     * @param estado
     * @param listaNotificacao
     */
    public void mudaEstadoNotificacao(String estado, Collection<Notificacao> listaNotificacao) {

        for (Notificacao n : listaNotificacao) {
            n.setEstado(estado);
            update(n);
        }
    }

    public List<Notificacao> buscarAgendadas(Date dia) {

        List<Notificacao> notificacoesAgendadas = new ArrayList<>();

        for (Notificacao n : list()) {

            if (n.getDataAgenda().equals(dia)) {
                notificacoesAgendadas.add(n);
            }

        }

        return notificacoesAgendadas;
    }

    public List<Notificacao> buscarAgendadasAposPeriodoVigencia(Date dia) {

        List<Notificacao> notificacoesAgendadas = new ArrayList<>();

        for (Notificacao n : list()) {
            if (n.getFimVigencia().before(dia)) {
                notificacoesAgendadas.add(n);
            }
        }

        return notificacoesAgendadas;
    }

    public boolean alterar(Notificacao notificacao){
        update(notificacao);
        return true;
    }

}
