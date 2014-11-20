package br.ufg.inf.fabrica.mural.central.dominio.model;

import br.ufg.inf.fabrica.mural.central.dominio.dao.NotificacaoDAO;
import br.ufg.inf.fabrica.mural.central.dominio.dao.PublicacaoDAO;

import java.util.Collection;

public class ExecutaDivulgacao {

	private Collection listaPublicacao;

	private Collection listaNotificacao;

	/**
	 * 
	 * 
	 */
	private Collection identificador;

	private Publicacao publicacao;

	private Notificacao notificacao;

	private PublicacaoDAO publicacaoDAO;

	private NotificacaoDAO notificacaoDAO;

	public ExecutaDivulgacao ExecutaDivulgacao() {
		return null;
	}

	public void executarDivulgacao() {

	}

	/**
	 * Obter todas as divulgações com estado de "agendada".
	 */
	public Collection obterTodasDivulgacoesAgendadas() {
		return null;
	}

	public Collection filtraPorPublicacao(Collection listaDivulgacao) {
		return null;
	}

	public Collection filtraPorNotificacao(Collection listaDivulgacao) {
		return null;
	}

}
