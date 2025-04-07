package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Employee;
import com.xworkz.isARelation.Manager;

public class Infosys {

    public void assignManager(Employee employee){
        employee.attendMeetings();
        employee.getSalary();
        employee.submitReport();
        employee.work();
        employee.takeBreak();

        if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            manager.assignTask();
        }
    }
}
