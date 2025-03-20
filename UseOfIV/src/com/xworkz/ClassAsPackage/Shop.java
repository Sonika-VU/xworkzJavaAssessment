package ClassesAsParameters;

public class Shop {

    public void ads(Display display) {
        System.out.println("Running ads in Shop");
        if (display == null) {
            System.out.println("The value of display is null, so it can't access methods");
        } else {
            display.run();
        }
    }
}
