package hms.core.student.manager.api;

import hms.core.student.manager.entity.Student;
import hms.core.student.manager.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    public StudentRepository studentRepository;

    @RequestMapping("/index")
    public @ResponseBody Iterable<Student> index() {
        try{
            Iterable<Student> all = studentRepository.findAll();
            return all;
        } catch (Exception e) {
            return null;
        }
    }
}
