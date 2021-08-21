package dev.patika.kubrafelek.controller;

import dev.patika.kubrafelek.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity findAll(){
        return new ResponseEntity(studentService.findAll(), HttpStatus.OK);
    }
}
