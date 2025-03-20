package ClassesAsParameters;

public class Theater {
    public void show(Poster poster) {
        System.out.println("Running show in Theater");
        if (poster == null) {
            System.out.println("The value of poster is null, so it can't access it's methods");
        } else {
            poster.showInfo();
        }
    }
}
