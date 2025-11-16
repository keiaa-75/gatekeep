package com.shing.gatekeep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import java.time.LocalDateTime;

@Entity
public class AttendanceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lrn;
    private LocalDateTime attendanceTime;
    
    @Transient private String surname;
    @Transient private String firstName;
    @Transient private String strand;
    @Transient private Integer gradeLevel;
    @Transient private String section;

    // Constructors
    public AttendanceRecord() {}
    public AttendanceRecord(String lrn, LocalDateTime attendanceTime) {
        this.lrn = lrn;
        this.attendanceTime = attendanceTime;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getLrn() { return lrn; }
    public void setLrn(String lrn) { this.lrn = lrn; }
    public LocalDateTime getAttendanceTime() { return attendanceTime; }
    public void setAttendanceTime(LocalDateTime attendanceTime) { this.attendanceTime = attendanceTime; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getStrand() { return strand; }
    public void setStrand(String strand) { this.strand = strand; }
    public Integer getGradeLevel() { return gradeLevel; }
    public void setGradeLevel(Integer gradeLevel) { this.gradeLevel = gradeLevel; }
    public String getSection() { return section; }
    public void setSection(String section) { this.section = section; }
}