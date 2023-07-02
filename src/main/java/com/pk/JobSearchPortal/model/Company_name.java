package com.pk.JobSearchPortal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company_name {
    @Id
    private long id;
    private String description;
    private String location;
    private double salary;
    private String companyEmail;
    @Column(unique = true)
    private String companyName;
    private String employerName;
    private Type companyType;


}
