package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.Calculator;

public class CalcImpl implements Calculator {

    public CalcImpl(){
        System.out.println("no-arg const of CalcImpl");
    }

    @Override
    public void add() {
        System.out.println("Running add in CalcImpl");
    }
}
