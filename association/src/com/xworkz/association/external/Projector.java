package com.xworkz.association.external;

import com.xworkz.association.internal.Lamp;
import com.xworkz.association.internal.Warranty;

public class Projector {

    Warranty warranty = new Warranty();
    Lamp lamp = new Lamp(warranty);

    public void useProjector(){

        lamp.setCost(500);
        lamp.setColor("Blue");
        System.out.println("Lamp cost : "+this.lamp.getCost());
        System.out.println("Lamp color : "+this.lamp.getColor());
        lamp.glow();




    }



}
