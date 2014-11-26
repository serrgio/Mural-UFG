package br.ufg.inf.fabrica.mural.central.dominio.model;

import br.ufg.inf.fabrica.mural.central.dominio.dao.NotificacaoDAO;

import java.util.Date;
import java.util.Collection;

public class Notificacao {

	private NotificacaoDAO notificacaoDAO;

	private Dispositivo dispositivo;

	public Notificacao Notificacao(String login, String senha, String idDispositivo) {
		return null;
	}

	public String desabilitarNotificacoesDirigidas() {
		return null;
	}

	public void agendarNotificacao(Usuario listaDestinario) {

	}

	public void registrarComFalha(Date dataCorrente, Collection listaPublicacao) {

	}

	public Collection obterDispositivos(Collection listaNotificacao) {
		return null;
	}

}
