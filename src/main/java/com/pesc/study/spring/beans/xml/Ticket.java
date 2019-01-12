package com.pesc.study.spring.beans.xml;

import java.util.Random;

public class Ticket {

    private int ticketNo = (new Random()).nextInt();

    public void printTicketNo(){
        System.out.println(ticketNo);
    }

}
