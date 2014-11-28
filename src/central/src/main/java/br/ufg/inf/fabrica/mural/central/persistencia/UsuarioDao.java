/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.GrupoDestinatario;
import br.ufg.inf.fabrica.mural.central.dominio.Publicacao;
import br.ufg.inf.fabrica.mural.central.dominio.Usuario;

import java.util.Collection;

/**
 *
 * @author Vinicius Maboni
 */
public class UsuarioDao  extends DaoAbstrata<Usuario, Long> {

    public boolean validarUsuario(Usuario usuario){
        Usuario usuarioPersistido = get(usuario.getId());
        return usuarioPersistido.equals(usuario);
    }

    public Collection obterUsuarioGrupo(GrupoDestinatario grupoDestinatario){
        return list();
    }

    public boolean bloquearUsuario(Usuario usuario, String operacao)
    {
        return true;
    }
}
