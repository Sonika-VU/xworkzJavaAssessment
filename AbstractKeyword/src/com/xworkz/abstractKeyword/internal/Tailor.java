package com.xworkz.abstractKeyword.internal;

import com.xworkz.abstractKeyword.external.FashionDesigner;

public class Tailor extends FashionDesigner {
    @Override
    public void design() {
        System.out.println("Abstract method : Running design in Tailor");
    }

    @Override
    public void teach() {
        super.teach();
        System.out.println("Non-abstract method : Running teach in Tailor");
    }
}
