package org.project.ui;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Date;
import java.util.Enumeration;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
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
		jList1 = new JList(listModel);
		//listModel.addElement("a");
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				GridBagLayout thisLayout = new GridBagLayout();
				thisLayout.rowWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				thisLayout.rowHeights = new int[] {7, 7, 7, 7};
				thisLayout.columnWeights = new double[] {0.1, 0.1, 0.1, 0.1};
				thisLayout.columnWidths = new int[] {7, 7, 7, 7};
				getContentPane().setLayout(thisLayout);
				
				//ListModel jList1Model = new DefaultComboBoxModel( new String[] { "Item One", "Item Two" });
				
				jList1.setModel(listModel);
				
				jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				jList1.setSelectedIndex(0);
				jList1.setVisibleRowCount(5);
			    JScrollPane listScrollPane = new JScrollPane(jList1);
			    //jList1.addListSelectionListener(this);
				getContentPane().add(jList1, new GridBagConstraints(0, 0, 4, 2, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
				jList1.setLayout(null);
				jList1.setPreferredSize(new java.awt.Dimension(408, 49));
				
				presenter.showReservations();
				/**for (int i = 0; i<listModel.getSize();i++)
					listModel.addElement(getReservationCode(i));*/
				for(int i = 0; i < listModel.getSize(); i++){
					listModel.add(i, getReservationCode(i));
					listModel.getElementAt(i);
				}
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
				jButton1.setText("New"+listModel.getSize());
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

		// end-user-code
	}

	@Override
	public void open() {
		setVisible(true);
	}

	@Override
	public void close() {
		dispose();
	}
	
	@Override
	public void setPresenter(ReservationAdminPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public void setReservation(Integer reservationID, int index) {
			presenter.showReservations();
			listModel.add(index, reservationID);
	}

	@Override
	public String getReservationCode(int index) {
		return listModel.getElementAt(index).toString();
	}

	@Override
	public void setStartDate(Date startDate, int index) {
		//for(int i = 0; i<presenter.reservationsListSize(); i++)
			listModel.add(index,startDate);
	}
	public String getStartDate(){
		return jList1.getModel().toString();
	}

	@Override
	public void setEndDate(Date endDate, int index) {
		//for(int i = 0; i<presenter.reservationsListSize(); i++)
			listModel.add(index,endDate);
	}
	
	public String getEndDate(){
		return jList1.getModel().toString();
	}

	@Override
	public void setPaid(boolean b, int index) {
		//for(int i = 0; i<presenter.reservationsListSize(); i++)
			listModel.add(index,b);
	}
	
	public String getPaid() {
		return jList1.getModel().toString();
	}
	
	@Override
	public void setCusAddress(String address) {
		
	}

	@Override
	public void setCusFirstName(String firstName, int index) {
		//for(int i = 0; i<presenter.reservationsListSize(); i++)
			listModel.add(index,firstName);
	}

	@Override
	public void setCusLastName(String lastName, int index) {
		//for(int i = 0; i<presenter.reservationsListSize(); i++)
			listModel.add(index,lastName);
		
	}

	@Override
	public void setCusEmail(String mail) {
		
	}

	@Override
	public void setCusPhoneNumber(String phoneNumber) {

	}
	
	@Override
	public String getCusAddress() {
		return jList1.getModel().toString();		
	}

	@Override
	public String getCusFirstName() {
		return jList1.getModel().toString();
		
	}

	@Override
	public String getCusLastName() {
		return jList1.getModel().toString();
	}

	@Override
	public String getCusEmail() {
		return jList1.getModel().toString();
	}

	@Override
	public String getCusPhoneNumber() {
		return jList1.getModel().toString();		
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
	public void showError(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showInfo(String message) {
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
	public String getCustomerCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setReservationDeleted(boolean reservationFound) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAdminPresenter(ReservationAdminPresenter presenter) {
		this.presenter = presenter;
		
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

	@Override
	public void setPresenter(ReservationPresenter presenter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getReservationCode() {
		// TODO Auto-generated method stub
		return null;
	}

}
