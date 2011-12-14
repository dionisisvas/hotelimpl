/**
 * 
 */
package org.project.service;

import static org.project.domain.Room.*;
import static org.project.dao.RoomDAO.*;
import static org.project.dao.DAOFactory.*;
import static org.project.domain.Offer.*;
import static org.project.domain.Customer.*;
import static org.project.dao.ReservationDAO.*;
import org.project.ui.RoomView;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public class RoomService {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private RoomView roomView;

	/** 
	 * @return the roomView
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public RoomView getRoomView() {
		// begin-user-code
		return roomView;
		// end-user-code
	}

	/** 
	 * @param roomView the roomView to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setRoomView(RoomView roomView) {
		// begin-user-code
		this.roomView = roomView;
		// end-user-code
	}
}