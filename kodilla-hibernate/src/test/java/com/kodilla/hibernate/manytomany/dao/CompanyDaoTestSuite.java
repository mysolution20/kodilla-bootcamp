package com.kodilla.hibernate.manytomany.dao;

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
public class CompanyDaoTestSuite {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        // CleanUp
        try {
            // companyDao.deleteById(softwareMachineId);
            // companyDao.deleteById(dataMaestersId);
            // companyDao.deleteById(greyMatterId);
            companyDao.deleteAll();
        } catch (Exception e) {
            //do nothing
            System.out.println("All records have cleaned up by: companyDao");
        }
    }

    @Test
    public void testQueryCollectorsAsForCompanyDaoAndEmployeeDao() {
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
        companyDao.save(biedronka);
        int biedronkaId = biedronka.getId();
        companyDao.save(lidl);
        int lidlId = lidl.getId();

        employeeDao.save(janKowalki);
        int janKowalkiId = janKowalki.getId();
        employeeDao.save(agnieszkaNowak);
        int agnieszkaNowakId = agnieszkaNowak.getId();

        List<Company> companiesWithThreeFirstSigns = companyDao.retrieveCompaniesWithThreeFirstSigns("Bie");
        List<Employee> employeesWithParticularLastName = employeeDao.retrieveEmployeesWithParticularLastName("Nowak");

        //Then
        Assert.assertEquals(1, companiesWithThreeFirstSigns.size());
        Assert.assertEquals(1, employeesWithParticularLastName.size());

        try {
            companyDao.deleteAll();
            employeeDao.deleteAll();
        } finally {
            //CleanUp
            System.out.println("All records have cleaned up by: employeeDao and companyDao");
        }
    }
}