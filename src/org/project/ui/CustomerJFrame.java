package org.project.ui;
import info.clearthought.layout.TableLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import org.project.domain.Customer;


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
public class CustomerJFrame extends javax.swing.JFrame implements CustomerView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel customerJL;
	private JLabel descriptionJL;
	
	private JButton searchJB;
	private JButton removeJB;
	private JButton modifyJB;
	private JButton registerJB;
	private JButton cancelJB;
	
	private JTextField searchTF;
	private JTextField customerTF;
	private JTextField resCodeTF;



	private CustomerPresenter presenter;
	private Customer foundCustomer;
	
	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public CustomerJFrame() {
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
				customerJL = new JLabel();
				getContentPane().add(customerJL, "0, 1");
				customerJL.setText("Customer");
			}
			{
				searchTF = new JTextField();
				getContentPane().add(searchTF, "1, 1, 2, 1");
				searchTF.setText("Search");
			}
			{
				searchJB = new JButton();
				getContentPane().add(searchJB, "3, 1");
				searchJB.setText("Search");
				
				searchJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        searchJBActionPerformed(evt);
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
			{
				registerJB = new JButton();
				getContentPane().add(registerJB, "1, 2");
				registerJB.setText("Register");
				
				registerJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        registerJBActionPerformed(evt);
                    }
                });
			}
			{
				modifyJB = new JButton();
				getContentPane().add(modifyJB, "2, 2");
				modifyJB.setText("Modify");
				
				modifyJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        modifyJBActionPerformed(evt);
                    }
                });
			}
			{
				removeJB = new JButton();
				getContentPane().add(removeJB, "3, 2");
				removeJB.setText("Remove");
				
				removeJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        removeJBActionPerformed(evt);
                    }
                });
			}
			{
				descriptionJL = new JLabel();
				getContentPane().add(descriptionJL, "1, 0, 2, 0");
				descriptionJL.setText("Customer Administration");
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	
	private void searchJBActionPerformed(ActionEvent evt) {
        foundCustomer = presenter.findCustomer();    
    }
	
	private void removeJBActionPerformed(ActionEvent evt) {
        presenter.removeCustomer();    
    }
	
	private void registerJBActionPerformed(ActionEvent evt) {
		CustomerRegistrationJFrame inst = new CustomerRegistrationJFrame();
        inst.setLocationRelativeTo(null);
        CustomerRegistrationPresenter presenter = new CustomerRegistrationPresenter(inst);
        presenter.start();    
    }
	
	private void modifyJBActionPerformed(ActionEvent evt) {
		CustomerModificationJFrame inst = new CustomerModificationJFrame();
        inst.setLocationRelativeTo(null);
        CustomerModificationPresenter presenter = new CustomerModificationPresenter(inst, foundCustomer);
        presenter.start();    
    }
	
	public void setModifyActionEnabled(boolean enabled) {
        modifyJB.setEnabled(enabled);        
    }
	
	public void setRemoveActionEnabled(boolean enabled) {
        removeJB.setEnabled(enabled);        
    }
	
	
	public String getCustomerId() {
        return customerTF.getText();
    }
	
	public void setCustomerId(String reservationCode) {
        resCodeTF.setText(reservationCode);        
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
    
    
    public void setPresenter(CustomerPresenter presenter) {
        this.presenter = presenter;  
    }
	
	
	public void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Library", JOptionPane.ERROR_MESSAGE); 
        
    }

    public void showInfo(String message) {
        JOptionPane.showMessageDialog(this,message,"Library", JOptionPane.INFORMATION_MESSAGE);        
    }

}
