package com.emr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emr.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
