package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeAndCompanyFacade {

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    public EmployeeAndCompanyFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }


    public List<Company> fetchCompanies(String partOfTheCompanyName){
        return companyDao.retrieveCompaniesByAnyFragmentOfTheName(partOfTheCompanyName);
    }

    public List<Employee> fetchEmployees(String partOfTheLastname){
        return employeeDao.retrieveEmployeesWithAGivenPartOfLastname(partOfTheLastname);
    }


}
