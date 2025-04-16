package com.xworkz.ObjectMethodUsage.external;

import com.xworkz.ObjectMethodUsage.internal.*;
import org.w3c.dom.ranges.DocumentRange;

public class Runner {
    public static void main(String[] args) {
        Tyre tyre = new Tyre("Rubber", "Bus", 1000);
        Tyre tyre1 = new Tyre("Rubber", "Bus", 1000);

        Poster poster = new Poster("A4", true, 20);
        Poster poster1 = new Poster("A4", true, 20);

        Labour labour = new Labour("Ramesh", "Banaglore", 10000);
        Labour labour1 = new Labour("Ramesh", "Banaglore", 10000);

        Cloth cloth = new Cloth("Cotton", "Black", 10);
        Cloth cloth1 = new Cloth("Cotton", "Black", 10);

        Bottle bottle = new Bottle("Milton", 1, 200);
        Bottle bottle1 = new Bottle("Milton", 1, 200);

        Bucket bucket = new Bucket(10, "Orange", 180);
        Bucket bucket1 = new Bucket(10, "Orange", 180);

        Bag bag = new Bag("American Tourist", "Blue", 500);
        Bag bag1 = new Bag("American Tourist", "Blue", 500);

        Chair chair = new Chair("Wood", "Brown", 1000);
        Chair chair1 = new Chair("Wood", "Brown", 1000);

        Laptop laptop = new Laptop("Hp", 100, "I7");
        Laptop laptop1 = new Laptop("Hp", 100, "I7");

        TShirt tShirt = new TShirt("xworkz", "XS", "White", 100);
        TShirt tShirt1 = new TShirt("xworkz", "XS", "White", 100);

        LipStick lipStick = new LipStick("Mars", "Red", 300);
        LipStick lipStick1 = new LipStick("Mars", "Red", 300);

        Television television = new Television("Samsung", 32, 30000);
        Television television1 = new Television("Samsung", 32, 30000);

        Gold gold = new Gold("Chain", 10, 200000);
        Gold gold1 = new Gold("Chain", 10, 200000);

        Door door = new Door("Wooden", 3, 1);
        Door door1 = new Door("Wooden", 3, 1);

        Bangle bangle = new Bangle("Metal", 22, 100);
        Bangle bangle1 = new Bangle("Metal", 22, 100);

        Chocolate chocolate = new Chocolate("KitKat", false, 30);
        Chocolate chocolate1 = new Chocolate("KitKat", false, 30);

        Zoo zoo = new Zoo("Sri Chamarajendra Zoological Gardens", "Mysore", 100);
        Zoo zoo1 = new Zoo("Sri Chamarajendra Zoological Gardens", "Mysore", 100);

        Projector projector = new Projector("Epson", "White", 5000);
        Projector projector1 = new Projector("Epson", "White", 5000);

        Book book = new Book("A4", "Camel", 130);
        Book book1 = new Book("A4", "Camel", 130);

        Test test = new Test("Online", "22-04-2025", 100);
        Test test1 = new Test("Online", "22-04-2025", 100);

        Institute institute = new Institute("Siddarth", "Tumkur", 2000);
        Institute institute1 = new Institute("Siddarth", "Tumkur", 2000);

        Planet planet = new Planet("Earth", 1, 100000);
        Planet planet1 = new Planet("Earth", 1, 100000);

        Eagle eagle = new Eagle("Brown", 2, true);
        Eagle eagle1 = new Eagle("Brown", 2, true);

        Board board = new Board("White", 100, 180);
        Board board1 = new Board("White", 100, 180);

        Shoe shoe = new Shoe("Nike", 10, "Black");
        Shoe shoe1 = new Shoe("Nike", 10, "Black");

        Watch watch = new Watch("Sonata", "wristWatch", true);
        Watch watch1 = new Watch("Sonata", "wristWatch", true);

        Table table = new Table("Square", "Plastic", 4);
        Table table1 = new Table("Square", "Plastic", 4);

        Bike bike = new Bike("Yamaha", 100, 80);
        Bike bike1 = new Bike("Yamaha", 100, 80);

        Camera camera = new Camera("Sony", 100, 10000);
        Camera camera1 = new Camera("Sony", 100, 10000);

        Helmet helmet = new Helmet("Sport touring", "Black", true);
        Helmet helmet1 = new Helmet("Sport touring", "Black", true);

        Keyboard keyboard = new Keyboard("Dell", false, 400);
        Keyboard keyboard1 = new Keyboard("Dell", false, 400);

        Speaker speaker = new Speaker("Boat", 14, true);
        Speaker speaker1 = new Speaker("Boat", 14, true);

        Refrigerator refrigerator = new Refrigerator("Godrej", 180, true);
        Refrigerator refrigerator1 = new Refrigerator("Godrej", 180, true);

        Microwave microwave = new Microwave("Samsung", 1400, true);
        Microwave microwave1 = new Microwave("Samsung", 1400, true);

        Tablet tablet = new Tablet("iPad", 1000, 12);
        Tablet tablet1 = new Tablet("iPad", 1000, 12);

        Cup cup = new Cup("Steel", 5.5, "Silver");
        Cup cup1 = new Cup("Steel", 5.5, "Silver");

        Mirror mirror = new Mirror("Round", 10, 10);
        Mirror mirror1 = new Mirror("Round", 10, 10);

        Sofa sofa = new Sofa("Satin", 3, "Brown");
        Sofa sofa1 = new Sofa("Satin", 3, "Brown");

        Clock clock = new Clock("Wall CLock", true, "Fastrack");
        Clock clock1 = new Clock("Wall CLock", true, "Fastrack");

        Lamp lamp = new Lamp("Table lamp", 50, true);
        Lamp lamp1 = new Lamp("Table lamp", 50, true);

        Student student = new Student("Sonika", 106, 90);
        Student student1 = new Student("Sonika", 106, 90);

        City city = new City("Davanagere", "Karnataka", 900000);
        City city1 = new City("Davanagere", "Karnataka", 900000);

        Movie movie = new Movie("Orange", "RamCharan", 5);
        Movie movie1 = new Movie("Orange", "RamCharan", 5);

        Employee employee = new Employee("CS106", "CSE", 100000);
        Employee employee1 = new Employee("CS106", "CSE", 100000);

        Festival festival = new Festival("Ugadi", "March", false);
        Festival festival1 = new Festival("Ugadi", "March", false);

        Game game = new Game("Cricket", 11, true);
        Game game1 = new Game("Cricket", 11, true);

        Flight flight = new Flight("Air India", 123, false);
        Flight flight1 = new Flight("Air India", 123, false);

        Weather weather = new Weather("Bangalore", 38, "Sunny");
        Weather weather1 = new Weather("Bangalore", 38, "Sunny");

        Metro metro = new Metro("Banglore", 1000, 30);
        Metro metro1 = new Metro("Banglore", 1000, 30);

        Tile tile = new Tile("Granite", 50, true);
        Tile tile1 = new Tile("Granite", 50, true);

        Robot robot = new Robot("hand", "lifting", true);
        Robot robot1 = new Robot("hand", "lifting", true);

        Library library = new Library("Saptagiri", 1000, true);
        Library library1 = new Library("Saptagiri", 1000, true);

        Mountain mountain = new Mountain("Mullayanagiri", 1000, "Chikkamagalore");
        Mountain mountain1 = new Mountain("Mullayanagiri", 1000, "Chikkamagalore");

        Volcano volcano = new Volcano("Barren Island", "India", true);
        Volcano volcano1 = new Volcano("Barren Island", "India", true);

        Podcast podcast = new Podcast("Mahabharat", "Sudipta Bhawmik", 1000);
        Podcast podcast1 = new Podcast("Mahabharat", "Sudipta Bhawmik", 1000);

        Currency currency = new Currency("India", "Rupee", 4.5);
        Currency currency1 = new Currency("India", "Rupee", 4.5);

        Signal signal = new Signal("Bhashyam Circle", 10, true);
        Signal signal1 = new Signal("Bhashyam Circle", 10, true);

        Temple temple = new Temple("Ram Mandir", "bhashyam circle", 5);
        Temple temple1 = new Temple("Ram Mandir", "bhashyam circle", 5);

        InsurancePolicy insurancePolicy = new InsurancePolicy("Umamahesha", 100000, 10);
        InsurancePolicy insurancePolicy1 = new InsurancePolicy("Umamahesha", 100000, 10);

        FestivalEvent festivalEvent = new FestivalEvent("Holi", "Rajajinagar", "26-02-2025");
        FestivalEvent festivalEvent1 = new FestivalEvent("Holi", "Rajajinagar", "26-02-2025");

        Subscription subscription = new Subscription("Sonika", "1year", 365);
        Subscription subscription1 = new Subscription("Sonika", "1year", 365);

        Drone drone = new Drone("DJI Mini 3", 10.5, true);
        Drone drone1 = new Drone("DJI Mini 3", 10.5, true);

        Painting painting = new Painting("Ramu", "Naturistic", 2025);
        Painting painting1 = new Painting("Ramu", "Naturistic", 2025);

        Rocket rocket = new Rocket("Aaryabhat", 1000, false);
        Rocket rocket1 = new Rocket("Aaryabhat", 1000, false);

        App app = new App("Youtube", "Steve Chen", 2.0);
        App app1 = new App("Youtube", "Steve Chen", 2.0);

        Parcel parcel = new Parcel("suguna", "Sonika", 500);
        Parcel parcel1 = new Parcel("suguna", "Sonika", 500);

        Contest contest = new Contest("DKD", "Dance", 20);
        Contest contest1 = new Contest("DKD", "Dance", 20);

        Museum museum = new Museum("Vishveshwarayya", "Bangalore", 1000);
        Museum museum1 = new Museum("Vishveshwarayya", "Bangalore", 1000);

        FitnessTracker fitnessTracker = new FitnessTracker("Boat", true, 12);
        FitnessTracker fitnessTracker1 = new FitnessTracker("Boat", true, 12);

        Recipe recipe = new Recipe("Pizza", 60, true);
        Recipe recipe1 = new Recipe("Pizza", 60, true);

        Tattoo tattoo = new Tattoo("Sun", "hand", false);
        Tattoo tattoo1 = new Tattoo("Sun", "hand", false);

        Language language = new Language("English", 100000, true);
        Language language1 = new Language("English", 100000, true);

        BoardGame boardGame = new BoardGame("Chess", 2, true);
        BoardGame boardGame1 = new BoardGame("Chess", 2, true);

        Skyscraper skyscraper = new Skyscraper("Vismali", 120, "Bankok");
        Skyscraper skyscraper1 = new Skyscraper("Vismali", 120, "Bankok");

        ArtGallery artGallery = new ArtGallery("Monalisa", 1000, false);
        ArtGallery artGallery1 = new ArtGallery("Monalisa", 1000, false);

        ThemePark themePark = new ThemePark("Fun world", 12, true);
        ThemePark themePark1 = new ThemePark("Fun world", 12, true);

        Lodge lodge = new Lodge("SRS", 2, 500);
        Lodge lodge1 = new Lodge("SRS", 2, 500);

        IceCream iceCream = new IceCream("Chocolate", 40, false);
        IceCream iceCream1 = new IceCream("Chocolate", 40, false);

        Instrument instrument = new Instrument("Guitar", "Musical", false);
        Instrument instrument1 = new Instrument("Guitar", "Musical", false);

        Factory factory = new Factory("Ghandi Cotton Factory", "Cloth", "Bangalore");
        Factory factory1 = new Factory("Ghandi Cotton Factory", "Cloth", "Bangalore");

        Passport passport = new Passport("Sonika", "IND120", 2040);
        Passport passport1 = new Passport("Sonika", "IND120", 2040);

        ComicBook comicBook = new ComicBook("Sinchan : The warrior", "Sichan", 14322);
        ComicBook comicBook1 = new ComicBook("Sinchan : The warrior", "Sichan", 14322);

        Antique antique = new Antique("Crown", 200, "Italy");
        Antique antique1 = new Antique("Crown", 1000, "Italy");

        AppUpdate appUpdate = new AppUpdate("2.5", "08-04-2025", true);
        AppUpdate appUpdate1 = new AppUpdate("2.5", "08-04-2025", true);

        Capsule capsule = new Capsule("Paracetamol", "Fever", 2);
        Capsule capsule1 = new Capsule("Paracetamol", "Fever", 2);

        Map map = new Map("India", 2600, true);
        Map map1 = new Map("India", 2600, true);

        Gadget gadget = new Gadget("Noise", "earphone", 100);
        Gadget gadget1 = new Gadget("Noise", "earphone", 100);

        Award award = new Award("Best Actress", "Film", 2024);
        Award award1 = new Award("Best Actress", "Film", 2024);

        CurrencyNote currencyNote = new CurrencyNote(500, "India", false);
        CurrencyNote currencyNote1 = new CurrencyNote(500, "India", false);

        Toothbrush toothbrush = new Toothbrush("Colgate", "Red", false);
        Toothbrush toothbrush1 = new Toothbrush("Colgate", "Red", false);

        Umbrella umbrella = new Umbrella("small", "red", true);
        Umbrella umbrella1 = new Umbrella("small", "red", true);

        Backpack backpack = new Backpack("Safari", 6, true);
        Backpack backpack1 = new Backpack("Safari", 6, true);

        LunchBox lunchBox = new LunchBox("Steel", 100, true);
        LunchBox lunchBox1 = new LunchBox("Steel", 100, true);

        WashingMachine washingMachine = new WashingMachine("Samsung", 5, false);
        WashingMachine washingMachine1 = new WashingMachine("Samsung", 5, false);

        Notebook notebook = new Notebook(200, "A4", false);
        Notebook notebook1 = new Notebook(200, "A4", false);

        RemoteControl remoteControl = new RemoteControl("Car", 4, true);
        RemoteControl remoteControl1 = new RemoteControl("Car", 4, true);

        Slipper slipper = new Slipper("Bata", 6, "Leather");
        Slipper slipper1 = new Slipper("Bata", 6, "Leather");

        Soap soap = new Soap("Rexona", "Lemon", true);
        Soap soap1 = new Soap("Rexona", "Lemon", true);

        Mug mug = new Mug("Plastic", 500, true);
        Mug mug1 = new Mug("Plastic", 500, true);

        Curtain curtain = new Curtain("Silk", "Gold", true);
        Curtain curtain1 = new Curtain("Silk", "Gold", true);


        System.out.println("1. Tyre : " + tyre);
        System.out.println("Code : " + tyre.hashCode());
        System.out.println("equals : " + tyre1.equals(tyre));

        System.out.println("2. Poster : " + poster);
        System.out.println("Code : " + poster.hashCode());
        System.out.println("equals : " + poster1.equals(poster));

        System.out.println("3. Labour : " + labour);
        System.out.println("Code : " + labour.hashCode());
        System.out.println("equals : " + labour1.equals(labour));

        System.out.println("4. Cloth : " + cloth);
        System.out.println("Code : " + cloth.hashCode());
        System.out.println("equals : " + cloth1.equals(cloth));

        System.out.println("5. Bottle : " + bottle);
        System.out.println("Code : " + bottle.hashCode());
        System.out.println("equals : " + bottle1.equals(bottle));

        System.out.println("6. Bucket : " + bucket);
        System.out.println("Code : " + bucket.hashCode());
        System.out.println("equals : " + bucket1.equals(bucket));

        System.out.println("7. Bag : " + bag);
        System.out.println("Code : " + bag.hashCode());
        System.out.println("equals : " + bag1.equals(bag));

        System.out.println("8. Chair : " + chair);
        System.out.println("Code : " + chair.hashCode());
        System.out.println("equals : " + chair1.equals(chair));

        System.out.println("9. Laptop : " + laptop);
        System.out.println("Code : " + laptop.hashCode());
        System.out.println("equals : " + laptop1.equals(laptop));

        System.out.println("10. TShirt : " + tShirt);
        System.out.println("Code : " + tShirt.hashCode());
        System.out.println("equals : " + tShirt1.equals(tShirt));

        System.out.println("11. LipStick : " + lipStick);
        System.out.println("Code : " + lipStick.hashCode());
        System.out.println("equals : " + lipStick1.equals(lipStick));

        System.out.println("12. Television : " + television);
        System.out.println("Code : " + television.hashCode());
        System.out.println("equals : " + television1.equals(television));

        System.out.println("13. Gold : " + gold);
        System.out.println("Code : " + gold.hashCode());
        System.out.println("equals : " + gold1.equals(gold));

        System.out.println("14. Door : " + door);
        System.out.println("Code : " + door.hashCode());
        System.out.println("equals : " + door1.equals(door));

        System.out.println("15. Bangle : " + bangle);
        System.out.println("Code : " + bangle.hashCode());
        System.out.println("equals : " + bangle1.equals(bangle));

        System.out.println("16. Chocolate : " + chocolate);
        System.out.println("Code : " + chocolate.hashCode());
        System.out.println("equals : " + chocolate1.equals(chocolate));

        System.out.println("17. Zoo : " + zoo);
        System.out.println("Code : " + zoo.hashCode());
        System.out.println("equals : " + zoo1.equals(zoo));

        System.out.println("18. Projector : " + projector);
        System.out.println("Code : " + projector.hashCode());
        System.out.println("equals : " + projector1.equals(projector));

        System.out.println("19. Book : " + book);
        System.out.println("Code : " + book.hashCode());
        System.out.println("equals : " + book1.equals(book));

        System.out.println("20. Test : " + test);
        System.out.println("Code : " + test.hashCode());
        System.out.println("equals : " + test1.equals(test));

        System.out.println("21. Institute : " + institute);
        System.out.println("Code : " + institute.hashCode());
        System.out.println("equals : " + institute1.equals(institute));

        System.out.println("22. Planet : " + planet);
        System.out.println("Code : " + planet.hashCode());
        System.out.println("equals : " + planet1.equals(planet));

        System.out.println("23. Eagle : " + eagle);
        System.out.println("Code : " + eagle.hashCode());
        System.out.println("equals : " + eagle1.equals(eagle));

        System.out.println("24. Board : " + board);
        System.out.println("Code : " + board.hashCode());
        System.out.println("equals : " + board1.equals(board));

        System.out.println("25. Shoe : " + shoe);
        System.out.println("Code : " + shoe.hashCode());
        System.out.println("equals : " + shoe1.equals(shoe));

        System.out.println("26. Watch : " + watch);
        System.out.println("Code : " + watch.hashCode());
        System.out.println("equals : " + watch1.equals(watch));

        System.out.println("27. Table : " + table);
        System.out.println("Code : " + tablet.hashCode());
        System.out.println("equals : " + table1.equals(table));

        System.out.println("28. Bike : " + bike);
        System.out.println("Code : " + bike.hashCode());
        System.out.println("equals : " + bike1.equals(bike));

        System.out.println("29. Camera : " + camera);
        System.out.println("Code : " + camera.hashCode());
        System.out.println("equals : " + camera1.equals(camera));

        System.out.println("30. Helmet : " + helmet);
        System.out.println("Code : " + helmet.hashCode());
        System.out.println("equals : " + helmet1.equals(helmet));

        System.out.println("31. Keyboard : " + keyboard);
        System.out.println("Code : " + keyboard.hashCode());
        System.out.println("equals : " + keyboard1.equals(keyboard));

        System.out.println("32. Speaker : " + speaker);
        System.out.println("Code : " + speaker.hashCode());
        System.out.println("equals : " + speaker1.equals(speaker));

        System.out.println("33. Refrigerator : " + refrigerator);
        System.out.println("Code : " + refrigerator.hashCode());
        System.out.println("equals : " + refrigerator1.equals(refrigerator));

        System.out.println("34. Microwave : " + microwave);
        System.out.println("Code : " + microwave.hashCode());
        System.out.println("equals : " + microwave1.equals(microwave));

        System.out.println("35. Tablet : " + tablet);
        System.out.println("Code : " + tablet.hashCode());
        System.out.println("equals : " + tablet1.equals(tablet));

        System.out.println("36. Cup : " + cup);
        System.out.println("Code : " + cup.hashCode());
        System.out.println("equals : " + cup1.equals(cup));

        System.out.println("37. Mirror: " + mirror);
        System.out.println("Code : " + mirror.hashCode());
        System.out.println("equals : " + mirror1.equals(mirror));

        System.out.println("38. Sofa : " + sofa);
        System.out.println("Code : " + sofa.hashCode());
        System.out.println("equals : " + sofa1.equals(sofa));

        System.out.println("39. Clock : " + clock);
        System.out.println("Code : " + clock.hashCode());
        System.out.println("equals : " + clock1.equals(clock));

        System.out.println("40. Lamp : " + lamp);
        System.out.println("Code : " + lamp.hashCode());
        System.out.println("equals : " + lamp1.equals(lamp));

        System.out.println("41. Student : " + student);
        System.out.println("Code : " + student.hashCode());
        System.out.println("equals : " + student1.equals(student));

        System.out.println("42. City : " + city);
        System.out.println("Code : " + city.hashCode());
        System.out.println("equals : " + city1.equals(city));

        System.out.println("43. Movie : " + movie);
        System.out.println("Code : " + movie.hashCode());
        System.out.println("equals : " + movie1.equals(movie));

        System.out.println("44. Employee : " + employee);
        System.out.println("Code : " + employee.hashCode());
        System.out.println("equals : " + employee1.equals(employee));

        System.out.println("45. Festival : " + festival);
        System.out.println("Code : " + festival.hashCode());
        System.out.println("equals : " + festival1.equals(festival));

        System.out.println("46. Game : " + game);
        System.out.println("Code : " + tyre.hashCode()); // You might want to fix this!
        System.out.println("equals : " + game1.equals(game));

        System.out.println("47. Flight : " + flight);
        System.out.println("Code : " + flight.hashCode());
        System.out.println("equals : " + flight1.equals(flight));

        System.out.println("48. Weather : " + weather);
        System.out.println("Code : " + weather.hashCode());
        System.out.println("equals : " + weather1.equals(weather));

        System.out.println("49. Metro : " + metro);
        System.out.println("Code : " + metro.hashCode());
        System.out.println("equals : " + metro1.equals(metro));

        System.out.println("50. Tile : " + tile);
        System.out.println("Code : " + tile.hashCode());
        System.out.println("equals : " + tile1.equals(tile));

        System.out.println("51. Robot : " + robot);
        System.out.println("Code : " + robot.hashCode());
        System.out.println("equals : " + robot1.equals(robot));

        System.out.println("52. Library : " + library);
        System.out.println("Code : " + library.hashCode());
        System.out.println("equals : " + library1.equals(library));

        System.out.println("53. Mountain : " + mountain);
        System.out.println("Code : " + mountain.hashCode());
        System.out.println("equals : " + mountain1.equals(mountain));

        System.out.println("54. Volcano : " + volcano);
        System.out.println("Code : " + volcano.hashCode());
        System.out.println("equals : " + volcano1.equals(volcano));

        System.out.println("55. Podcast  : " + podcast);
        System.out.println("Code : " + podcast.hashCode());
        System.out.println("equals : " + podcast1.equals(podcast));

        System.out.println("56. Currency : " + currency);
        System.out.println("Code : " + currency.hashCode());
        System.out.println("equals : " + currency1.equals(currency));

        System.out.println("57. Signal : " + signal);
        System.out.println("Code : " + signal.hashCode());
        System.out.println("equals : " + signal1.equals(signal));

        System.out.println("58. Temple :" + temple);
        System.out.println("Code : " + temple.hashCode());
        System.out.println("equals : " + temple1.equals(temple));

        System.out.println("59. InsurancePolicy : " + insurancePolicy);
        System.out.println("Code : " + insurancePolicy.hashCode());
        System.out.println("equals : " + insurancePolicy1.equals(insurancePolicy));

        System.out.println("60. FestivalEvent : " + festivalEvent);
        System.out.println("Code : " + festivalEvent.hashCode());
        System.out.println("equals : " + festivalEvent1.equals(festivalEvent));

        System.out.println("61. Subscription : " + subscription);
        System.out.println("Code : " + subscription.hashCode());
        System.out.println("equals : " + subscription1.equals(subscription));

        System.out.println("62. Drone : " + drone);
        System.out.println("Code : " + drone.hashCode());
        System.out.println("equals : " + drone1.equals(drone));

        System.out.println("63. Painting : " + painting);
        System.out.println("Code : " + painting.hashCode());
        System.out.println("equals : " + painting1.equals(painting));

        System.out.println("64. Rocket : " + rocket);
        System.out.println("Code : " + rocket.hashCode());
        System.out.println("equals : " + rocket1.equals(rocket));

        System.out.println("65. App : " + app);
        System.out.println("Code : " + app.hashCode());
        System.out.println("equals : " + app1.equals(app));

        System.out.println("66. Parcel : " + parcel);
        System.out.println("Code : " + parcel.hashCode());
        System.out.println("equals : " + parcel1.equals(parcel));

        System.out.println("67. Contest : " + contest);
        System.out.println("Code : " + contest.hashCode());
        System.out.println("equals : " + contest1.equals(contest));

        System.out.println("68. Museum : " + museum);
        System.out.println("Code : " + museum.hashCode());
        System.out.println("equals : " + museum1.equals(museum));

        System.out.println("69. FitnessTracker : " + fitnessTracker);
        System.out.println("Code : " + fitnessTracker.hashCode());
        System.out.println("equals : " + fitnessTracker1.equals(fitnessTracker));

        System.out.println("70. Recipe : " + recipe);
        System.out.println("Code : " + recipe.hashCode());
        System.out.println("equals : " + recipe1.equals(recipe));

        System.out.println("71. Tattoo : " + tattoo);
        System.out.println("Code : " + tattoo.hashCode());
        System.out.println("equals : " + tattoo1.equals(tattoo));

        System.out.println("72. Language : " + language);
        System.out.println("Code : " + language.hashCode());
        System.out.println("equals : " + language1.equals(language));

        System.out.println("73. BoardGame : " + boardGame);
        System.out.println("Code : " + boardGame.hashCode());
        System.out.println("equals : " + boardGame1.equals(boardGame));

        System.out.println("74. Skyscraper : " + skyscraper);
        System.out.println("Code : " + skyscraper.hashCode());
        System.out.println("equals : " + skyscraper1.equals(skyscraper));

        System.out.println("75. ArtGallery : " + artGallery);
        System.out.println("Code : " + artGallery.hashCode());
        System.out.println("equals : " + artGallery1.equals(artGallery));

        System.out.println("76. ThemePark : " + themePark);
        System.out.println("Code : " + themePark.hashCode());
        System.out.println("equals : " + themePark1.equals(themePark));

        System.out.println("77. Lodge : " + lodge);
        System.out.println("Code : " + lodge.hashCode());
        System.out.println("equals : " + lodge1.equals(lodge));

        System.out.println("78. IceCream : " + iceCream);
        System.out.println("Code : " + iceCream.hashCode());
        System.out.println("equals : " + iceCream1.equals(iceCream));

        System.out.println("79. Instrument : " + instrument);
        System.out.println("Code : " + instrument.hashCode());
        System.out.println("equals : " + instrument1.equals(instrument));

        System.out.println("80. Factory : " + factory);
        System.out.println("Code : " + factory.hashCode());
        System.out.println("equals : " + factory1.equals(factory));

        System.out.println("81. Passport : " + passport);
        System.out.println("Code : " + passport.hashCode());
        System.out.println("equals : " + passport1.equals(passport));

        System.out.println("82. ComicBook : " + comicBook);
        System.out.println("Code : " + comicBook.hashCode());
        System.out.println("equals : " + comicBook1.equals(comicBook));

        System.out.println("83. Antique : " + antique);
        System.out.println("Code : " + antique.hashCode());
        System.out.println("equals : " + antique.equals(antique1)); // Already written this way

        System.out.println("84. AppUpdate : " + appUpdate);
        System.out.println("Code : " + appUpdate.hashCode());
        System.out.println("equals : " + appUpdate1.equals(appUpdate));

        System.out.println("85. Capsule : " + capsule);
        System.out.println("Code : " + capsule.hashCode());
        System.out.println("equals : " + capsule1.equals(capsule));

        System.out.println("86. Map : " + map);
        System.out.println("Code : " + map.hashCode());
        System.out.println("equals : " + map1.equals(map));

        System.out.println("87. Gadget : " + gadget);
        System.out.println("Code : " + gadget.hashCode());
        System.out.println("equals : " + gadget1.equals(gadget));

        System.out.println("88. Award : " + award);
        System.out.println("Code : " + award.hashCode());
        System.out.println("equals : " + award1.equals(award));

        System.out.println("89. CurrencyNote : " + currencyNote);
        System.out.println("Code : " + currencyNote.hashCode());
        System.out.println("equals : " + currencyNote1.equals(currencyNote));

        System.out.println("90. Toothbrush  : " + toothbrush);
        System.out.println("Code : " + toothbrush.hashCode());
        System.out.println("equals : " + toothbrush1.equals(toothbrush));

        System.out.println("91. Umbrella : " + umbrella);
        System.out.println("Code : " + umbrella.hashCode());
        System.out.println("equals : " + umbrella1.equals(umbrella));

        System.out.println("92. Backpack : " + backpack);
        System.out.println("Code : " + backpack.hashCode());
        System.out.println("equals : " + backpack1.equals(backpack));

        System.out.println("93. LunchBox : " + lunchBox);
        System.out.println("Code : " + lunchBox.hashCode());
        System.out.println("equals : " + lunchBox1.equals(lunchBox));

        System.out.println("94. WashingMachine : " + washingMachine);
        System.out.println("Code : " + washingMachine.hashCode());
        System.out.println("equals : " + washingMachine1.equals(washingMachine));

        System.out.println("95. Notebook : " + notebook);
        System.out.println("Code : " + notebook.hashCode());
        System.out.println("equals : " + notebook1.equals(notebook));

        System.out.println("96. RemoteControl : " + remoteControl);
        System.out.println("Code : " + remoteControl.hashCode());
        System.out.println("equals : " + remoteControl1.equals(remoteControl));

        System.out.println("97. Slipper : " + slipper);
        System.out.println("Code : " + slipper.hashCode());
        System.out.println("equals : " + slipper1.equals(slipper));

        System.out.println("98. Soap : " + soap);
        System.out.println("Code : " + soap.hashCode());
        System.out.println("equals : " + soap1.equals(soap));

        System.out.println("99. Mug : " + mug);
        System.out.println("Code : " + mug.hashCode());
        System.out.println("equals : " + mug1.equals(mug));

        System.out.println("100. Curtain : " + curtain);
        System.out.println("Code : " + curtain.hashCode());
        System.out.println("equals : " + curtain1.equals(curtain));


    }
}
