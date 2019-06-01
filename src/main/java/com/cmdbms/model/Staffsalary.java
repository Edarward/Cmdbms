package com.cmdbms.model;

public class Staffsalary {

    private Integer id;

    private String salaryAmount;

    private Integer salaryLevel;

    public Staffsalary(Integer id, String salaryAmount, Integer salaryLevel) {
        this.id = id;
        this.salaryAmount = salaryAmount;
        this.salaryLevel = salaryLevel;
    }


    public Staffsalary() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(String salaryAmount) {
        this.salaryAmount = salaryAmount == null ? null : salaryAmount.trim();
    }

    public Integer getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(Integer salaryLevel) {
        this.salaryLevel = salaryLevel;
    }
}