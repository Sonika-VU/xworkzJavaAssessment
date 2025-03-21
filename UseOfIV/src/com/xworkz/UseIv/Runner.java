package com.xworkz.UseIv;

public class Runner {
    public static void main(String[] args) {
        Clip clip1 = new Clip("Blue");
        Clip clip2 = new Clip("Red");
        Clip clip3 = new Clip("Pink");
        Clip clip4 = new Clip("White");
        Clip clip5 = new Clip("Yellow");

        Clip[] clips = {clip1, clip2, clip3, clip4, clip5};


        Pushpa pushpa = new Pushpa(clips);
        if(pushpa != null) {
            pushpa.useClip(clips);
        }
        else System.out.println("The value of pushpa is null");

        System.out.println("==================================");

        Ticket ticket = new Ticket();

        Cricket cricket = new Cricket(ticket);
        if(cricket != null){
            cricket.watch(100);
            cricket.profit();
        }
        else System.err.println("The value of cricket is null");

        System.out.println("==================================");

        Brush brush = new Brush();
        Virat virat = new Virat(cricket, brush, ticket);

        if(virat != null){
            virat.play();
            virat.clean();
            virat.relax();
        }
        else{
            System.err.println("The value of virat is null");
        }
        System.out.println("==================================");

    }


}
