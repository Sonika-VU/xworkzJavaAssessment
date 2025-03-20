package ClassesAsParameters;

import javax.print.Doc;

public class Runner {
    public static void main(String[] args) {
        Display display = new Display();
        Shop shop = new Shop();
        if(shop == null){
            System.out.println("The value for shop  is null, so it can't access it's methods");
        }
        else{
            shop.ads(display);
        }


        System.out.println("================================");

        Poster poster = new Poster();
        Theater theater = new Theater();
        if(theater == null){
            System.out.println("The value for theater  is null, so it can't access it's methods");
        }
        else{
            theater.show(poster);
        }


        System.out.println("================================");

        Rcb rcb = new Rcb();
        RcbFans rcbFans = new RcbFans();
        if(rcbFans == null){
            System.out.println("The value for rcbFans  is null, so it can't access it's methods");
        }
        else{
            rcbFans.support(rcb);
        }

        System.out.println("================================");

        Space space = new Space();
        Isro isro = new Isro();
        if(isro == null){
            System.out.println("The value for isro  is null, so it can't access it's methods");
        }
        else{
            isro.collectDetails(space);
        }

        System.out.println("================================");

        Dolo650 dolo650 = new Dolo650();
        Doctor doctor = new Doctor();
        if(doctor != null){
            doctor.givePrescription(dolo650);
        }
        else {
            System.out.println("The value of doctor is null, so it can't access it's methods");
        }
        System.out.println("================================");

        Client client = new Client();
        Barber barber = new Barber();
        if(barber != null){
            barber.cutHair(client);
        }
        else{
            System.out.println("The value of barber is null, so it can't access methods");
        }
        System.out.println("================================");

        Camera camera = new Camera();
        Photographer photographer = new Photographer();
        if(photographer != null){
            photographer.use(camera);
        }
        else{
            System.out.println("The value of photographer is null, so it can't access methods");
        }
        System.out.println("================================");

        Mango mango = new Mango();
        Seller seller = new Seller();
        if(seller != null){
            seller.sell(mango);
        }
        else{
            System.out.println("The value of seller is null, so it can't access methods");
        }
        System.out.println("================================");

        Person person = new Person();
        Pillow pillow = new Pillow();
        if(pillow != null){
            person.sleep(pillow);
        }
        else{
            System.out.println("The value of pillow is null, so it can't access methods");
        }
        System.out.println("================================");

        Rocket rocket = new Rocket();
        SpaceX spaceX = new SpaceX();
        if(spaceX != null){
            spaceX.prepareRocket(rocket);
        }
        else {
            System.out.println("The value of spaceX is null, so it can't access methods");
        }
        System.out.println("================================");


    }

}
