package dev.patika.kubrafelek.controller;

import dev.patika.kubrafelek.model.Student;
import dev.patika.kubrafelek.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    StudentService studentService;

    //Service kısmında annotion koyarak hata halledildi
    @Autowired //yeni versiyonlarda tek param varken gerek yok
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //endpoint yaratıldı
    @GetMapping("/students")
    public ResponseEntity findAll() {
        return new ResponseEntity(studentService.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Student> findStudentById(@PathVariable int id) {
        return new ResponseEntity<>(studentService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/students")
    public Student saveStudent(Student student) {
        return studentService.save(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.update(student);
    }

    @DeleteMapping("/students/{id}")
    public int deleteStudentById(@PathVariable int id) {
        return studentService.deleteById(id);
    }

}
