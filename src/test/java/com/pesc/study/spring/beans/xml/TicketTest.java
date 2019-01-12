package com.pesc.study.spring.beans.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-beans-xml.xml"})
public class TicketTest implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Test
    public void testSharedTicket(){
        Ticket sharedTicket = this.applicationContext.getBean("sharedTicket",Ticket.class);
        sharedTicket.printTicketNo();
        sharedTicket = this.applicationContext.getBean("sharedTicket",Ticket.class);
        sharedTicket.printTicketNo();
    }

    @Test
    public void testPersonalTicket(){
        Ticket personalTicket = this.applicationContext.getBean("personalTicket",Ticket.class);
        personalTicket.printTicketNo();
        personalTicket = this.applicationContext.getBean("personalTicket",Ticket.class);
        personalTicket.printTicketNo();
    }

}