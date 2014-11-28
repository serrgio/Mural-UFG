/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.dominio;

/**
 *
 * @author José Sérgio
 * @author Vinícius
 * @param <PK>
 */
public interface Persistable<PK> {
    PK getId();
}
