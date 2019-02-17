/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diego.server.dao;

/**
 *
 * @author Diego
 */
import com.diego.server.model.Cadastro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class JpaDAO<T extends Cadastro> implements DAO<T> {
    private final EntityManager em;
    private final Class<T> classe;

    public JpaDAO(EntityManager em, Class<T> classe){
        this.em = em;
        this.classe = classe;
    }
    
    @Override
    public List<T> findAll(){
        
        String jpql = "select u from usuario u";
        
        Query q = em.createQuery(jpql);
        return q.getResultList();
    }

    @Override
    public T findById(long id) {
        return em.find(classe, id);
    }

    @Override
    public boolean remove(T entity) {
        em.remove(entity);
        return true;
    }
    
    @Override
    public boolean remove(long id) {
        T entity = findById(id);
        em.remove(entity);
        return true;
    }

    @Override
    public void save(T entity) {
        em.persist(entity);
    }

    @Override
    public T findByField(String fieldName, Object value) {
        final String jpql = "select o from " + classe.getSimpleName() + " o " +
                            " where o." + fieldName + " = :" + fieldName;
        TypedQuery<T> query = em.createQuery(jpql, classe);
        query.setParameter(fieldName, value);
        return query.getSingleResult();
    }
}