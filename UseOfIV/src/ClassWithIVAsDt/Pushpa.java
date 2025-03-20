package ClassWithIVAsDt;

public class Pushpa {
    Clip[] clips;

    public Pushpa(Clip[] clips){
        this.clips = clips;
    }
    void useClip(Clip[] clips){
        for(Clip clip : clips){
            System.out.println("Clip color : "+clip.color);
            clip.hold();
        }
    }
}
