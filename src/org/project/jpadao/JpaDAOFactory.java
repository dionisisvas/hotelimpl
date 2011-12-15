/**
 * 
 */
package org.project.jpadao;

import org.project.dao.CustomerDAO;
import org.project.dao.DAOFactory;
import org.project.dao.OfferDAO;
import org.project.dao.ReservationDAO;
import org.project.dao.RoomDAO;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 */
public class JpaDAOFactory extends DAOFactory {
	/** 
	 * (non-Javadoc)
	 * @see DAOFactory#getCustomerDAO()
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Override
	public CustomerDAO getCustomerDAO() {
		// begin-user-code
		// TODO Auto-generated method stub
		return new CustomerJpaDAO();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see DAOFactory#getReservationDAO()
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Override
	public ReservationDAO getReservationDAO() {
		// begin-user-code
		// TODO Auto-generated method stub
		return new ReservationJpaDAO();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see DAOFactory#getRoomDAO()
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Override
	public RoomDAO getRoomDAO() {
		// begin-user-code
		// TODO Auto-generated method stub
		return new RoomJpaDAO();
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see DAOFactory#getOfferDAO()
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	@Override
	public OfferDAO getOfferDAO() {
		// begin-user-code
		// TODO Auto-generated method stub
		return new OfferJpaDAO();
		// end-user-code
	}
}