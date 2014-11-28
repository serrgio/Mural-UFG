/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.dominio;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author José Sérgio
 * @author Vinícius
 */
@Entity
public class Dispositivo implements Serializable, Persistable<Long> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dispositivo")
    private Long id;

    @Column
    private String listaNotificacao;
    
    @Column
    private String identificadorGCM;
    
    @Column
    private Usuario usuario;

    public String getListaNotificacao() {
        return listaNotificacao;
    }

    public void setListaNotificacao(String listaNotificacao) {
        this.listaNotificacao = listaNotificacao;
    }

    public String getIdentificadorGCM() {
        return identificadorGCM;
    }

    public void setIdentificadorGCM(String identificadorGCM) {
        this.identificadorGCM = identificadorGCM;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.listaNotificacao);
        hash = 83 * hash + Objects.hashCode(this.identificadorGCM);
        hash = 83 * hash + Objects.hashCode(this.usuario);
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
        final Dispositivo other = (Dispositivo) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "id=" + id + ", listaNotificacao=" + listaNotificacao + ", identificadorGCM=" + identificadorGCM + ", usuario=" + usuario + '}';
    }  

    @Override
    public Long getId() {
        return id;
    }  
}
