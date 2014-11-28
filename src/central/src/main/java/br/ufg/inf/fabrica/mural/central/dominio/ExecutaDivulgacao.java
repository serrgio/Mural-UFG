/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.dominio;

import br.ufg.inf.fabrica.mural.central.persistencia.NotificacaoDAO;
import br.ufg.inf.fabrica.mural.central.persistencia.PublicacaoDAO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author José Sérgio
 * @author Vinícius
 */
@Entity
public class ExecutaDivulgacao implements Serializable, Persistable<Long> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_executa_divulgacao")
    private Long id;

    @Column
    private Collection listaPublicacao;

    @Column
    private Collection listaNotificacao;

    @Column
    private Collection identificador;

    public Collection getListaPublicacao() {
        return listaPublicacao;
    }

    public void setListaPublicacao(Collection listaPublicacao) {
        this.listaPublicacao = listaPublicacao;
    }

    public Collection getListaNotificacao() {
        return listaNotificacao;
    }

    public void setListaNotificacao(Collection listaNotificacao) {
        this.listaNotificacao = listaNotificacao;
    }

    public Collection getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Collection identificador) {
        this.identificador = identificador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.listaPublicacao);
        hash = 89 * hash + Objects.hashCode(this.listaNotificacao);
        hash = 89 * hash + Objects.hashCode(this.identificador);
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
        final ExecutaDivulgacao other = (ExecutaDivulgacao) obj;
        return true;
    }

    @Override
    public String toString() {
        return "ExecutaDivulgacao{" + "id=" + id + ", listaPublicacao=" + listaPublicacao + ", listaNotificacao=" + listaNotificacao + ", identificador=" + identificador + '}';
    } 
    
    public ExecutaDivulgacao ExecutaDivulgacao() {
        return null;        
    }

    public void executarDivulgacao() {      
        Date dia = new Date();        
        obterTodasDivulgacoesAgendadas();
        
        divulgaPublicacao();
        divulgaNotificacao();
    }

    public Collection divulgaPublicacao() {
        
        return null;
    }
    
    public Collection divulgaNotificacao(){
         //for (Notificacao n : list()) {
            //if (n.getFimVigencia().after(dia)) {
                //notificacoesAgendadas.add(n);
         //   }
     //   }
        return null; 
    }
    
    
    public void obterTodasDivulgacoesAgendadas() {
        Date dia = new Date();        
        
        List<Divulgacoes> listaDivulgacoes = (List<Divulgacoes>) new NotificacaoDAO();

        
        List<Publicacao> listaPublicacaoAgendadas = new PublicacaoDAO().buscarAgendadas(dia);
        setListaPublicacao(listaPublicacaoAgendadas);
    }

    public Collection filtraPorPublicacao(Collection listaDivulgacao) {
        return null;
    }

    public Collection filtraPorNotificacao(Collection listaDivulgacao) {
        return null;
    }

    @Override
    public Long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Iterable<Notificacao> list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
