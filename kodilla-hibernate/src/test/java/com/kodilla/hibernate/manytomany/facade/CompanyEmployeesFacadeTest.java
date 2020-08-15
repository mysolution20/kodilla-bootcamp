package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyEmployeesFacadeTest  {
    @Autowired
    CompanyEmployeesFacade companyEmployeesFacade;

    @Test
    public void testQueryCollectorsAsForCompanyDaoAndEmployee() {
        //Given
        Employee janKowalki = new Employee("Jan", "Kowalki");
        Employee agnieszkaNowak = new Employee("Agnieszka", "Nowak");

        Company biedronka = new Company("Biedronka");
        Company lidl = new Company("Lidl");

        biedronka.getEmployees().add(janKowalki);
        lidl.getEmployees().add(agnieszkaNowak);

        janKowalki.getCompanies().add(biedronka);
        agnieszkaNowak.getCompanies().add(lidl);

        //When
//        companyEmployeesFacade
//        companyEmployeesFacade.save(biedronka);
//        companyDao.save(lidl);
//
//        employeeDao.save(janKowalki);
//        employeeDao.save(agnieszkaNowak);

    }

}