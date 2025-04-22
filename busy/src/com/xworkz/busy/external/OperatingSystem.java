package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.Laptop;

public class OperatingSystem {
    Laptop laptop;

    public OperatingSystem(Laptop laptop){
        this.laptop = laptop;
        System.out.println("laptop-arg const of operatingSystem");
    }

    public void setUp(){
        System.out.println("Running setup in operatingSystem");
        if(this.laptop != null){
            this.laptop.process();
        }
    }
}
