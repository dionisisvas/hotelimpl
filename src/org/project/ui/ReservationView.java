/**
 * 
 */
package org.project.ui;

import java.util.Date;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 */
public interface ReservationView extends View{
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void Initialize();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param integer
	 *
	 */
	
	void setPresenter(ReservationPresenter presenter);
	
	void setReservatonActionEnabled(boolean enabled);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void refresh();

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param totalPrice
	 */
	public void setTotalPrice(Double totalPrice);

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param msg
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void showWarning(String msg);

	public void setRoomNumber(Integer roomNum);

	public void setReservation(Integer reservationID);

	public String getReservationCode();

	public void setStartDate(Date startDate);

	public void setEndDate(Date endDate);

	public void setPaid(boolean b);

	public String setCusAddress(String address);

	public String setCusFirstName(String firstName);

	public String setCusLastName(String lastName);

	public String setCusEmail(String email);

	public String setCusPhoneNumber(String phoneNumber);

	public String getCustomerCode();

	public void setReservationDeleted(boolean reservationFound);

	public void setAdminPresenter(
			ReservationAdminPresenter reservationAdministrationView);

}