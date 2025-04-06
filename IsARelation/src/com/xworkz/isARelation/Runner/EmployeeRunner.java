package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Employee;
import com.xworkz.isARelation.Manager;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Manager();
        Manager manager = new Manager();

        System.out.println("==================");
        employee.attendMeetings();
        employee.getSalary();
        employee.submitReport();
        employee.work();
        employee.takeBreak();

        System.out.println("==================");
        employee1.attendMeetings();
        employee1.getSalary();
        employee1.submitReport();
        employee1.work();
        employee1.takeBreak();

        System.out.println("==================");
        manager.attendMeetings();
        manager.getSalary();
        manager.submitReport();
        manager.work();
        manager.takeBreak();
    }
}
