package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyEmployeesFacadeTest  {
    @Autowired
    CompanyEmployeesFacade companyEmployeesFacade;

    @Test
    public void testQueryCollectorsAsForCompanyDaoAndEmployee() {
        //Given
        Employee janKowalki = new Employee("Jan", "Kowalki");
        Company biedronka = new Company("Biedronka");

        biedronka.getEmployees().add(janKowalki);
        janKowalki.getCompanies().add(biedronka);

        //When
        companyEmployeesFacade.getCompanyDao().save(biedronka);
        companyEmployeesFacade.getEmployeeDao().save(janKowalki);

         List<Company> companiesWithFragmentOfItsName = companyEmployeesFacade.getCompanyDao().retrieveCompaniesWithFragmentOfItsName("edro");// Biedronka
         List<Employee> employeesWithFragmentOfName = companyEmployeesFacade.getEmployeeDao().retrieveEmployeesWithFragmentOfName("walk");// Kowalki

        //Then
        Assert.assertEquals(1, companiesWithFragmentOfItsName.size());
        Assert.assertEquals(1, employeesWithFragmentOfName.size());

        try {
            companyEmployeesFacade.getCompanyDao().deleteAll();
            companyEmployeesFacade.getEmployeeDao().deleteAll();
        } finally {
            //CleanUp
            System.out.println("All records have cleaned up by: companyEmployeesFacade");
        }

    }

}