/**
 * 
 */
package org.project.jpadao;

import org.project.domain.Room;
import org.project.dao.RoomDAO;
import java.util.SortedSet;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
 */
public class RoomJpaDAO extends GenericJpaDAO<Room> implements RoomDAO {

	/** 
	 * (non-Javadoc)
	 * @see RoomDAO#find(Integer reservationID)
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public SortedSet<Room> find(Integer reservationID) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see RoomDAO#save(Room currResRoom)
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void save(Room currResRoom) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see RoomDAO#delete()
	 * @generated "UML to JPA (com.ibm.xtools.transform.uml2.ejb3.java.jpa.internal.UML2JPATransform)"
	 */
	public void delete() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	@Override
	public Object findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Object save) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object del) {
		// TODO Auto-generated method stub

	}
}