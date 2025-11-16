package com.shing.gatekeep.repository;

import com.shing.gatekeep.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    // Using String as ID type since Student uses LRN (String) as ID
}