package com.xworkz.AccessSpecifier.internal;

import com.xworkz.AccessSpecifier.external.Kitchen;

public class TomatoRunner {
    public static void main(String[] args) {
        TomatoSeller tomatoSeller = new TomatoSeller();
        Kitchen kitchen = new Kitchen();

        tomatoSeller.sell();
        kitchen.useTomato();
    }
}
