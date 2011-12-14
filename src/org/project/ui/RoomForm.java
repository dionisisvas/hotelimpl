/**
 * 
 */
package org.project.ui;

import org.project.service.RoomService;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author katsivelhsp
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public class RoomForm implements RoomView {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private RoomService roomService;

	/** 
	 * @return the roomService
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public RoomService getRoomService() {
		// begin-user-code
		return roomService;
		// end-user-code
	}

	/** 
	 * @param roomService the roomService to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setRoomService(RoomService roomService) {
		// begin-user-code
		this.roomService = roomService;
		// end-user-code
	}
}