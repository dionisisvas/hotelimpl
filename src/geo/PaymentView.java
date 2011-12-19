package geo;

public interface PaymentView extends View {

    void setPresenter(PaymentPresenter presenter);
    
    
    String getReservationCode();

    
	void setReservationCode(String code);

	void setReservationStatus(String status);

	void setReservationDate(String date);

	void setReservationCost(String cost);


	void setCalculateActionEnabled(boolean b);

	void setPaymentActionEnabled(boolean b);
       
}
