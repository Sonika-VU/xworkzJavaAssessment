package com.xworkz.RefAndVar.CountryDetails;

import com.xworkz.RefAndVar.EducationDetails.Security;

public class Runner {

    public static void main(String[] args) {
        Country country = new Country("India", "Narendra Modi", "Droupadi Murmu", "Tiranga");
        country.display();

        com.xworkz.RefAndVar.EducationDetails.Security security = new Security("Ramu", "Vijaynagar", "12", 20000);
        security.display();
    }
}
