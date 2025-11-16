package com.shing.gatekeep.repository;

import com.shing.gatekeep.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// This manages Student (Key: String LRN)
public interface AttendanceRecordRepository extends JpaRepository<Student, String> { 
}