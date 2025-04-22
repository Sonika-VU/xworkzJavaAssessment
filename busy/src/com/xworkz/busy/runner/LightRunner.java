package com.xworkz.busy.runner;

import com.xworkz.busy.external.HomeLightUser;
import com.xworkz.busy.internal.implementor.PhilipsLightImpl;
import com.xworkz.busy.internal.rules.LightController;

public class LightRunner {
    public static void main(String[] args) {
        LightController lightController = new PhilipsLightImpl();
        HomeLightUser homeLightUser = new HomeLightUser(lightController);

        homeLightUser.useLight();
    }
}
