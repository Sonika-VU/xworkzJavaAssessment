package ClassesAsParameters;

public class Isro {

    public void collectDetails(Space space){

        System.out.println("Runnig collectDetails in Isro");
        if(space == null){
            System.out.println("The value of space is null, so it can't access it's methods");
        }
        else {
            space.research();
        }
    }
}
