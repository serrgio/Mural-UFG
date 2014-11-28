/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.dominio;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author José Sérgio
 * @author Vinícius
 */
@Entity
public class Publicacao implements Divulgacoes, Serializable, Persistable<Long> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publicacao")
    private Long id;
    @Column
    private String titulo;
    @Column
    private String conteudo;
    @Column
    private String estado;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAgenda;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date inicioVigencia;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fimVigencia;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataAgenda() {
        return dataAgenda;
    }

    public void setDataAgenda(Date dataAgenda) {
        this.dataAgenda = dataAgenda;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public Date getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(Date fimVigencia) {
        this.fimVigencia = fimVigencia;
    }

    @Override
    public Long getId() {
        return id;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Publicacao other = (Publicacao) obj;
        return true;
    }

}
