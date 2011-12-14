/**
 * 
 */
package org.project.ui;

import org.project.service.ReservationService;
import org.project.domain.Reservation;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author katsivelhsp
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public class ReservationForm implements ReservationView {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private ReservationService reservationService;

	/** 
	 * @return the reservationService
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public ReservationService getReservationService() {
		// begin-user-code
		return reservationService;
		// end-user-code
	}

	/** 
	 * @param reservationService the reservationService to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setReservationService(ReservationService reservationService) {
		// begin-user-code
		this.reservationService = reservationService;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ReservationView#Initialize()
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void Initialize() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ReservationView#SetReservation(Reservation currentReservation)
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void SetReservation(Reservation currentReservation) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ReservationView#refresh()
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void refresh() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ReservationView#setTotalPrice(Double totalPrice)
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setTotalPrice(Double totalPrice) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ReservationView#showWarning(String msg)
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void showWarning(String msg) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}