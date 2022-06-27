package com.java.usenko.dao.impl;

import com.java.usenko.dao.AbstractDao;
import com.java.usenko.entity.AbstractEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDaoImpl<T extends AbstractEntity> implements AbstractDao<T> {
    private final List<T> entities = new ArrayList<>();

    @Override
    public void add(T entity) {
        //TODO: сгенерить идшник
        entities.add(entity);
    }

    @Override
    public void remove(Long entityId) {
        entities.removeIf(entity -> entity.getId().equals(entityId));
    }

    @Override
    public T get(Long entityId) {
        for (T entity : entities) {
            if (entityId.equals(entity.getId())) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(entities);
    }

}
