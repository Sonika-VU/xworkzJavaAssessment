package ClassesAsParameters;

public class Seller {
    public void sell(Mango mango){
        System.out.println("Runnig sell in Seller");

        if(mango != null){
            mango.eat();
        }
        else {
            System.out.println("The value of mango is null, so it can't access the methods");
        }
    }
}
