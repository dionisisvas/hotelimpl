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
@Table(name="customers")
public class Customer {
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * 
	 */
	@Id
	@Column(name="customerId",length=200,nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerID;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Column(name="firstName",nullable=false)
	private String firstName;
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * 
	 */
	@Column(name="address",nullable=true)
	private String address;
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * 
	 */
	@Column(name="email",nullable=true)
	private String email;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * 
	 */
	@Column(name="phoneNumber",nullable=true)
	private String phoneNumber;
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * 
	 */
	@Column(name="lastName",nullable=false)
	private String lastName;
	
	
	public Customer(String firstName, String address, String email,
            String phoneNumber, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

	public Customer() {
		
	}

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
	 * @return the idNum
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Integer getId() {
		// begin-user-code
		return customerID;
		// end-user-code
	}
}