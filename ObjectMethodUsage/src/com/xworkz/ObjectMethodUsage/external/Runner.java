package com.xworkz.ObjectMethodUsage.external;

import com.xworkz.ObjectMethodUsage.internal.*;

public class Runner {
    public static void main(String[] args) {
        Tyre tyre = new Tyre("Rubber", "Bus", 1000);
        Poster poster = new Poster("A4", true, 20);
        Labour labour = new Labour("Ramesh", "Banaglore", 10000);
        Cloth cloth  = new Cloth("Cotton", "Black", 10);
        Bottle bottle = new Bottle("Milton", 1, 200);
        Bucket bucket = new Bucket(10, "Orange", 180);
        Bag bag = new Bag("American Tourist", "Blue", 500);
        Chair chair = new Chair("Wood", "Brown", 1000);
        Laptop laptop = new Laptop("Hp" , 100, "I7");
        TShirt tShirt = new TShirt("XS", "White", 100);

        System.out.println("1.Tyre : "+tyre);
        System.out.println("2. Poster : "+poster);
        System.out.println("3. Labour : "+labour);
        System.out.println("4. Cloth : "+cloth);
        System.out.println("5. Bottle : "+bottle);
        System.out.println("6. Bucket : "+bucket);
        System.out.println("7. Bag : "+bag);
        System.out.println("8. Chair : "+chair);
        System.out.println("9. Laptop : "+laptop);
        System.out.println("10. TShirt : "+tShirt);
    }
}
