package dev.patika.kubrafelek.service;

import dev.patika.kubrafelek.model.Instructor;

import java.util.List;

public interface BaseService<T> {

    List<T> findAll();
    T findById(int id);
    T save(T object);
    T update(T object);
    int deleteById(int id);

}
