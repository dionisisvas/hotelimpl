/**
 * 
 */
package org.project.jpadao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.project.dao.CustomerDAO;
import org.project.domain.Customer;


public class CustomerJpaDAO extends GenericJpaDAO<Customer> implements
		CustomerDAO {

	@Override
	public Customer findCustomer(Integer customerID) {
		// begin-user-code
		// TODO Auto-generated method stub
		Customer customer = JPAUtil.getCurrentEntityManager().find(Customer.class, customerID);
		return customer;
		// end-user-code
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		CriteriaBuilder builder = JPAUtil.getEntityManagerFactory().getCriteriaBuilder();
		CriteriaQuery<Customer> criteria = builder.createQuery(Customer.class);
		Root<Customer> customer = criteria.from(Customer.class);
		criteria.select(customer);
		return JPAUtil.getCurrentEntityManager().createQuery(criteria).getResultList();
		//return null;
	}

}