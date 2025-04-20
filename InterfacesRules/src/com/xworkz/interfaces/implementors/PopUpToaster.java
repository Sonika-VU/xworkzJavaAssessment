package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Toaster;

public class PopUpToaster implements Toaster {
    @Override
    public void insertBread() {
        System.out.println("Running insertBread in PopUpToaster");
    }

    @Override
    public void heat() {
        System.out.println("Running heat in PopUpToaster");
    }

    @Override
    public void popOut() {
        System.out.println("Running popOut in PopUpToaster");
    }


    @Override
    public void charge() {

    }
}
