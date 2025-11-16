package com.shing.gatekeep.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
    
    public void setSection(String section) {
        if (section != null) { this.section = section.toUpperCase(); } 
        else { this.section = null; }
    }
}