/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.Persistable;
import java.util.List;

/**
 *
 * @author José Sérgio
 * @author Vinícius
 * @param <T>
 * @param <PK>
 */
public interface Dao<T extends Persistable<PK>, PK> {

	public T save(T obj);

	public T update(T obj);

	public boolean delete(T obj);

	public List<T> list();

	public T get(PK key);
}
