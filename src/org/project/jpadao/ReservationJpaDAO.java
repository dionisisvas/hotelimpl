/**
 * 
 */
package org.project.jpadao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.project.domain.Customer;
import org.project.domain.Reservation;
import org.project.dao.ReservationDAO;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public class ReservationJpaDAO extends GenericJpaDAO<Reservation> implements
		ReservationDAO {

	@Override
	public Reservation findByID(Integer reservationID) {
		// begin-user-code
		// TODO Auto-generated method stub
		Reservation reservation = JPAUtil.getCurrentEntityManager().find(Reservation.class, reservationID);
		return reservation;
		// end-user-code
	}

	@Override
	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		CriteriaBuilder builder = JPAUtil.getEntityManagerFactory().getCriteriaBuilder();
		CriteriaQuery<Reservation> criteria = builder.createQuery(Reservation.class);
		Root<Reservation> reservation = criteria.from(Reservation.class);
		criteria.select(reservation);
		return JPAUtil.getCurrentEntityManager().createQuery(criteria).getResultList();
		//return null;
	}

}