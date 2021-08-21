package dev.patika.kubrafelek.controller;

import dev.patika.kubrafelek.model.Instructor;
import dev.patika.kubrafelek.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class InstructorController {

    InstructorService instructorService;

    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping("/instructors")
    public ResponseEntity findAll() {
        return new ResponseEntity(instructorService.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Instructor> findInstructorById(@PathVariable int id) {
        return new ResponseEntity<>(instructorService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/instructors")
    public Instructor saveInstructor(Instructor instructor) {
        return instructorService.save(instructor);
    }

    @PutMapping("/instructors")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorService.update(instructor);
    }

    @DeleteMapping("/instructors/{id}")
    public int deleteInstructorById(@PathVariable int id) {
        return instructorService.deleteById(id);
    }
}
