package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Blender;

public class KitchenBlender implements Blender {
    @Override
    public void startBlending() {
        System.out.println("Running startBlending in KitchenBlender");
    }

    @Override
    public void stopBlending() {
        System.out.println("Running stopBlending in KitchenBlender");
    }

    @Override
    public void clean() {
        System.out.println("Running clean in KitchenBlender");
    }

    @Override
    public void charge() {
        System.out.println("Running charge in KitchenBlender");
    }
}
