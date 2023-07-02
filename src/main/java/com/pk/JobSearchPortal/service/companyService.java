package com.pk.JobSearchPortal.service;

import com.pk.JobSearchPortal.model.Company_name;
import com.pk.JobSearchPortal.repository.IcompanyRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class companyService {
    IcompanyRepo companyRepo;

    public Iterable<Company_name> getAllCompany() {
       return companyRepo.findAll();
    }

    public String addCompany(Company_name companyName) {
        companyRepo.save(companyName);
        return "added";
    }
}
