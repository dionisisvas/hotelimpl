package org.project.ui;

import org.project.dao.DAOFactory;
import org.project.domain.Reservation;

public class PaymentPresenter {

	private PaymentView view;
	private Reservation reservation;
	
	private Boolean reservationFound;
	private Boolean costCalculated;
	

	public PaymentPresenter(PaymentView view) {
		this.view = view;
	}
	
	public void start() {
        view.setPresenter(this);
        view.open();
        
        view.setCalculateActionEnabled(false);
        view.setPaymentActionEnabled(false);
    }
	
	public void cancel() {
        view.close();
    }
	
	public void findReservation() {
        reservation = DAOFactory.getFactory().getReservationDAO().findByID(Integer.parseInt(view.getReservationCode()));
        
        if (reservation == null) 
        {
            view.showError("Reservation not found");
            showReservation("","","");            
            reservationFound = false;            
        } 
        else 
        {
            showReservation(reservation.getReservationID().toString(), getStatus(reservation.isPaid()), "");
            reservationFound = true;            
        }
        
        checkForCalculateAction();
    }
	
	public void calculateCost() {
		showCost(reservation.getTotalPrice().toString());
		costCalculated = true;
		
		checkForPaymentAction();
	}
	
	public void pay() {
	
		// MHPWS NA ALLAZEI TO STATUS TWN DWMATIWN h apla plhrwnei xwris na exei teleiwsei h krathsh?
		reservation.setPaid(true);
		DAOFactory.getFactory().getReservationDAO().save(reservation);
		showStatus(getStatus(reservation.isPaid()));
		
	}
	
	// SHOW
	//private giati mono edw mesa 8a tis xrhsimopoiei
	private void showReservation(String code, String status, String cost) {
		view.setReservationCode(code);
		view.setReservationStatus(status);		
		view.setReservationCost(cost);
	}
	
	private void showCost(String cost) {
		view.setReservationCost(cost);
	}
	
	private void showStatus(String status) {
		view.setReservationStatus(status);
	}
	
	//CHECKS
	private void checkForCalculateAction() {
        if (reservationFound) {
            view.setCalculateActionEnabled(true);
        } else {
            view.setCalculateActionEnabled(false);
        }        
    }
	
	private void checkForPaymentAction() {
        if (reservationFound && costCalculated) {
            view.setPaymentActionEnabled(true);
        } else {
            view.setPaymentActionEnabled(false);
        }        
    }
	
	// UTIL
	// epistrefei an true , pending an false
	private String getStatus(Boolean paid)
	{
		if (paid == true)
			return "paid";
		else // paid == false
			return "pending";
	}
}
