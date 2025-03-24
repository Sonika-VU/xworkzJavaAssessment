package com.xworkz.AccessSpecifier.external;

import com.xworkz.AccessSpecifier.internal.Dress;

public class DressCustomer {

    Dress dress = new Dress();

    public void wear(){
        System.out.println(dress.material);
        dress.purchase();
    }
}
