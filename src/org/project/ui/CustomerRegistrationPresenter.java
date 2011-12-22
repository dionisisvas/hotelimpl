package org.project.ui;

import org.project.dao.DAOFactory;
import org.project.domain.Customer;

public class CustomerRegistrationPresenter {

	private CustomerRegistrationView view;
	
		
	public CustomerRegistrationPresenter(CustomerRegistrationView view) {
		this.view = view;
	}

	
	public void start() {
		view.setPresenter(this);
		view.open();
    }
	
	public void cancel() {
		view.close();
    }
	
	public void registerCustomer() {
			
		Customer newCustomer = new Customer();
		
		newCustomer.setFirstName(view.getFirstName());
		newCustomer.setLastName(view.getLastName());
		newCustomer.setAddress(view.getAddress());
		newCustomer.setPhoneNumber(view.getPhone());
		newCustomer.setEmail(view.getEmail());
		
		DAOFactory.getFactory().getCustomerDAO().save(newCustomer);
		
		view.showInfo("New customer " +  newCustomer.getFirstName() + " " +
					  newCustomer.getLastName() + " has been registered.");
	}
	
	
}
