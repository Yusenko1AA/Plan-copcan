package com.java.usenko.dao;

import com.java.usenko.entity.AbstractEntity;

import java.util.List;

public interface AbstractDao <T extends AbstractEntity> {
    void add(T entity);
    void remove(Long entityId);
    T get(Long entityId);
    List<T> getAll();
    void update(Long clientId, T entityToUpdate);
}
