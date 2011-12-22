/**
 * 
 */
package org.project.dao;

import java.util.Calendar;
import java.util.List;

import org.project.domain.Offer;
import org.project.domain.RoomType;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public interface OfferDAO extends GenericDAO<Offer> {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param currResRoom
	 * @param startDate
	 * @param endDate
	 * @return
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Offer findOffer(RoomType currResRoomType, Calendar startDate, Calendar endDate);
	List <Offer> findOfferByStartingDate(RoomType type, Calendar startDate);
}