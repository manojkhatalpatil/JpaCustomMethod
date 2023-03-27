package com.csi.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    @Size(min = 2, message = "First Name should be more than 2 character")
    private String empFirstName;

    @Pattern(regexp = "[A-Za-z]*", message = "Last name should not contain space and special characters")
    private String empLastName;

    private String empAddress;

    @Column(unique = true)
    @Size(min = 10, max = 10, message = "Contact Number Must be 10 Digit")
    private String empContactNumber;

    private double empSalary;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;

    @Column(unique = true)
    @Email(message = "Email id Must be valid")
    private String empEmailId;

    @Size(min = 4, message = "Password At least 4 Character")
    private String empPassword;


}
