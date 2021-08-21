package dev.patika.kubrafelek.dao;

import dev.patika.kubrafelek.model.Student;

import java.util.List;

public interface BaseDAO<T> {
    List<T> findAll();

    T findById(int id);

   T save(T object);

    int deleteById(int id);

    T update(T object);
}
