/**
 * 
 */
package org.project.service;

import static org.project.dao.ReservationDAO.*;
import static org.project.dao.DAOFactory.*;
import static org.project.domain.Room.*;
import static org.project.domain.Customer.*;
import static org.project.dao.RoomDAO.*;
import static org.project.domain.Offer.*;
import static org.project.dao.CustomerDAO.*;
import static org.project.domain.Reservation.*;
import org.project.ui.ReservationView;
import org.project.domain.Reservation;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public class ReservationService {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private ReservationView reservationView;

	/** 
	 * @return the reservationView
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public ReservationView getReservationView() {
		// begin-user-code
		return reservationView;
		// end-user-code
	}

	/** 
	 * @param reservationView the reservationView to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setReservationView(ReservationView reservationView) {
		// begin-user-code
		this.reservationView = reservationView;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private Reservation reservation;

	/** 
	 * @return the reservation
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Reservation getReservation() {
		// begin-user-code
		return reservation;
		// end-user-code
	}

	/** 
	 * @param reservation the reservation to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setReservation(Reservation reservation) {
		// begin-user-code
		this.reservation = reservation;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param reservationID
	 * @param view
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void initialize(Integer reservationID, ReservationView view) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param currentReservation
	 * @param view
	 * @return
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Double calculateCost(Reservation currentReservation,
			ReservationView view) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param duration
	 * @param pricePerDay
	 * @return
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Double calculate(Integer duration, Double pricePerDay) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}