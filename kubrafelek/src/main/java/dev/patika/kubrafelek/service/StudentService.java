package dev.patika.kubrafelek.service;

import dev.patika.kubrafelek.dao.StudentDAO;
import dev.patika.kubrafelek.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements BaseService<Student> {

    private StudentDAO<Student> studentDAO;

    public StudentService(StudentDAO<Student> studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public List<Student> findAll() {

        return studentDAO.findAll();
    }

    @Override
    public Student findById(int id) {

        return studentDAO.findById(id);
    }

    @Override
    public Student save(Student student) {

        return studentDAO.save(student);
    }

    public Student update(Student student){
        return studentDAO.update(student);
    }

    @Override
    public int deleteById(int id) {
        return studentDAO.deleteById(id);
    }
}
