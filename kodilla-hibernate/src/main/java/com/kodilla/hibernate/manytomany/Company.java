package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * NamedNativeQuery  --> nativ z bazy SQL tabeli @Table(name = "COMPANIES") dlatego 'COMPANIES'
 */
@NamedNativeQuery(
        name = "Company.retrieveCompaniesWithThreeFirstSigns",
        query = "SELECT * FROM COMPANIES " +
                "WHERE LEFT(COMPANY_NAME,3) = :THREE_FIRST_SIGNS_COMPANY_NAME",
        resultClass = Company.class
)
@NamedQuery(
        name = "Company.retrieveCompaniesWithFragmentOfItsName",
        query = "FROM Company WHERE COMPANY_NAME LIKE CONCAT('%',:FRAGMENT_OF_COMPANY_NAME,'%')"
)
/**
 * @NamedQuery --> nie nativ piszemy z encji (czyt.class)  dlatego 'Company'
 */
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}