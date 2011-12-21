package cu;

import org.project.dao.DAOFactory;
import org.project.domain.Customer;


public class CustomerPresenter {

	private CustomerView view;
	
	private Customer customer;
	private Boolean customerFound;
	
	
	public CustomerPresenter(CustomerView view) {
		this.view = view;
	}
	
	public void start() {
        view.setPresenter(this);
        view.open();
        
        view.setModifyActionEnabled(false);
        view.setRemoveActionEnabled(false);
    }
	
	public void cancel() {
        view.close();
    }
	
	public Customer findCustomer() {
        customer = DAOFactory.getFactory().getCustomerDAO().findByID(Integer.parseInt(view.getCustomerId()));
        
        if (customer == null) 
        {
            view.showError("Customer not found");
            showCustomerId("");            
            customerFound = false;            
        } 
        else 
        {
            showCustomerId(customer.getId().toString());
            customerFound = true;            
        }
        
        checkForModifyAction();
        checkForRemoveAction();
    }
	
	public void removeCustomer() {
		// DELETE???
		DAOFactory.getFactory().getCustomerDAO().deleteByID(Integer.parseInt(view.getCustomerId()));
	}
	
	
	//CHECKS
	private void checkForModifyAction() {
        if (customerFound) {
            view.setModifyActionEnabled(true);
        } else {
            view.setModifyActionEnabled(false);
        }        
    }
	
	private void checkForRemoveAction() {
        if (customerFound) {
            view.setRemoveActionEnabled(true);
        } else {
            view.setRemoveActionEnabled(false);
        }        
    }
	
	// show
	private void showCustomerId(String customerId) {
		view.setCustomerId(customerId);
	}
}
