/**
 * 
 */
package org.project.ui;

import org.project.service.CustomerService;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author katsivelhsp
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public class CustomerAdministrationForm implements CustomerAdministrationView {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private CustomerService customerService;

	/** 
	 * @return the customerService
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public CustomerService getCustomerService() {
		// begin-user-code
		return customerService;
		// end-user-code
	}

	/** 
	 * @param customerService the customerService to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setCustomerService(CustomerService customerService) {
		// begin-user-code
		this.customerService = customerService;
		// end-user-code
	}
}