/**
 * 
 */
package org.project.domain;

import java.sql.Date;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.*;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author katsivelhsp
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
@Entity
@Table(name="reservations")
public class Reservation {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private Double totalPrice;

	/** 
	 * @return the totalPrice
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Double getTotalPrice() {
		// begin-user-code
		// TODO Auto-generated method stub
		Offer offer = new Offer();
		Iterator<Room> roomIt = room.iterator();
		double totalPrice = 0.0;
		while (roomIt.hasNext())
		{
			Room curRoom = roomIt.next();
			//TODO Pros epomenh omada: curRoom.getRoomType() needs to be used
			//totalPrice -= offer.getOffer();
			//totalPrice += curRoom.getCost();
		}
		return totalPrice;
		// end-user-code
	}

	/** 
	 * @param totalPrice the totalPrice to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setTotalPrice(Double totalPrice) {
		// begin-user-code
		this.totalPrice = totalPrice;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Embedded
	private Boolean paid;

	/** 
	 * @return the paid
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Boolean isPaid() {
		// begin-user-code
		return paid;
		// end-user-code
	}

	/** 
	 * @param paid the paid to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setPaid(Boolean paid) {
		// begin-user-code
		this.paid = paid;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Temporal(TemporalType.DATE)
	@Column(name="endDate",length=200,nullable=true)
	private Date endDate;

	/** 
	 * @return the endDate
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Date getEndDate() {
		// begin-user-code
		return endDate;
		// end-user-code
	}

	/** 
	 * @param endDate the endDate to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setEndDate(Date endDate) {
		// begin-user-code
		this.endDate = endDate;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Temporal(TemporalType.DATE)
	@Column(name="startDate",length=200,nullable=true)
	private Date startDate;

	/** 
	 * @return the startDate
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Date getStartDate() {
		// begin-user-code
		return startDate;
		// end-user-code
	}

	/** 
	 * @param startDate the startDate to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setStartDate(Date startDate) {
		// begin-user-code
		this.startDate = startDate;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@ManyToOne
	@JoinColumn(name="customerId",nullable=false)
	private Customer customer;

	/** 
	 * @return the customer
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Customer getCustomer() {
		// begin-user-code
		return customer;
		// end-user-code
	}

	/** 
	 * @param customer the customer to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setCustomer(Customer customer) {
		// begin-user-code
		this.customer = customer;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@ManyToOne
	@JoinColumn(name="offerId",nullable=true)
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
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@ManyToMany
	@JoinTable(name="roomreservation", joinColumns={@JoinColumn(name="reservationId")}, inverseJoinColumns={@JoinColumn(name="roomId")})
	private Set<Room> room;

	/** 
	 * @return the room
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Set<Room> getRoom() {
		// begin-user-code
		return room;
		// end-user-code
	}

	/** 
	 * @param room the room to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setRoom(Set<Room> room) {
		// begin-user-code
		this.room = room;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private Integer reservationID;

	/** 
	 * @return the reservationID
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Id
	@Column(name="reservationId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getReservationID() {
		// begin-user-code
		return reservationID;
		// end-user-code
	}

	/** 
	 * @param reservationID the reservationID to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setReservationID(Integer reservationID) {
		// begin-user-code
		this.reservationID = reservationID;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Reservation() {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param startDate
	 * @param endDate
	 * @return
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Integer getDuration(java.sql.Date startDate, java.sql.Date endDate) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}
}