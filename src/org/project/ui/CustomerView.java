package org.project.ui;;

public interface CustomerView extends View {

	void setPresenter(CustomerPresenter presenter);

	
	String getCustomerId();
	
	void setCustomerId(String id);
	
	
	// checks
	void setModifyActionEnabled(boolean b);

	void setRemoveActionEnabled(boolean b);
}
