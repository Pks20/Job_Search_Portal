package com.pk.JobSearchPortal.repository;

import com.pk.JobSearchPortal.model.Company_name;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IcompanyRepo extends CrudRepository<Company_name, Long> {
}
