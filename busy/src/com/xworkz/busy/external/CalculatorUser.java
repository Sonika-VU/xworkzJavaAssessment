package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.Calculator;

public class CalculatorUser {
    Calculator calculator;

    public CalculatorUser(Calculator calculator ){
        this.calculator = calculator;
        System.out.println("calculator-arg const of CalculatorUser");
    }

    public void getResult(){
        System.out.println("Running getResult in CalculatorUser");
        if(this.calculator != null){
            this.calculator.add();
        }
    }
}
