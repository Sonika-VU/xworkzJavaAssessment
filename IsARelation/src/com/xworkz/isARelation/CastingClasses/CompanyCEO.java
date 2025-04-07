package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Company;
import com.xworkz.isARelation.ITComapany;

public class CompanyCEO {

    public void runCompany(Company company){
        company.conductMeeting();
        company.handleClient();
        company.hireEmployee();
        company.paySalary();
        company.releaseProduct();

        if(company instanceof ITComapany){
            ITComapany itComapany = (ITComapany) company;
            itComapany.updateSoftware();
        }
    }
}
