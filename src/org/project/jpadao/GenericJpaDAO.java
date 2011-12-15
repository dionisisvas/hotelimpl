/**
 * 
 */
package org.project.jpadao;

import javax.persistence.*;
import org.project.dao.GenericDAO;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pkourtis
 */
public abstract class GenericJpaDAO<T> implements GenericDAO<T> {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public void save(Object entity) {
		// begin-user-code
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getCurrentEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(entity);
			tx.commit();
		} catch (RuntimeException ex) {
			tx.rollback();
			em.close();
			throw ex;
		}
	}
	// end-user-code

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 */
	public void delete(Object entity) {
		// begin-user-code
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getCurrentEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.remove(entity);
			tx.commit();
		} catch (RuntimeException ex) {
			tx.rollback();
			em.close();
			throw ex;
		}
		// end-user-code
	}
}