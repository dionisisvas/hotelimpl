/**
 * 
 */
package org.project.ui;

import java.util.Calendar;
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
	
	void setPresenter(ReservationAdminPresenter presenter);
	
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

	public void setReservation(Integer reservationID,int index);

	public String getReservationCode();

	public void setStartDate(Calendar startDate, int index);

	public void setEndDate(Calendar endDate, int index);

	public void setPaid(boolean b, int index);

	public void setCusAddress(String address);

	public void setCusFirstName(String firstName, int index);

	public void setCusLastName(String lastName, int index);

	public void setCusEmail(String email);

	public void setCusPhoneNumber(String phoneNumber);

	public String getCustomerCode();

	public void setReservationDeleted(boolean reservationFound);

	public void setAdminPresenter(
			ReservationAdminPresenter reservationAdministrationView);

	public String getCusAddress();

	public String getCusFirstName();

	public String getCusLastName();

	public String getCusEmail();

	public String getCusPhoneNumber();

	String getReservationCode(int index);

	

}