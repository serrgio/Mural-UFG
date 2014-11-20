package br.ufg.inf.fabrica.mural.central.dominio.dao;

import java.util.Collection;
import java.util.Date;

public class PublicacaoDAO {

	/**
	 * Retorna uma Coleção de Publicação.
	 */
	public Collection consultarPublicacoes(String termo, Date dataInicio, Date dataFim) {
		return null;
	}

	/**
	 * estado = agendada
	 */
	public Collection obterPublicacoes(String estado) {
		return null;
	}

	public void mudaEstadoPublicacao(String estado, Collection listaPublicacao) {

	}

}
