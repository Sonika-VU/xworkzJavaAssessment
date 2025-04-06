package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Company;
import com.xworkz.isARelation.ITComapany;

public class CompanyRunner {
    public static void main(String[] args) {
        Company company = new Company();
        Company company1 = new ITComapany();
        ITComapany itComapany = new ITComapany();

        System.out.println("==============================");
        company.conductMeeting();
        company.handleClient();
        company.hireEmployee();
        company.paySalary();
        company.releaseProduct();

        System.out.println("==============================");
        company1.conductMeeting();
        company1.handleClient();
        company1.hireEmployee();
        company1.paySalary();
        company1.releaseProduct();

        System.out.println("==============================");
        itComapany.conductMeeting();
        itComapany.handleClient();
        itComapany.hireEmployee();
        itComapany.paySalary();
        itComapany.releaseProduct();
    }
}
