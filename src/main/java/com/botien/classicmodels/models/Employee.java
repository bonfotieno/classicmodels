package com.botien.classicmodels.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.io.Serializable;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    @Id
    @Column(name = "employee_number", nullable = false)
    private Integer employeeNumber;

    @Size(max = 50)
    @NotNull
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Size(max = 50)
    @NotNull
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Size(max = 10)
    @NotNull
    @Column(name = "extension", nullable = false, length = 10)
    private String extension;

    @Size(max = 100)
    @NotNull
    @Column(name = "email", nullable = false, length = 100)
    private String email;


    @NotNull
    @ManyToOne(fetch = LAZY, optional = false)
    @JoinColumn(name = "office_code", nullable = false,foreignKey = @ForeignKey(name = "employees_ibfk_2"))
    private Office officeCode;


    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "reports_to",foreignKey = @ForeignKey(name = "employees_ibfk_1"))
    private Employee reportsTo;


    @Size(max = 50)
    @NotNull
    @Column(name = "job_title", nullable = false, length = 50)
    private String jobTitle;


    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Office getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(Office officeCode) {
        this.officeCode = officeCode;
    }

    public Employee getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Employee reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
