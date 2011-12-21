package org.project.ui;

public interface PaymentView extends View {

    void setPresenter(PaymentPresenter presenter);
    
    
    String getReservationCode();

    
	void setReservationCode(String code);

	void setReservationStatus(String status);

	void setReservationCost(String cost);

	void setCalculateActionEnabled(boolean b);

	void setPaymentActionEnabled(boolean b);
       
}
