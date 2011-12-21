/**
 * 
 */
package org.project.service;

import java.util.Set;

import org.project.dao.DAOFactory;
import org.project.dao.ReservationDAO;
import org.project.dao.RoomDAO;
import org.project.domain.Reservation;
import org.project.domain.Room;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 */
public class ReservationService {
	private Reservation reservation;
	
	public Boolean findReservation(int reservationID){
		DAOFactory factory = DAOFactory.getFactory();
		ReservationDAO reservationDao = factory.getReservationDAO();
		reservation = reservationDao.findByID(reservationID);
		//RoomDAO roomDao = factory.getRoomDAO();
		//Set<Room> room = roomDao.findRoom(reservation.getReservationID());
		return reservation != null;
	}
	
	public void makeReservation(Reservation reservation){
		DAOFactory factory = DAOFactory.getFactory();
		ReservationDAO reservationDao = factory.getReservationDAO();
		reservationDao.save(reservation);
		
	}
}