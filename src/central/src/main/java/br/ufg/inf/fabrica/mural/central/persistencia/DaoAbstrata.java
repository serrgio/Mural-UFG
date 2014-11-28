/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.Persistable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 *
 * @author José Sérgio
 * @author Vinícius
 */
abstract class DaoAbstrata<T extends Persistable<PK>, PK> implements Dao<T, PK> {

    private final EntityManager entityManager;

    public DaoAbstrata() {
        String persistenceUnitName = "INF";
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(persistenceUnitName);
        this.entityManager = factory.createEntityManager();
    }

    @Override
    public T save(T obj) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.persist(obj);

        entityManager.flush();
        transaction.commit();
        return get(obj.getId());
    }

    @Override
    public T update(T obj) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.merge(obj);

        entityManager.flush();
        transaction.commit();
        return get(obj.getId());
    }

    @Override
    public boolean delete(T obj) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.remove(obj);

        entityManager.flush();
        transaction.commit();
        return true;
    }

    @Override
    public List<T> list() {
        return (List<T>) entityManager.createQuery(("FROM " + getTypeClass().getName())).getResultList();
    }

    @Override
    public T get(PK pk) {
        return (T) entityManager.find(getTypeClass(), pk);
    }

    private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }

}
