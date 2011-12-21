package org.project.ui;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.project.service.ReservationService;


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
public class ReservationJFrame extends javax.swing.JFrame implements ReservationView {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JList jList1;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private DefaultListModel listModel;
	
	private ReservationAdminPresenter presenter;
	private ReservationService reservationService;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ReservationJFrame inst = new ReservationJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public ReservationJFrame() {
		super();
		listModel = new DefaultListModel();
	    listModel.addElement(presenter.showReservations());
		initGUI();
	}
	
	private void initGUI() {
		try {
			GridBagLayout thisLayout = new GridBagLayout();
			thisLayout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1};
			thisLayout.rowHeights = new int[] {7, 7, 7, 7};
			thisLayout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1};
			thisLayout.columnWidths = new int[] {7, 7, 7, 7};
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				//ListModel jList1Model = new DefaultComboBoxModel( new String[] { "Item One", "Item Two" });
				jList1 = new JList(listModel);
				jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				jList1.setSelectedIndex(0);
				//jList1.addListSelectionListener(this);
			    
				getContentPane().add(jList1, new GridBagConstraints(0, 0, 4, 2, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
				//jList1.setModel(jList1Model);
				jList1.setLayout(null);
				jList1.setPreferredSize(new java.awt.Dimension(408, 49));
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				jButton1.setText("New");
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				jButton2.setText("Update");
			}
			{
				jButton3 = new JButton();
				getContentPane().add(jButton3, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				jButton3.setText("Delete");
			}
			pack();
			this.setSize(827, 346);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	public void refresh() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void setTotalPrice(Double totalPrice) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public void showWarning(String msg) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		setVisible(true);
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showError(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showInfo(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPresenter(ReservationPresenter presenter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setReservatonActionEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRoomNumber(Integer roomNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setReservation(Integer reservationID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getReservationCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStartDate(Date startDate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEndDate(Date endDate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPaid(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String setCusAddress(String address) {
		return address;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String setCusFirstName(String firstName) {
		return firstName;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String setCusLastName(String lastName) {
		return lastName;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String setCusEmail(String email) {
		return email;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String setCusPhoneNumber(String phoneNumber) {
		return phoneNumber;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCustomerCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setReservationDeleted(boolean reservationFound) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAdminPresenter(
			ReservationAdminPresenter reservationAdministrationView) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Initialize() {
		// TODO Auto-generated method stub
		
	}
	public ReservationService getReservationService() {
		// begin-user-code
		return reservationService;
		// end-user-code
	}

}
