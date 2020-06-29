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
            System.out.println("All records have not cleaned up by: companyDao");
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
        companyDao.save(lidl);

        employeeDao.save(janKowalki);
        employeeDao.save(agnieszkaNowak);

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

    @Test
    public void testQueryCompanyEmployeeLastName() {

        //Given
        final String EMPLOYEE_LAST_NAME = "Nowak";
        final String SECOND_EMPLOYEE_LAST_NAME = "Kowalska";

        Employee employee = new Employee("Agnieszka","Nowak");

        //When
        employeeDao.save(employee);
        List<Employee> employees = employeeDao.retrieveEmployeesWithParticularLastName(EMPLOYEE_LAST_NAME);
        String employeeLastName = employees.get(0).getLastname();

        //Then
        Assert.assertEquals(EMPLOYEE_LAST_NAME, employeeLastName);
        Assert.assertNotEquals(SECOND_EMPLOYEE_LAST_NAME,employeeLastName);

        try {
            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
            System.out.println("Records have not cleaned up by employeeDao collector controller" );
        }
    }

    @Test
    public void testQueryThreeFirstCompanySigns() {

        //Given
        final String THREE_FIRST_SIGNS_COMPANY_NAME = "Bie";
        final String SECOND_THREE_FIRST_SIGNS_COMPANY_NAME = "Lid";

        Company biedronka = new Company("Biedronka");

        //When
        companyDao.save(biedronka);
        List<Company> companiesWithThreeFirstSigns = companyDao.retrieveCompaniesWithThreeFirstSigns(THREE_FIRST_SIGNS_COMPANY_NAME);
        String threeFirstCompanySigns = companiesWithThreeFirstSigns.get(0).getName();

        //Then
        Assert.assertEquals(THREE_FIRST_SIGNS_COMPANY_NAME, threeFirstCompanySigns.substring(0, 3));
        Assert.assertNotEquals(SECOND_THREE_FIRST_SIGNS_COMPANY_NAME, threeFirstCompanySigns.substring(0, 3));

        try {
            companyDao.deleteAll();
        } catch (Exception e) {
            //do nothing
            System.out.println("Records have not cleaned up by companyDao collector controller" );
        }
    }
}