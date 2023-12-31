package com.example.demo.student;

public interface StudentRepository extends JpaRepository<Student, Long> {

  @Query("SELECT" s FROM Student s WHERE s.email = ?1")
      Optional<Student> findStudentByEmail(String email);
}