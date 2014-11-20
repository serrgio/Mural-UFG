package br.ufg.inf.fabrica.mural.central.dominio.model;

import br.ufg.inf.fabrica.mural.central.dominio.dao.PublicacaoDAO;

import java.util.Date;
import java.util.Collection;

public class Publicacao extends FormaDivulgacao {

	private long id;

	private PublicacaoDAO publicacaoDAO;

	private PublicacaoDAO publicacaoDAO;

	public void colocarEmVigencia(Date dataCorrente, Collection listaPublicacao) {

	}

	public void suspender(Date dataCorrente, Collection listaPublicacao) {

	}

	public void registrarComFalha(Date dataCorrente, Collection listaPublicacao) {

	}

}
