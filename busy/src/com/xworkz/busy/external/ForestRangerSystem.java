package com.xworkz.busy.external;

import com.xworkz.busy.internal.implementor.ForestAnimalTracker;
import com.xworkz.busy.internal.rules.WildLifeTracker;

public class ForestRangerSystem {
    WildLifeTracker wildLifeTracker;

    public ForestRangerSystem(WildLifeTracker wildLifeTracker){
        this.wildLifeTracker = wildLifeTracker;
        System.out.println("wildLifeTracker-arg const of ForestRangerSystem");
    }

    public void search(){
        System.out.println("Running search in ForestRangerSystem");
        if(this.wildLifeTracker != null){
            this.wildLifeTracker.trackAnimal();
        }
    }
}
