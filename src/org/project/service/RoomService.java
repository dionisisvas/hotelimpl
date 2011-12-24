/**
 * 
 */
package org.project.service;

import org.project.ui.RoomView;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 * 
 */
public class RoomService {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * 
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