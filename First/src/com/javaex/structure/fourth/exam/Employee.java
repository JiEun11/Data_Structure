package com.javaex.structure.fourth.exam;

import java.sql.Date;



public abstract class Employee {

    private String employee_name;
    private int employee_id;  //id
    private String employee_department;
    private int employee_pw;
    private String employee_startdate;
    private double employee_pay;
    private int employee_contract;  //비정규직인지 아닌지 

    

    //TODO: 추가
    public void printAllInfo() {    
        System.out.println(this.employee_name);   // 이름
        System.out.println(this.employee_id);     // 사번 
        System.out.println(this.employee_department);  //부서 
        System.out.println(this.employee_pw);     // 비번 
        System.out.println(this.employee_startdate);   //입사일 
        System.out.println(this.employee_pay);     // 급여 
        System.out.println(this.employee_contract);   // 고용형태 1:정규직, 2:계약직
    }
    
    
    
    public int getEmployee_contract() {
        return employee_contract;
    }


    public void setEmployee_contract(int employee_contract) {
        this.employee_contract = employee_contract;
    }

    public double getEmployee_pay() {
        return employee_pay;
    }

    public void setEmployee_pay(double employee_pay) {
        this.employee_pay = employee_pay;
    }

    public String getEmployee_name() {
        return employee_name;
    }


    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }


    public int getEmployee_id() {
        return employee_id;
    }


    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }


    public String getEmployee_department() {
        return employee_department;
    }


    public void setEmployee_department(String employee_department) {
        this.employee_department = employee_department;
    }


    public int getEmployee_pw() {
        return employee_pw;
    }


    public void setEmployee_pw(int employee_pw) {
        this.employee_pw = employee_pw;
    }


    public String getEmployee_startdate() {
        return employee_startdate;
    }


    public void setEmployee_startdate(String employee_startdate) {
        this.employee_startdate = employee_startdate;
    }

}