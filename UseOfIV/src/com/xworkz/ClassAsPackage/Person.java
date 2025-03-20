package ClassesAsParameters;

public class Person {
    public void sleep(Pillow pillow){
        System.out.println("Runnig sleep in Person");
        if(pillow != null){
            pillow.use();
        }
        else{
            System.out.println("The value of pillow is null, so it can't access methods");
        }
    }
}
