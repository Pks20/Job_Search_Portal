package com.pk.JobSearchPortal.controller;

import com.pk.JobSearchPortal.model.Company_name;
import com.pk.JobSearchPortal.service.companyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class companyController {
    @Autowired
    companyService companyservice;
    @GetMapping("company")
    public Iterable<Company_name> getAllCompany(){
        return companyservice.getAllCompany();
    }
    @PostMapping("company")
    public String addCompany(@RequestBody Company_name companyName){
        return companyservice.addCompany(companyName);
    }
}
