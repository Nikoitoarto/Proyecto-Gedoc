package com.corhuila.electivaii.IService;

import com.corhuila.electivaii.Entity.ABaseEntity;

import java.util.List;

public interface IBaseService<T extends ABaseEntity> {

    List<T> all();
    List<T> findByStateTrue();
    T findById(Long id) throws Exception;
    T save(T entity) throws Exception;
    void update(Long id, T entity) throws Exception;
    void delete(Long id) throws Exception;
}