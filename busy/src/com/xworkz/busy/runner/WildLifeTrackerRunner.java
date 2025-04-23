package com.xworkz.busy.runner;

import com.xworkz.busy.external.ForestRangerSystem;
import com.xworkz.busy.internal.implementor.ForestAnimalTracker;
import com.xworkz.busy.internal.rules.WildLifeTracker;

public class WildLifeTrackerRunner {
    public static void main(String[] args) {
        WildLifeTracker wildLifeTracker = new ForestAnimalTracker();
        ForestRangerSystem forestRangerSystem = new ForestRangerSystem(wildLifeTracker);

        forestRangerSystem.search();
    }
}
