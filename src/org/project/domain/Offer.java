/**
 * 
 */
package org.project.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author katsivelhsp
 * 
 */
@Entity
@Table(name="offers")
public class Offer {
	
	@Id
	@Column(name="offerId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer offerId;
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 *
	 */
	@Temporal(TemporalType.DATE)
	@Column(name="startingDate",nullable=false)
	private Calendar startingDate;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * 
	 */
	@Temporal(TemporalType.DATE)
	@Column(name="endingDate",nullable=false)
	private Calendar endingDate;
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * 
	 */
	@Column(name="percentage",nullable=false)
	private Double percentage;
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param startingDate
	 * @param endingDate
	 * @param roomType
	 * @param percentage
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Offer(Calendar startingDate, Calendar endingDate,
			double percentage, RoomType roomType) {
		// begin-user-code
		// TODO Auto-generated constructor stub
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		this.roomType = roomType;
		this.percentage = percentage;
		// end-user-code
	}

	
	public Integer getOfferId() {
		return offerId;
	}


	/** 
	 * @return the startingDate
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Calendar getStartingDate() {
		// begin-user-code
		return startingDate;
		// end-user-code
	}

	/** 
	 * @param startingDate the startingDate to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setStartingDate(Calendar startingDate) {
		// begin-user-code
		this.startingDate = startingDate;
		// end-user-code
	}


	/** 
	 * @return the endingDate
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Calendar getEndingDate() {
		// begin-user-code
		return endingDate;
		// end-user-code
	}

	/** 
	 * @param endingDate the endingDate to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setEndingDate(Calendar endingDate) {
		// begin-user-code
		this.endingDate = endingDate;
		// end-user-code
	}

	/** 
	 * @return the percentage
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Double getPercentage() {
		// begin-user-code
		return percentage;
		// end-user-code
	}

	/** 
	 * @param percentage the percentage to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setPercentage(Double percentage) {
		// begin-user-code
		this.percentage = percentage;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Enumerated(EnumType.STRING)
	@Column(name="roomType",nullable=false)
	private RoomType roomType;

	/** 
	 * @return the roomType
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public RoomType getRoomType() {
		// begin-user-code
		return roomType;
		// end-user-code
	}

	/** 
	 * @param roomType the roomType to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setRoomType(RoomType roomType) {
		// begin-user-code
		this.roomType = roomType;
		// end-user-code
	}

	
	
	
}