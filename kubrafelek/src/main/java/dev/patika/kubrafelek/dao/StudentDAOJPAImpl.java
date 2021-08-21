package dev.patika.kubrafelek.dao;

import dev.patika.kubrafelek.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
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
        return entityManager.find(Student.class, id);
    }

    @Override
    public Student save(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public int deleteById(int id) {
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
        return id;
    }

    @Override
    @Transactional
    public Student update(Student student) {
        entityManager.merge(student);
        return student;
    }
}
