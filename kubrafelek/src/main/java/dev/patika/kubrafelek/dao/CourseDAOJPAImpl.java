package dev.patika.kubrafelek.dao;

import dev.patika.kubrafelek.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CourseDAOJPAImpl implements CourseDAO<Course> {

    private EntityManager entityManager;

    @Autowired
    public CourseDAOJPAImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Course> findAll() {
        return entityManager.createQuery("FROM Course c", Course.class).getResultList();
    }

    @Override
    public Course findById(int id) {
        return entityManager.find(Course.class, id);
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return entityManager.merge(course);
    }

    @Override
    public int deleteById(int id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
        return id;
    }

    @Override
    public Course update(Course course) {
        return  entityManager.merge(course);
    }
}
