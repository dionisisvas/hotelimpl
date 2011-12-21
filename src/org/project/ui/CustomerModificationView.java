package cu;

public interface CustomerModificationView extends View {

    void setPresenter(CustomerModificationPresenter presenter);
	
	
    String getFirstName();
    
    void setFirstName(String firstName);
    

    String getLastName();
    
    void setLastName(String lastName);

    
    String getAddress();
    
    void setAddress(String address);
    

    String getPhone();
    
    void setPhone(String phone);

    
    String getEmail();
    
    void setEmail(String email);
    

    

    
    
}
