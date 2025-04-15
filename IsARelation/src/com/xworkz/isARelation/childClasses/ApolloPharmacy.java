package com.xworkz.isARelation.childClasses;

import com.xworkz.isARelation.parentClasses.Apollo;

public class ApolloPharmacy extends Apollo {
    @Override
    public void treat() {
        System.out.println("Running treat in ApolloPharmacy");
    }
}
