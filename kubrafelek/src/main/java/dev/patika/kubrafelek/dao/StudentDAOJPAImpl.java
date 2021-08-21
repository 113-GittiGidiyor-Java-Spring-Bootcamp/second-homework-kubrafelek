package dev.patika.kubrafelek.dao;

import dev.patika.kubrafelek.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentDAOJPAImpl implements StudentDAO<Student> {

    private EntityManager entityManager;

    @Autowired
    public StudentDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("FROM Student s", Student.class).getResultList();
    }


    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public void save(Student object) {

    }

    @Override
    public void deleteById(int id) {

    }
}
