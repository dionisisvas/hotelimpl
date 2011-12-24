package org.project.dao;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.project.domain.BedType;
import org.project.domain.Customer;
import org.project.domain.Offer;
import org.project.domain.Reservation;
import org.project.domain.Room;
import org.project.domain.RoomType;

public abstract class Initializer  {
    
    protected abstract void eraseData();
    
    public void prepareData() {
        DAOFactory factory = DAOFactory.getFactory();
        eraseData(); 
        
        Customer cus1 = new Customer("Dionushs", 	"Vasilakos", 		  "11, dv street", "dvas@aueb.gr", "2104343434");
        Customer cus2 = new Customer("Panaghs", 	"Katsivelhs-Perakhs", "12, pk street", "pkat@aueb.gr", "2108768878");
        Customer cus3 = new Customer("Panagiwths","Kourths", 			  "13, pk street", "pkou@aueb.gr", "2105678677");
        Customer cus4 = new Customer("Giwrgos", 	"Batistatos", 		  "22, gb street", "gbat@aueb.gr", "2101213145");
        

        Room roo1 = new Room(BedType.doubleBed, RoomType.singleBed, true, 25.5, 1);
        Room roo2 = new Room(BedType.singleBed, RoomType.doubleBed, true, 25.5, 2);
        Room roo3 = new Room(BedType.doubleBed, RoomType.doubleBed, true, 37.0, 3);
        Room roo4 = new Room(BedType.singleBed, RoomType.quadrupleBed, true, 40.0, 4);
        Room roo5 = new Room(BedType.kingsizeBed, RoomType.suite, true, 75.0, 5);
        
///////
        Calendar off1Start = Calendar.getInstance(); off1Start.clear(); off1Start.set(2011, 12, 10); 
        Calendar off1End = Calendar.getInstance(); off1End.clear(); off1End.set(2011, 12, 15);
        
        Calendar off2Start = Calendar.getInstance(); off1Start.clear(); off1Start.set(2011, 12, 5); 
        Calendar off2End = Calendar.getInstance(); off1End.clear(); off1End.set(2011, 12, 11);
        
        Offer off1 = new Offer(off1Start, off1End, 0.15, RoomType.doubleBed);
        Offer off2 = new Offer(off2Start, off2End, 0.35, RoomType.singleBed);  
///////
        
        Calendar res1Start = Calendar.getInstance(); off1Start.clear(); off1Start.set(2011, 12, 16); 
        Calendar res1End = Calendar.getInstance(); off1End.clear(); off1End.set(2011, 12, 19);

    	Set<Room> res1Rooms = new HashSet<Room>();
    	res1Rooms.add(roo1);
    	res1Rooms.add(roo2);
  
        Reservation res1 = new Reservation(false, res1Start, res1End, res1Rooms, cus4);
        
        
        // save
        factory.getCustomerDAO().save(cus1);
        factory.getCustomerDAO().save(cus2);
        factory.getCustomerDAO().save(cus3);
        factory.getCustomerDAO().save(cus4);
        
        factory.getRoomDAO().save(roo1);
        factory.getRoomDAO().save(roo2);
        factory.getRoomDAO().save(roo3);
        factory.getRoomDAO().save(roo4);
        factory.getRoomDAO().save(roo5);
        
        factory.getOfferDAO().save(off1);
        factory.getOfferDAO().save(off2);
        
        factory.getReservationDAO().save(res1);

    }    
}