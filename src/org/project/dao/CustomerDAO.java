/**
 * 
 */
package org.project.dao;

import java.util.List;

import org.project.domain.Customer;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 */
public interface CustomerDAO extends GenericDAO<Customer> {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param customerID
	 * @return
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Customer findCustomer(Integer customerID);
	
	public List<Customer> findAll();

	public Customer findByID(int parseInt);

	public void deleteByID(int parseInt);

}