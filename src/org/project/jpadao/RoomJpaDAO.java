/**
 * 
 */
package org.project.jpadao;

import org.project.domain.Customer;
import org.project.domain.Reservation;
import org.project.domain.Room;
import org.project.dao.RoomDAO;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public class RoomJpaDAO extends GenericJpaDAO<Room> implements RoomDAO {

	public Set<Room> findRoom(Integer reservationID) {
		// begin-user-code
		// TODO Auto-generated method stub
		Reservation reservation = JPAUtil.getCurrentEntityManager().find(Reservation.class, reservationID);
		return reservation.getRoom();
		// end-user-code
	}

	@Override
	public List<Room> findAll() {
		// begin-user-code
		// TODO Auto-generated method stub
		CriteriaBuilder builder = JPAUtil.getEntityManagerFactory().getCriteriaBuilder();
		CriteriaQuery<Room> criteria = builder.createQuery(Room.class);
		Root<Room> room = criteria.from(Room.class);
		criteria.select(room);
		return JPAUtil.getCurrentEntityManager().createQuery(criteria).getResultList();
		// end-user-code
	}

}