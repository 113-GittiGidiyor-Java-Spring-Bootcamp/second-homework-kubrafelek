package dev.patika.kubrafelek.dao;

import dev.patika.kubrafelek.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@Component tüm annotaionlar bu yapıdan gelir
public interface StudentDAO<Student> extends BaseDAO<Student> {


}
