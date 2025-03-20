package ClassesAsParameters;

public class Doctor {
    public void givePrescription(Dolo650 dolo650){
        System.out.println("Runnig givePrescription in Doctor");

        if(dolo650 != null ){
            dolo650.use();
        }
        else{
            System.out.println("The value for dolo650 is null, so it can't access it's methods");
        }
    }
}
