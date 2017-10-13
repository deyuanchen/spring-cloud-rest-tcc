package com.github.prontera.service;

/**
 * @author 陈德元
 */
public interface CrudService<T> {

    T find(Long id);

    int persistNonNullProperties(T entity);

    int persist(T entity);

    int updateNonNullProperties(T entity);

    int update(T entity);

    int delete(Long id);

}
