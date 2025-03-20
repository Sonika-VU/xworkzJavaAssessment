package ClassesAsParameters;

public class RcbFans {

    public void support(Rcb rcb){
        System.out.println("Running support in RcbFans");
        if(rcb == null){
            System.out.println("The value of rcb is null, so it can't access it's methods");
        }
        else {
            rcb.playMatch();
        }
    }
}
