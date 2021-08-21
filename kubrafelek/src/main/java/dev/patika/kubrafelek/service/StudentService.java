package dev.patika.kubrafelek.service;

import dev.patika.kubrafelek.dao.StudentDAO;
import dev.patika.kubrafelek.dao.StudentDAOJPAImpl;
import dev.patika.kubrafelek.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements BaseService<Student>{

    private StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
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
