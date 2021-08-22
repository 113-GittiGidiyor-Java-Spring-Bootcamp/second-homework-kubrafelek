package dev.patika.kubrafelek;

import dev.patika.kubrafelek.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.Month;

@SpringBootTest
class KubrafelekApplicationTests {

    @Test
    void contextLoads() {
    }


    void saveData(){

        Student student1 = new Student("Leylanur Akdağ", LocalDate.of(1998, Month.AUGUST, 12), "Istanbul/Sile", "Female");
        Student student2 = new Student("Merve Anık", LocalDate.of(1999, Month.JANUARY, 2), "Istanbul/Bakirköy", "Female");
        Student student3 = new Student("Anıl Yavas", LocalDate.of(1997, Month.APRIL, 17), "Istanbul/Bahcesehir", "Male");

        Course course1 = new Course("Introduction to Java", 101, 4);
        Course course2 = new Course("Object Oriented Programming", 102, 3);
        Course course3 = new Course("Database Systems", 222, 4);

        Instructor permanentInstructor1 = new PermanentInstructor("Emine Ekin", "Istanbul", "5087891122", 10000);
        Instructor permanentInstructor2 = new PermanentInstructor("Olcay Taner", "Ankara", "5893454554", 12000);
        Instructor visitingResearcher = new VisitingResearcher("İlknur Karadeniz", "Izmir", "5678908890", 400);

        course1.setInstructor(permanentInstructor1);
        course2.setInstructor(permanentInstructor2);
        course3.setInstructor(visitingResearcher);

        course1.getStudentList().add(student1);
        course1.getStudentList().add(student2);
        course1.getStudentList().add(student3);
    }

}
