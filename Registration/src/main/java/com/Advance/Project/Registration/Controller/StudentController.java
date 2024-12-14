package com.Advance.Project.Registration.Controller;


import com.Advance.Project.Registration.Exception.StudentNotFoundException;
import com.Advance.Project.Registration.Repository.StudentRepository;
import com.Advance.Project.Registration.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    Student newStudent(@RequestBody Student newStudent) {
        return studentRepository.save(newStudent);
    }

    @GetMapping("/allStudents")
    List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    Student getStudentId(@PathVariable Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    @PutMapping("/student/{id}")
    Student updateStudent(@RequestBody Student newStudent, @PathVariable Long id) {
        return studentRepository.findById(id)
                .map(student -> {

                    student.setUserName(newStudent.getUserName());
                    student.setMatNumber(newStudent.getMatNumber());
                    student.setCourse(newStudent.getCourse());
                    student.setGrade(newStudent.getGrade());
                    student.setClassDuration(newStudent.getClassDuration());

                    return  studentRepository.save(student);
                }).orElseThrow(() -> new StudentNotFoundException(id));

    }

        @DeleteMapping("/student/{id}")
    String deleteUser(@PathVariable Long id){
        if(!studentRepository.existsById(id)){
            throw new StudentNotFoundException(id);
        }
         studentRepository.deleteById(id);
        return  " Student with id " + id +" has been deleted sucessfully.";
        }



}
