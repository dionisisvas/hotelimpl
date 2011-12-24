/**
 * 
 */
package org.project.dao;

import java.util.Set;

import org.project.domain.Room;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 */
public interface RoomDAO extends GenericDAO<Room> {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param reservationID
	 * @return
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Set<Room> findRoom(Integer reservationID);

	public Set<Room> findFreeRooms();
}