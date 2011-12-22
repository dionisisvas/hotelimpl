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
public class CustomerRegistrationJFrame extends javax.swing.JFrame implements CustomerRegistrationView{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel descriptionJL;
	private JLabel fNameJL;
	private JLabel phoneJL;
	private JTextField phoneTF;
	private JButton cancelJB;
	private JButton registerJB;
	private JTextField emailTF;
	private JTextField addressTF;
	private JTextField lNameTF;
	private JTextField fNameTF;
	private JLabel emailJL;
	private JLabel addressJL;
	private JLabel lNameJL;
	
	private CustomerRegistrationPresenter presenter; 

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public CustomerRegistrationJFrame() {
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
				descriptionJL = new JLabel();
				getContentPane().add(descriptionJL, "1, 0, 2, 0");
				descriptionJL.setText("New Customer Registration");
			}
			{
				fNameJL = new JLabel();
				getContentPane().add(fNameJL, "0, 1");
				fNameJL.setText("First Name");
			}
			{
				lNameJL = new JLabel();
				getContentPane().add(lNameJL, "2, 1");
				lNameJL.setText("Last Name");
			}
			{
				addressJL = new JLabel();
				getContentPane().add(addressJL, "0, 2");
				addressJL.setText("Address");
			}
			{
				phoneJL = new JLabel();
				getContentPane().add(phoneJL, "2, 2");
				phoneJL.setText("Phone");
			}
			{
				emailJL = new JLabel();
				getContentPane().add(emailJL, "0, 3");
				emailJL.setText("e-Mail");
			}
			{
				fNameTF = new JTextField();
				getContentPane().add(fNameTF, "1, 1");
				fNameTF.setText("First Name");
			}
			{
				lNameTF = new JTextField();
				getContentPane().add(lNameTF, "3, 1");
				lNameTF.setText("Last Name");
			}
			{
				addressTF = new JTextField();
				getContentPane().add(addressTF, "1, 2");
				addressTF.setText("Address");
			}
			{
				phoneTF = new JTextField();
				getContentPane().add(phoneTF, "3, 2");
				phoneTF.setText("Phone");
			}
			{
				emailTF = new JTextField();
				getContentPane().add(emailTF, "1, 3");
				emailTF.setText("e-Mail");
			}
			{
				registerJB = new JButton();
				getContentPane().add(registerJB, "2, 3");
				registerJB.setText("Register");
				
				registerJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        registerJBActionPerformed(evt);
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
			this.setSize(400, 299);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	
	public String getFirstName() {
        return fNameTF.getText();       
    }
	
	public String getLastName() {
        return lNameTF.getText();       
    }
	
	public String getAddress() {
        return addressTF.getText();       
    }
	
	public String getPhone() {
        return phoneTF.getText();       
    }
	
	public String getEmail() {
        return emailTF.getText();       
    }
	
	private void registerJBActionPerformed(ActionEvent evt) {
        presenter.registerCustomer();    
    }

	
	private void cancelJBActionPerformed(ActionEvent evt) {
        presenter.cancel();    
    }
	
	
	public void open() {
        setVisible(true);
    }
    
    public void close() {
        dispose();
    }
    
    
    public void setPresenter(CustomerRegistrationPresenter presenter) {
        this.presenter = presenter;  
    }
	
	
	public void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Library", JOptionPane.ERROR_MESSAGE); 
        
    }

    public void showInfo(String message) {
        JOptionPane.showMessageDialog(this,message,"Library", JOptionPane.INFORMATION_MESSAGE);        
    }
}
