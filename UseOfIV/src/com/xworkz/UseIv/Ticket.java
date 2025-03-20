package com.xworkz.UseIv;

public class Ticket {
    TicketType ticketType;
    double cost;


    void buy(double cost){
        System.out.println("Runnig buy in Ticket");
        this.cost = cost;
        if(cost <= 200){
            System.out.println("Cost : " +this.cost);
            System.out.println("TicketType : " + TicketType.LOW);
        }
        else if(this.cost >200 && this.cost <= 500){
            System.out.println("Cost : " +this.cost);
            System.out.println("TicketType : " + TicketType.MEDIUM);
        }
        else{
            System.out.println("Cost : " +this.cost);
            System.out.println("TicketType : " + TicketType.HIGH);
        }

    }

    void sell(){
        System.out.println("Runnig sell in Ticket");
    }
}
