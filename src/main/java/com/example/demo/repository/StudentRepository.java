package com.example.demo.repository;

import com.example.demo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("select s  from Student s where s.id =:id")
    Student findById(int id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Student (name) VALUES  (?) ", nativeQuery = true)
    void createStudent(String name);
}
