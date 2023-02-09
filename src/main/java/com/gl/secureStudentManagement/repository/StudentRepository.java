package com.gl.secureStudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.secureStudentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
