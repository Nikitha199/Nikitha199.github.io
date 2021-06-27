package com.exceptions.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeSerialization {

	public static void main(String[] args){
		try {
		TicketBooking tb=new TicketBooking(500,"Pandu",5,20);
		tb.showAvailableTickets(20);
	    File f=new File("ticketbooking.txt");
		
			FileOutputStream fout = new FileOutputStream(f);
			ObjectOutputStream obs=new ObjectOutputStream(fout);
			System.out.println("Writing the object into file with serialization");
			System.out.println("Object before writing into file:"+tb);
			obs.writeObject(tb);
			fout.close();
			obs.close();
			FileInputStream fis=new FileInputStream(f);
			ObjectInputStream obi=new ObjectInputStream(fis);
			System.out.println("Reading Ticket booking object from the file after serialization");
			TicketBooking tb1=(TicketBooking) obi.readObject();
			System.out.println("Ticket booking object from the file:\t"+tb1);
		    tb.showAvailableTickets(20);
			fis.close();
			obi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
