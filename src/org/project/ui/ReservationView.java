/**
 * 
 */
package org.project.ui;

import java.awt.event.ActionEvent;
import java.util.Calendar;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 */
public interface ReservationView extends View{
	
	public void Initialize(ActionEvent evt);


	void setReservatonActionEnabled(boolean enabled);

	public void refresh();

	public void setTotalPrice(Double totalPrice);

	public void showWarning(String msg);

	public void setRoomNumber(Integer roomNum);

	public void setReservation(Integer reservationID,int columns, int rows);

	public void setStartDate(Calendar startDate, int rows, int columns);

	public void setEndDate(Calendar endDate, int rows, int columns);

	public void setPaid(boolean b, int rows, int columns);

	public void setCusAddress(String address);

	public void setCusFirstName(String firstName, int rows, int columns);

	public void setCusLastName(String lastName, int rows, int columns);

	public void setCusEmail(String email);

	public void setCusPhoneNumber(String phoneNumber);

	public void setReservationDeleted(boolean reservationFound);

	public void setAdminPresenter(ReservationAdminPresenter presenter);

	public String getReservationCode();
	
	/**public Integer[][] getCode();

	public String getCusAddress();

	public String getCusFirstName();
	
	public String getCustomerCode();

	public String getCusLastName();

	public String getCusEmail();

	public String getCusPhoneNumber();*/

	public void setPresenter(ReservationPresenter reservationPresenter);

	

}