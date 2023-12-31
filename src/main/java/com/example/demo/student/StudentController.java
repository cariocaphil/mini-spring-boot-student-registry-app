package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demo.student.Student;
import com.example.demo.student.StudentService;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

  private final StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService){
    this.studentService = studentService;
  }

  @GetMapping
  public List<Student> getStudents() {
    return studentService.getStudents();
  }

  @PostMapping
  public List<Student> registerNewStudent(@RequestBody Student student) {
    return studentService.addNewStudent(student);
  }

}


