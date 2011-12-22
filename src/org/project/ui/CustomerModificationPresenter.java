package org.project.ui;

import org.project.dao.DAOFactory;
import org.project.domain.Customer;

public class CustomerModificationPresenter {

	private CustomerModificationView view;
	
	private Customer customer;	
	
	public CustomerModificationPresenter(CustomerModificationView view, Customer customer) {
		this.view = view;
		this.customer = customer;
	}

	
	public void start() {
		view.setPresenter(this);
		view.open();
        
		view.setFirstName(customer.getFirstName());
		view.setLastName(customer.getLastName());
		view.setAddress(customer.getAddress());
		view.setPhone(customer.getPhoneNumber());
		view.setEmail(customer.getEmail());
	}
	
	public void cancel() {
		view.close();
    }
	
	public void modifyCustomer() {
		
	
		customer.setFirstName(view.getFirstName());
		customer.setLastName(view.getLastName());
		customer.setAddress(view.getAddress());
		customer.setPhoneNumber(view.getPhone());
		customer.setEmail(view.getEmail());
		
		// UPDATE PREPEI NA KANEI, OXI SAVE
		DAOFactory.getFactory().getCustomerDAO().save(customer);
		
		view.showInfo("Customer " +  customer.getFirstName() + " " +
					  customer.getLastName() + " had their profile modified.");
	}
	
	
}
