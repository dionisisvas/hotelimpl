package org.project.ui;

import java.util.Calendar;
import java.util.Set;

import org.project.dao.DAOFactory;
import org.project.domain.Customer;
import org.project.domain.Reservation;
import org.project.domain.Room;

public class ReservationPresenter {
	
	private ReservationView view;
	private Reservation reservation;
	private Customer customer;
	private Room currRoom;
	private boolean reservationFound;
	
	public ReservationPresenter(ReservationView reservationView) {
		this.view = reservationView;
	}

	public void initialize(Integer reservationID, ReservationView view) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	
	public void createReservation(Integer reservationID, Calendar startDate, Calendar endDate,String firstName, String lastName, String phoneNumber, String email, String address) {
		// begin-user-code
		Set<Room> freeRooms;
		
		reservation.setStartDate(startDate);
		reservation.setEndDate(endDate);
		reservation.setPaid(false);//ginetai kratisi, den exei plhrw8ei akomh
		DAOFactory.getFactory().getReservationDAO().save(reservation);//dhmiourgei nea krathsh kai pernei ID
		
		freeRooms = (Set<Room>) DAOFactory.getFactory().getRoomDAO().findFreeRooms();
		while(freeRooms.iterator().hasNext()){
			currRoom = freeRooms.iterator().next();
			view.setRoomNumber(currRoom.getRoomNumber());
			//molis epilegei ena dwmatio, allazoume to availability.logika 8a epilegei ena dwmatio apo dropbox kai 8a kalei thn changeRoomAvailability (parakatw)
		}
		//stoixeia pou pernaei ston pelath gia thn krathsh
		customer.setAddress(address);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmail(email);
		customer.setPhoneNumber(phoneNumber);
		DAOFactory.getFactory().getCustomerDAO().save(customer);//apo8hkeush pelath
		
		// end-user-code
	}
	
	public void changeRoomAvailability(){
		if(currRoom.isAvailability() == true)
			currRoom.setAvailability(false);
		else
			currRoom.setAvailability(true);
		DAOFactory.getFactory().getRoomDAO().save(currRoom);
	}
	
	public void updateReservation(Calendar startDate, Calendar endDate,String firstName, String lastName, String phoneNumber, String email, String address){
		reservation = DAOFactory.getFactory().getReservationDAO().findByID(Integer.parseInt(view.getReservationCode()));
		//customer = DAOFactory.getFactory().getCustomerDAO().findCustomer(Integer.parseInt(view.getCustomerCode()));
		
		//allagh stoixeiwn trexousas krathshs (ektos reservationID)
		reservation.setStartDate(startDate);
		reservation.setEndDate(endDate);
		reservation.isPaid();
		DAOFactory.getFactory().getReservationDAO().save(reservation);
		
		//allagh stoixeiwn pelath
		//customer.setFirstName(view.getCusFirstName());
		//customer.setLastName(view.getCusLastName());
		//customer.setAddress(view.getCusAddress());
		//customer.setEmail(view.getCusEmail());
		//customer.setPhoneNumber(view.getCusPhoneNumber());
		DAOFactory.getFactory().getCustomerDAO().save(customer);//apo8hkeush allagwn stoixeiwn pelath
	}
	
	public void deleteReservation(Integer reservationID){
		reservation = DAOFactory.getFactory().getReservationDAO().findByID(Integer.parseInt(view.getReservationCode()));
		if(reservation.getReservationID() != null){
			reservationFound = true;
			checkForReservation();
			DAOFactory.getFactory().getReservationDAO().delete(reservation);
		}
	}

	public void start() {
		view.setPresenter(this);
		view.open();     
		view.setReservatonActionEnabled(false);
    }
	
	public void cancel() {
		view.close();
    }
	
	private void checkForReservation() {
        if (reservationFound) {
            view.setReservationDeleted(true);
        } else {
            view.setReservationDeleted(false);
        }        
    }

	public Double calculateCost(Reservation currentReservation,
			ReservationView view) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	public Double calculate(Integer duration, Double pricePerDay) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
	
}
