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
public class CompanyEmployeesFacadeTest {
    @Autowired
    CompanyEmployeesFacade companyEmployeesFacade;

    @Test
    public void testQueryCollectorsAsForCompanyDaoAndEmployee() {
        //Given
        Employee janKowalki = new Employee("Jan", "Kowalki");
        Company biedronka = new Company("Biedronka");

        //When
        List<Company> companiesWithFragmentOfItsName = companyEmployeesFacade.getCompaniesWithFragmentOfItsName("edro"); // biedronka
        List<Employee> employeesWithFragmentOfName = companyEmployeesFacade.getEmployeesWithFragmentOfName("walk");      // Kowalki


        companiesWithFragmentOfItsName.stream().forEach(System.out::println);
        employeesWithFragmentOfName.stream().forEach(System.out::println);

        //Then
//        Assert.assertTrue(companiesWithFragmentOfItsName.get(0).getName().equals("biedronka"));
//        Assert.assertTrue(employeesWithFragmentOfName.get(0).getFirstname().equals("Kowalki"));
    }
}