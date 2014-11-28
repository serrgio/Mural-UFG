/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.Dispositivo;
import br.ufg.inf.fabrica.mural.central.dominio.Notificacao;
import br.ufg.inf.fabrica.mural.central.dominio.Usuario;

import java.util.List;

/**
 *
 * @author José Sérgio
 * @author Vinícius
 */
public class DispositivoDao extends DaoAbstrata<Dispositivo, Long> {

    public Dispositivo buscarDispositivo(Usuario usuario) {

        List<Dispositivo> dispositivos = list();

        for(Dispositivo d: dispositivos)
        {
            if(d.getUsuario().equals(usuario))
            {
                return d;
            }
        }

	    return null;
    }

    public Dispositivo buscarDispositivo(long idDispositivo) {
        return get(idDispositivo);
    }
}
