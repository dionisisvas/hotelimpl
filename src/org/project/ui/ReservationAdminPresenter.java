package org.project.ui;

import java.util.List;

import org.project.dao.DAOFactory;
import org.project.domain.Customer;
import org.project.domain.Reservation;

public class ReservationAdminPresenter {
	
	private ReservationView view;
	private List<Reservation> reservation;
	private Reservation currRes;
	private Customer currCust;
	private List<Customer> customer;
	//constructor
	public ReservationAdminPresenter(ReservationView adminView) {
		this.view = adminView;
	}
	
	public void start() {
        view.setAdminPresenter(this);
        view.open();
    }
	
	public void cancel() {
        view.close();
    }
	
	public void showReservations(){
		reservation = DAOFactory.getFactory().getReservationDAO().findAll();
		customer = DAOFactory.getFactory().getCustomerDAO().findAll();
		//emfanish stoixeiwn krathshs
		int columns = 0,rows = 0;
		//reservation.iterator().remove();
		//customer.iterator().remove();
		
			while(reservation.iterator().hasNext()){
				currRes = reservation.iterator().next();
				currCust = customer.iterator().next();
				view.setReservation(currRes.getReservationID(),rows,columns);
				columns++;
				view.setStartDate(currRes.getStartDate(),rows,columns);
				columns++;
				view.setEndDate(currRes.getEndDate(),rows,columns);
				columns++;
				view.setPaid(currRes.isPaid(),rows,columns);
				columns++;
				//emfanish trexontwn stoixeiwn pelath
				view.setCusLastName(currCust.getLastName(),rows,columns);
				columns++;
				view.setCusFirstName(currCust.getFirstName(),rows,columns);
				rows++;
				columns++;
				/**
				view.setCusAddress(customer.iterator().next().getAddress());
				view.setCusEmail(customer.iterator().next().getEmail());
				view.setCusPhoneNumber(customer.iterator().next().getPhoneNumber()); */
			}
		

	}
	public int reservationsListSize(){
		reservation = DAOFactory.getFactory().getReservationDAO().findAll();
		return reservation.size();
	}
}
