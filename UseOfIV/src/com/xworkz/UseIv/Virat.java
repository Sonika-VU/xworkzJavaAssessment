package com.xworkz.UseIv;

public class Virat {

    Clip clip;
    Brush brush;
    Ticket ticket;
    Cricket cricket;

    public Virat(Cricket cricket,Brush brush, Ticket ticket){
        this.cricket = cricket;
        this.brush = brush;
        this.ticket = ticket;

    }

    public void play(){
        System.out.println("--------------------------------");
        System.out.println("Running play in Virat");
        if(cricket != null){
            cricket.profit();
            cricket.watch(100);
        }
        else System.err.println("The value of cricket is null");
    }



    public void clean(){
        System.out.println("--------------------------------");
        System.out.println("Running clean in Virat");
        if(brush != null){
            brush.clean();
            brush.scrub();
        }
        else System.err.println("The value of brush is null");
    }

    public void relax(){
        System.out.println("--------------------------------");
        System.out.println("Running relax in Virat");
        if(ticket != null){
            ticket.buy(100);
            ticket.sell();
        }
    }
}
