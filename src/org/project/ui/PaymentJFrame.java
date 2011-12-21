package org.project.ui;
import info.clearthought.layout.TableLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class PaymentJFrame extends javax.swing.JFrame implements PaymentView {

	private static final long serialVersionUID = 1L;
	
	private JLabel codeJL;
	private JLabel reservationJL;
	private JButton searchJB;
	private JButton payJB;
	private JButton cancelJB;
	private JButton calculateJB;
	private JTextField resCostTF;
	private JTextField resStatusTF;
	private JTextField resCodeTF;
	private JTextField codeTF;

	private PaymentPresenter presenter; 
	
	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public PaymentJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			TableLayout thisLayout = new TableLayout(new double[][] {{TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL}, {TableLayout.FILL, TableLayout.FILL, TableLayout.FILL, TableLayout.FILL}});
			thisLayout.setHGap(5);
			thisLayout.setVGap(5);
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				codeJL = new JLabel();
				getContentPane().add(codeJL, "0, 0");
				codeJL.setText("Code");
			}
			{
				reservationJL = new JLabel();
				getContentPane().add(reservationJL, "0, 1");
				reservationJL.setText("Reservation");
			}
			{
				searchJB = new JButton();
				getContentPane().add(searchJB, "3, 0");
				searchJB.setText("Search");
				
				searchJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        searchJBActionPerformed(evt);
                    }
                });
			}
			{
				codeTF = new JTextField();
				getContentPane().add(codeTF, "1, 0, 2, 0");
				codeTF.setText("Reservation Code");
			}
			{
				resCodeTF = new JTextField();
				getContentPane().add(resCodeTF, "1, 1");
				resCodeTF.setText("Code");
			}
			{
				resStatusTF = new JTextField();
				getContentPane().add(resStatusTF, "2, 1");
				resStatusTF.setText("Status");
			}
			{
				resCostTF = new JTextField();
				getContentPane().add(resCostTF, "3, 1");
				resCostTF.setText("Cost");
			}
			{
				calculateJB = new JButton();
				getContentPane().add(calculateJB, "0, 3");
				calculateJB.setText("Calculate");
				
				calculateJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        calculateJBActionPerformed(evt);
                    }
                });
			}
			{
				payJB = new JButton();
				getContentPane().add(payJB, "1, 3");
				payJB.setText("Pay");
				
				payJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        payJBActionPerformed(evt);
                    }
                });
			}
			{
				cancelJB = new JButton();
				getContentPane().add(cancelJB, "3, 3");
				cancelJB.setText("Cancel");
				
				cancelJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        cancelJBActionPerformed(evt);
                    }
                });
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	// Manually generated code.
	public void open() {
        setVisible(true);
    }
    
    public void close() {
        dispose();
    }
    
    
    public void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Hotel", JOptionPane.ERROR_MESSAGE); 
        
    }

    public void showInfo(String message) {
        JOptionPane.showMessageDialog(this,message, "Hotel", JOptionPane.INFORMATION_MESSAGE);        
    }
    
    public void setCalculateActionEnabled(boolean enabled) {
        calculateJB.setEnabled(enabled);        
    }
    
    public void setPaymentActionEnabled(boolean enabled) {
        payJB.setEnabled(enabled);        
    }
    
    
	// Buttons
	private void searchJBActionPerformed(ActionEvent evt) {
        presenter.findReservation();    
    }
	
	private void calculateJBActionPerformed(ActionEvent evt) {
        presenter.calculateCost();    
    }
	
	private void payJBActionPerformed(ActionEvent evt) {
        presenter.pay();    
    }
	
	private void cancelJBActionPerformed(ActionEvent evt) {
        presenter.cancel();
    }
	
	// getters & setters
	public void setPresenter(PaymentPresenter presenter) {
        this.presenter = presenter;
        
    }
	
	
	public String getReservationCode() {
        return codeTF.getText();
    }
	
	public void setReservationCode(String reservationCode) {
        resCodeTF.setText(reservationCode);        
    }
	
	
	public void setReservationStatus(String reservationStatus) {
        resStatusTF.setText(reservationStatus);        
    }
	
	
	public void setReservationCost(String reservationCost) {
        resCostTF.setText(reservationCost);        
    }
	
	
}
