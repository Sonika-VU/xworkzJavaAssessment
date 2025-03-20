package com.xworkz.UseIv;

public class Cricket {

    Ticket ticket;

    public Cricket(Ticket ticket){
        this.ticket = ticket;
    }

    public void watch(double cost){
        System.out.println("Runnig watch in Cricket");
        if(this.ticket != null){
            ticket.buy(cost);
        }
        else System.err.println("The value of ticket is null");
    }

    public  void profit(){
        System.out.println("Running profit in Cricket");
        if(this.ticket != null){
            ticket.sell();
        }
        else System.err.println("The value of ticket is null");

    }


}
