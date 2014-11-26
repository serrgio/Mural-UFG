package br.ufg.inf.fabrica.mural.central.dominio.dao;

import java.util.Collection;

public class NotificacaoDAO {

	public boolean verificarUsuarioNotificacaoDirigida(String login, String senha, String idDispositivo) {
		return false;
	}

	public boolean desabilitarNotificacaoDirigida(String login, String idDispositivo) {
		return false;
	}

	public Collection obterNotificacoes(String estado) {
		return null;
	}

	public void mudaEstadoNotificacao(String estado, Collection listaNotificacao) {

	}

}
