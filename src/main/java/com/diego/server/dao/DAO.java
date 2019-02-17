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

public interface DAO<T extends Cadastro> {
    T findById(long id);
    List<T> findAll();
    T findByField(String fieldName, Object value);
    boolean remove(T entity);
    boolean remove(long id);
    void save(T entity);
}
