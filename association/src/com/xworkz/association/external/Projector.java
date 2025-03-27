package com.xworkz.association.external;

import com.xworkz.association.internal.Lamp;
import com.xworkz.association.internal.Quality;
import com.xworkz.association.internal.Warranty;
import com.xworkz.association.internal.Wire;

import java.awt.geom.QuadCurve2D;

public class Projector {

    Warranty warranty = new Warranty();
    Lamp lamp = new Lamp(warranty);
    Quality quality = new Quality();
    Wire wire = new Wire(quality);

    public void useProjector(){

        this.lamp.setCost(500);
        this.lamp.setColor("Blue");
        System.out.println("Lamp cost : "+this.lamp.getCost());
        System.out.println("Lamp color : "+this.lamp.getColor());
        this.lamp.glow();

        this.wire.setLength(100);
        this.wire.setCost(500);
        System.out.println("Wire length : "+this.wire.getLength());
        System.out.println("Wire cost : "+this.wire.getCost());
        this.wire.transferData();




    }



}
