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
	
	public ReservationView showReservations(){
		reservation = DAOFactory.getFactory().getReservationDAO().findAll();
		customer = DAOFactory.getFactory().getCustomerDAO().findAll();
		currRes = reservation.iterator().next();
		currCust = customer.iterator().next();
		//reservation.iterator().remove();
		//customer.iterator().remove();
		//emfanish stoixeiwn krathshs
		while(reservation.iterator().hasNext()){
			view.setReservation(currRes.getReservationID());
			view.setStartDate(currRes.getStartDate());
			view.setEndDate(currRes.getEndDate());
			view.setPaid(currRes.isPaid());
			//emfanish trexontwn stoixeiwn pelath
			view.setCusLastName(currCust.getLastName());
			view.setCusFirstName(currCust.getFirstName());
			/**
			view.setCusAddress(customer.iterator().next().getAddress());
			view.setCusEmail(customer.iterator().next().getEmail());
			view.setCusPhoneNumber(customer.iterator().next().getPhoneNumber()); */
		}
		return view;
	}
}
