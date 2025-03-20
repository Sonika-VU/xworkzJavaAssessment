package ClassesAsParameters;

public class SpaceX {
    public void prepareRocket(Rocket rocket){
        System.out.println("Running prepareRocket in SpaceX");
        if(rocket != null){
            rocket.test();
        }
    }
}
