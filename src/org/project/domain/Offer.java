/**
 * 
 */
package org.project.domain;

import java.util.Date;

import javax.persistence.*;

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
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Temporal(TemporalType.DATE)
	@Column(name="startingDate",nullable=false)
	private Date startingDate;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * 
	 */
	@Temporal(TemporalType.DATE)
	@Column(name="endingDate",nullable=false)
	private Date endingDate;
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * 
	 */
	@Column(name="percentage",nullable=false)
	private Double percentage;
	
	/** 
	 * @return the startingDate
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Date getStartingDate() {
		// begin-user-code
		return startingDate;
		// end-user-code
	}

	/** 
	 * @param startingDate the startingDate to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setStartingDate(Date startingDate) {
		// begin-user-code
		this.startingDate = startingDate;
		// end-user-code
	}


	/** 
	 * @return the endingDate
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Date getEndingDate() {
		// begin-user-code
		return endingDate;
		// end-user-code
	}

	/** 
	 * @param endingDate the endingDate to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setEndingDate(Date endingDate) {
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

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param startingDate
	 * @param endingDate
	 * @param roomType
	 * @param percentage
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Offer(Date startingDate, Date endingDate,
			RoomType roomType, double percentage) {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param percentage
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setPercentage(double percentage) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}