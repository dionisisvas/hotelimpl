/**
 * 
 */
package org.project.jpadao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.project.dao.OfferDAO;
import org.project.domain.Offer;
import org.project.domain.Room;
import org.project.domain.RoomType;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 */
public class OfferJpaDAO extends GenericJpaDAO<Offer> implements OfferDAO {
	@Override
	public List<Offer> findAll() {
	        CriteriaBuilder builder = JPAUtil.getEntityManagerFactory().getCriteriaBuilder();
	        CriteriaQuery<Offer> criteria = builder.createQuery( Offer.class );
	        Root<Offer> offer = criteria.from( Offer.class );
	        criteria.select(offer);
	        return JPAUtil.getCurrentEntityManager().createQuery(criteria).getResultList();     
	 }
	/** 
	 * (non-Javadoc)
	 * @see OfferDAO#findOffer(Room currResRoom, Calendar startDate, Calendar endDate)
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public Offer findOffer(RoomType type, Calendar startDate, Calendar endDate) {
		// begin-user-code
		// TODO Auto-generated method stub
		String jpql = "select o from Offer o where o.startingDate = :startDate AND o.roomType=:type AND o.endingDate=:endDate";
        Query qry = JPAUtil.getCurrentEntityManager().createQuery(jpql).setParameter("starDate", startDate).setParameter("type", type).setParameter("endDate", endDate); 
		return (Offer) qry.getSingleResult();
		// end-user-code
	}
	
	
	public List<Offer> findOfferByStartingDate(RoomType type, Calendar startDate) {
		// begin-user-code
		// TODO Auto-generated method stub
		String jpql = "select o from Offer o where o.startingDate = :startDate AND o.roomType=:type";
        Query qry = JPAUtil.getCurrentEntityManager().createQuery(jpql).setParameter("starDate", startDate).setParameter("type", type); 
		return (Offer) qry.getSingleResult();
		// end-user-code
	}
	
	
}