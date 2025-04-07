package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.*;

public class Runner {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        Dhobi dhobi = new Dhobi();
        Artist artist = new Painter();
        PainterClient painterClient = new PainterClient();
        Factory factory = new Balloon();
        BalloonSeller balloonSeller = new BalloonSeller();
        BankAccount bankAccount  = new SavingAccount();
        AccountHolder accountHolder = new AccountHolder();
        Bank bank = new Account();
        BankEmployee bankEmployee = new BankEmployee();
        Furniture furniture = new Bed();
        BedPatient bedPatient = new BedPatient();
        Bike bike = new MountainBike();
        BikeTourist bikeTourist = new BikeTourist();
        Bird bird = new Parrot();
        BirdSanctuary birdSanctuary = new BirdSanctuary();
        Boat boat = new Sailboat();
        BoatSailer boatSailer = new BoatSailer();
        Book book = new Novel();
        NovelReader novelReader = new NovelReader();
        Camera camera = new DSLRCamera();
        Photographer photographer = new Photographer();
        Animal animal = new Cat();
        AnimalLover animalLover = new AnimalLover();
        Clothing clothing = new TShirt();
        TShirtShop tShirtShop = new TShirtShop();
        Company company = new ITComapany();
        CompanyCEO companyCEO = new CompanyCEO();
        Computer computer = new Laptop();
        ComputerUser computerUser = new ComputerUser();
        CreditCard creditCard = new VisaCard();
        InternationTourist internationTourist = new InternationTourist();
        Animal animal1 = new Deer();
        Zoo zoo = new Zoo();
        Dog dog = new BeagleDog();
        DogCareTaker dogCareTaker = new DogCareTaker();
        Door door = new WoodenDoor();
        Carpenter carpenter = new Carpenter();
        Employee employee = new Manager();
        Infosys infosys = new Infosys();

        System.out.println("=====================================");
        dhobi.cleanClothes(washingMachine);
        System.out.println("=====================================");
        painterClient.buyPaint(artist);
        System.out.println("=====================================");
        balloonSeller.sell(factory);
        System.out.println("=====================================");
        accountHolder.getAccDetails(bankAccount);
        System.out.println("=====================================");
        bankEmployee.work(bank);
        System.out.println("=====================================");
        bedPatient.takeRest(furniture);
        System.out.println("=====================================");
        bikeTourist.climbMountain(bike);
        System.out.println("=====================================");
        birdSanctuary.shelterBirds(bird);
        System.out.println("=====================================");
        boatSailer.sail(boat);
        System.out.println("=====================================");
        novelReader.read(book);
        System.out.println("=====================================");
        photographer.takePicture(camera);
        System.out.println("=====================================");
        animalLover.provideShelter(animal);
        System.out.println("=====================================");
        tShirtShop.sell(clothing);
        System.out.println("=====================================");
        companyCEO.runCompany(company);
        System.out.println("=====================================");
        computerUser.useComputer(computer);
        System.out.println("=====================================");
        internationTourist.rome(creditCard);
        System.out.println("=====================================");
        zoo.getAnimals(animal1);
        System.out.println("=====================================");
        dogCareTaker.takeCare(dog);
        System.out.println("=====================================");
        carpenter.makeDoor(door);
        System.out.println("=====================================");
        infosys.assignManager(employee);
        System.out.println("=====================================");


    }
}
