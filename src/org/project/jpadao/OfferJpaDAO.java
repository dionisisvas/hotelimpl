/**
 * 
 */
package org.project.jpadao;

import org.project.domain.Offer;
import org.project.dao.OfferDAO;
import org.project.domain.Room;
import java.sql.Date;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 */
public class OfferJpaDAO extends GenericJpaDAO<Offer> implements OfferDAO {

	/** 
	 * (non-Javadoc)
	 * @see OfferDAO#findOffer(Room currResRoom, Date startDate, Date endDate)
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Double findOffer(Room currResRoom, Date startDate, Date endDate) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	@Override
	public Object findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}