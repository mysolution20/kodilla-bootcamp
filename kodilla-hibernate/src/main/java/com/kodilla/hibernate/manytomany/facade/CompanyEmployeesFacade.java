package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyEmployeesFacade  {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public CompanyEmployeesFacade() {
    }

    public CompanyDao getCompanyDao() {
        return companyDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }
}
