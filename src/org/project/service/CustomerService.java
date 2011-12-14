/**
 * 
 */
package org.project.service;

import static org.project.dao.DAOFactory.*;
import static org.project.domain.Customer.*;
import static org.project.dao.CustomerDAO.*;
import org.project.ui.CustomerAdministrationView;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author katsivelhsp
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public class CustomerService {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	private CustomerAdministrationView customerAdministrationView;

	/** 
	 * @return the customerAdministrationView
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public CustomerAdministrationView getCustomerAdministrationView() {
		// begin-user-code
		return customerAdministrationView;
		// end-user-code
	}

	/** 
	 * @param customerAdministrationView the customerAdministrationView to set
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void setCustomerAdministrationView(
			CustomerAdministrationView customerAdministrationView) {
		// begin-user-code
		this.customerAdministrationView = customerAdministrationView;
		// end-user-code
	}
}