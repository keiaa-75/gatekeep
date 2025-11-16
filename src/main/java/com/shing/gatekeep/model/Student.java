package com.shing.gatekeep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Student {
    @Id
    @NotBlank(message = "LRN is required")
    @Pattern(regexp = "^\\d{12}$", message = "LRN must be exactly 12 digits")
    private String lrn;

    @NotBlank(message = "Surname is required")
    private String surname;

    @NotBlank(message = "First Name is required")
    private String firstName;
    
    @Size(max = 10)
    private String middleInitial;

    @NotBlank(message = "Strand is required")
    private String strand; 

    @NotNull(message = "Grade Level is required")
    @Min(value = 11) @Max(value = 12)
    private Integer gradeLevel; // This MUST be an Integer

    @NotBlank(message = "Section is required")
    private String section;

    @Pattern(regexp = "^(09|\\+639)\\d{9}$", message = "Must be a valid 11-digit PH mobile number")
    private String contactNumber;
    
    // Getters and Setters...
    public String getLrn() { return lrn; }
    public void setLrn(String lrn) { this.lrn = lrn; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getMiddleInitial() { return middleInitial; }
    public void setMiddleInitial(String middleInitial) { this.middleInitial = middleInitial; }
    public String getStrand() { return strand; }
    public void setStrand(String strand) { this.strand = strand; }
    public Integer getGradeLevel() { return gradeLevel; }
    public void setGradeLevel(Integer gradeLevel) { this.gradeLevel = gradeLevel; }
    public String getSection() { return section; }
    public void setSection(String section) {
        if (section != null) { this.section = section.toUpperCase(); } 
        else { this.section = null; }
    }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
}