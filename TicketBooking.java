package com.exceptions.demo;

import java.io.Serializable;

class TicketBooking implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ticketCost;
	private String passengerName;
	private int ticketsRemaining;
	private int noofTicketsBooked;
	
	TicketBooking() { 
		System.out.println("TicketCounter ctor....");
	}

	TicketBooking(int cost ,String name,int bookedTickets,int remainingTickets) {
    	ticketCost  = cost;
    	passengerName=name;
    	noofTicketsBooked=bookedTickets;
    	ticketsRemaining=remainingTickets;  
    	System.out.println("*****Welcome to Ticket Booking Counter*******");
    	System.out.println("Ticket Cost $"+ticketCost);
    	System.out.println("No of Tickets booked:\t"+noofTicketsBooked);
    	System.out.println("Available Tickets:\t"+ticketsRemaining);
    	System.out.println("Passenger name:\t"+passengerName);
    	
    }
	
    public int showAvailableTickets(int availableTickets) { //ACCESSOR METHOD
    	System.out.println("->TicketCounter  : "+availableTickets);
    	return availableTickets;
    	    }
    public int getTicketCost(String name,int cost) { //simulation of the DB select query
    	System.out.println("One Ticket cost for\t"+name+"\t"+cost);
    	return cost;
    }
    private int setNoofTicketsBooked(int ticketsBooked,String name) {//simulation of the DB update query
    	System.out.println(ticketsBooked+"\ttickets has been booked by\t"+name);
    	return ticketsBooked;
    }
    public synchronized void booking() {
    	int ticketsAvailable=showAvailableTickets(10);
    	int ticketCost=getTicketCost("Rani",200);
    	int bookedTickets=setNoofTicketsBooked(2,"Rani");
    	//System.out.println("*****Welcome to Ticket Booking Counter*******");
    	System.out.println("Ticket Cost $"+ticketCost);
    	System.out.println("No of Tickets booked:\t"+bookedTickets);
    	System.out.println("Available Tickets:\t"+ticketsAvailable);
    	    }
}
