package com.cmdbms.model;

public class Staffsalary {

    private Integer id;


    private String salaryAmount;


    private Integer staffId;


    public Staffsalary(Integer id, String salaryAmount, Integer staffId) {
        this.id = id;
        this.salaryAmount = salaryAmount;
        this.staffId = staffId;
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


    public Integer getStaffId() {
        return staffId;
    }


    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
}