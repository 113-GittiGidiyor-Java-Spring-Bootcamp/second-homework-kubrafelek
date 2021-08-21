package dev.patika.kubrafelek.service;

import dev.patika.kubrafelek.dao.InstructorDAO;
import dev.patika.kubrafelek.model.Instructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService implements BaseService<Instructor>{

    private InstructorDAO<Instructor> instructorDAO;

    public InstructorService(InstructorDAO<Instructor> instructorDAO) {
        this.instructorDAO = instructorDAO;
    }

    @Override
    public List<Instructor> findAll() {
        return instructorDAO.findAll();
    }

    @Override
    public Instructor findById(int id) {
        return instructorDAO.findById(id);
    }

    @Override
    public Instructor save(Instructor instructor) {
        return instructorDAO.save(instructor);
    }

    @Override
    public Instructor update(Instructor instructor) {
        return instructorDAO.update(instructor);
    }

    @Override
    public int deleteById(int id) {
        return instructorDAO.deleteById(id);
    }
}
