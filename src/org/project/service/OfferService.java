/**
 * 
 */
package org.project.service;

import static org.project.dao.DAOFactory.*;
import static org.project.dao.OfferDAO.*;
import static org.project.dao.RoomDAO.*;
import org.project.ui.OfferView;
import org.project.domain.Offer;
import java.sql.Date;
import org.project.domain.RoomType;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author katsivelhsp
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public class OfferService {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private OfferView offerView;

	/** 
	 * @return the offerView
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public OfferView getOfferView() {
		// begin-user-code
		return offerView;
		// end-user-code
	}

	/** 
	 * @param offerView the offerView to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setOfferView(OfferView offerView) {
		// begin-user-code
		this.offerView = offerView;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private Offer offer;

	/** 
	 * @return the offer
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Offer getOffer() {
		// begin-user-code
		return offer;
		// end-user-code
	}

	/** 
	 * @param offer the offer to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setOffer(Offer offer) {
		// begin-user-code
		this.offer = offer;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param view
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void initialize(OfferView view) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param startingDate
	 * @param endingDate
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void insertDates(Date startingDate, Date endingDate) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param roomType
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void insertRoomType(RoomType roomType) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param percentage
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void insertPercentage(double percentage) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param startingDate
	 * @param endingDate
	 * @param roomType
	 * @param percentage
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void createOffer(Date startingDate, Date endingDate,
			RoomType roomType, double percentage) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}