/**
 * 
 */
package org.project.domain;

import javax.persistence.*;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author katsivelhsp
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
@Entity
@Table(name="customers")
public class Customer {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Column(name="firstName",nullable=false)
	private String firstName;

	/** 
	 * @return the firstName
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public String getFirstName() {
		// begin-user-code
		return firstName;
		// end-user-code
	}

	/** 
	 * @param firstName the firstName to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setFirstName(String firstName) {
		// begin-user-code
		this.firstName = firstName;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Column(name="address",nullable=true)
	private String address;

	/** 
	 * @return the address
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public String getAddress() {
		// begin-user-code
		return address;
		// end-user-code
	}

	/** 
	 * @param address the address to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setAddress(String address) {
		// begin-user-code
		this.address = address;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Column(name="email",nullable=true)
	private String email;

	/** 
	 * @return the email
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public String getEmail() {
		// begin-user-code
		return email;
		// end-user-code
	}

	/** 
	 * @param email the email to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setEmail(String email) {
		// begin-user-code
		this.email = email;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Column(name="phoneNumber",nullable=true)
	private String phoneNumber;

	/** 
	 * @return the phoneNumber
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public String getPhoneNumber() {
		// begin-user-code
		return phoneNumber;
		// end-user-code
	}

	/** 
	 * @param phoneNumber the phoneNumber to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setPhoneNumber(String phoneNumber) {
		// begin-user-code
		this.phoneNumber = phoneNumber;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Column(name="lastName",nullable=false)
	private String lastName;

	/** 
	 * @return the lastName
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public String getLastName() {
		// begin-user-code
		return lastName;
		// end-user-code
	}

	/** 
	 * @param lastName the lastName to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setLastName(String lastName) {
		// begin-user-code
		this.lastName = lastName;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Id
	@Column(name="customerId",length=200,nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerID;

	/** 
	 * @return the idNum
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Integer getId() {
		// begin-user-code
		return customerID;
		// end-user-code
	}

	/** 
	 * @param idNum the idNum to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setId(Integer id) {
		// begin-user-code
		this.customerID = id;
		// end-user-code
	}
}