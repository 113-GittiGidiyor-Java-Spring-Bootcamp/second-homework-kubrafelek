package dev.patika.kubrafelek.dao;

import org.springframework.stereotype.Repository;

@Repository
//@Component tüm annotaionlar bu yapıdan gelir
public interface StudentDAO<Student> extends BaseDAO<Student> {


}
