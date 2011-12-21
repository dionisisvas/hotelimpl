package cu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import info.clearthought.layout.TableLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class CustomerModificationJFrame extends javax.swing.JFrame implements CustomerModificationView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel descriptionJL;
	private JLabel fNameJL;
	private JLabel phoneJL;
	private JTextField phoneTF;
	private JButton modifyJB;
	private JButton cancelJB;
	private JTextField emailTF;
	private JTextField addressTF;
	private JTextField lNameTF;
	private JTextField fNameTF;
	private JLabel emailJL;
	private JLabel addressJL;
	private JLabel lNameJL;
	
	private CustomerModificationPresenter presenter;

	/**
	* Auto-generated main method to display this JFrame
	*/
		
	public CustomerModificationJFrame() {
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
				descriptionJL.setText("Customer Modification");
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
				modifyJB = new JButton();
				getContentPane().add(modifyJB, "2, 3");
				modifyJB.setText("Modify");
				
				modifyJB.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        modifyJBActionPerformed(evt);
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
	
	
	private void modifyJBActionPerformed(ActionEvent evt) {
        presenter.modifyCustomer();    
    }
	
	private void cancelJBActionPerformed(ActionEvent evt) {
        presenter.cancel();    
    }
	
	
	public String getFirstName() {
        return fNameTF.getText();       
    }
	
	public void setFirstName(String fname) {
        fNameTF.setText(fname);        
    }
	
	
	public String getLastName() {
        return lNameTF.getText();       
    }
	
	public void setLastName(String lname) {
        lNameTF.setText(lname);        
    }
	
	
	public String getAddress() {
        return addressTF.getText();       
    }
	
	public void setAddress(String address) {
        addressTF.setText(address);        
    }
	
	
	public String getPhone() {
        return phoneTF.getText();       
    }
	
	public void setPhone(String phone) {
        phoneTF.setText(phone);        
    }
	
	
	public String getEmail() {
        return emailTF.getText();       
    }
	
	public void setEmail(String email) {
        emailTF.setText(email);        
    }
	
	
	public void open() {
        setVisible(true);
    }
    
    public void close() {
        dispose();
    }
    
    
    public void setPresenter(CustomerModificationPresenter presenter) {
        this.presenter = presenter;  
    }
	
	
	public void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Library", JOptionPane.ERROR_MESSAGE); 
        
    }

    public void showInfo(String message) {
        JOptionPane.showMessageDialog(this,message,"Library", JOptionPane.INFORMATION_MESSAGE);        
    }

}
