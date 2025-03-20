package ClassesAsParameters;

public class Barber {
    public void cutHair(Client client){
        System.out.println("Runnig cutHair in Barber");
        if(client != null){
            client.go();
        }
        else {
            System.out.println("the value for client is null, so it can't access the methods");
        }

    }
}
