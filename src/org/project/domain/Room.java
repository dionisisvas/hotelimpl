/**
 * 
 */
package org.project.domain;

import javax.persistence.*;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author katsivelhsp
 * 
 */
@Entity
@Table(name="rooms")
public class Room {
	
	@Id
	@Column(name="roomId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roomId;

	@Enumerated(EnumType.STRING)
	@Column(name="bed")
	private BedType bed;

	@Enumerated(EnumType.STRING)
	@Column(name="type",nullable=false)
	private RoomType type;
	
	@Column(name="availabity", nullable=false)
	private boolean availability;
	
	@Column(name="pricePerDay",nullable=false)
	private Double pricePerDay;

	@Column(name="roomNumber",nullable=false)
	private Integer roomNumber;

	public Integer getRoomId() {
		return roomId;
	}
	
	public BedType getBed() {
		// begin-user-code
		return bed;
		// end-user-code
	}

	/** 
	 * @param bed the bed to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setBed(BedType bed) {
		// begin-user-code
		this.bed = bed;
		// end-user-code
	}

	/** 
	 * @return the type
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public RoomType getType() {
		// begin-user-code
		return type;
		// end-user-code
	}

	/** 
	 * @param type the type to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setType(RoomType type) {
		// begin-user-code
		this.type = type;
		// end-user-code
	}

	/** 
	 * @return the availability
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public boolean isAvailability() {
		// begin-user-code
		return availability;
		// end-user-code
	}

	/** 
	 * @param availability the availability to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setAvailability(boolean availability) {
		// begin-user-code
		this.availability = availability;
		// end-user-code
	}

	/** 
	 * @return the pricePerDay
	 * 
	 */
	public Double getPricePerDay() {
		// begin-user-code
		return pricePerDay;
		// end-user-code
	}

	/** 
	 * @param pricePerDay the pricePerDay to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setPricePerDay(Double pricePerDay) {
		// begin-user-code
		this.pricePerDay = pricePerDay;
		// end-user-code
	}


	/** 
	 * @return the roomNumber
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Integer getRoomNumber() {
		// begin-user-code
		return roomNumber;
		// end-user-code
	}

	/** 
	 * @param roomNumber the roomNumber to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setRoomNumber(Integer roomNumber) {
		// begin-user-code
		this.roomNumber = roomNumber;
		// end-user-code
	}
}