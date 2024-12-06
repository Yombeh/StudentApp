package Controller;


import Repository.StudentRepository;
import com.Advance.Project.Registration.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    Student newStudent(@RequestBody Student newStudent){
        return studentRepository.save(newStudent);
    }

}
