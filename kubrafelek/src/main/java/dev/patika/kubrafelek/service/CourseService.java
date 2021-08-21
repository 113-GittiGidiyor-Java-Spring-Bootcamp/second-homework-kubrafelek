package dev.patika.kubrafelek.service;

import dev.patika.kubrafelek.dao.CourseDAO;
import dev.patika.kubrafelek.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements BaseService<Course> {

    private CourseDAO<Course> courseDAO;

    public CourseService(CourseDAO<Course> courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public List<Course> findAll() {
        return courseDAO.findAll();
    }

    @Override
    public Course findById(int id) {
        return courseDAO.findById(id);
    }

    @Override
    public Course save(Course course) {
        return courseDAO.save(course);
    }

    @Override
    public Course update(Course course) {
        return courseDAO.update(course);
    }

    @Override
    public int deleteById(int id) {
        return courseDAO.deleteById(id);
    }
}
