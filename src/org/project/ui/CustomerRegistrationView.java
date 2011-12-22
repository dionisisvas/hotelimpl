package org.project.ui;;



public interface CustomerRegistrationView extends View {

    void setPresenter(CustomerRegistrationPresenter presenter);
	
	
    String getFirstName();

    String getLastName();

    String getAddress();
    
    String getPhone();

    String getEmail();

}
