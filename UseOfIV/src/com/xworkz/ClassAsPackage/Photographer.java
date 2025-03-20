package ClassesAsParameters;

public class Photographer {

    public void use(Camera camera){
        System.out.println("Running use in Photographer");
        if(camera != null ){
            camera.use();
        }
        else {
            System.out.println("The value of camera is null, so it can't access methods");
        }
    }
}
