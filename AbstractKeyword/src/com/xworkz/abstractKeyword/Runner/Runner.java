package com.xworkz.abstractKeyword.Runner;

import com.xworkz.abstractKeyword.external.*;
import com.xworkz.abstractKeyword.internal.*;

public class Runner {
    public static void main(String[] args) {
        Future future = new GoaTrip();
        Shape shape = new Rectangle();
        FashionDesigner fashionDesigner = new Tailor();
        Building building = new Home("SitaRama", "Molakalmuru", 10000000);
        Lodge lodge = new Resort("Nesara", "Madikeri", 3, 2000);

//        shape.draw();
//        fashionDesigner.design();
//        fashionDesigner.teach();
        building.toString();
        lodge.toString();
    }
}
