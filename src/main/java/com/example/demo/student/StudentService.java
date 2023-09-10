package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDate;
import java.time.Month.JANUARY;

@Service
public class StudentService {

  private final StudentRepository

  @Autowired
  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  public List<Student> getStudents() {
    return studentRepository.findAll();
  }
}

